package uz.d4uranbek.kia_api.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uz.d4uranbek.kia_api.dto.ModelMinPriceDto;
import uz.d4uranbek.kia_api.entity.Category;
import uz.d4uranbek.kia_api.mapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author D4uranbek пт. 11:57. 18.03.2022
 */

@Service
@RequiredArgsConstructor
public class ModelService {

    private final ModelMapper mapper;

    public ResponseEntity<List<ModelMinPriceDto>> getAll() {
        String categoriesJson = new RestTemplate()
                .getForObject("https://api.kia-motors.uz/models", String.class);

        assert categoriesJson != null;

        Type type = new TypeToken<List<Category>>() {}.getType();

        List<Category> categories = new Gson().fromJson(categoriesJson, type);

        return new ResponseEntity<>(mapper.toModelMinPriceDtoList(categories), HttpStatus.OK);
    }
}
