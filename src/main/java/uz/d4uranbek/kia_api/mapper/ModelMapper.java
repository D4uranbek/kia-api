package uz.d4uranbek.kia_api.mapper;

import org.springframework.stereotype.Component;
import uz.d4uranbek.kia_api.dto.ModelMinPriceDto;
import uz.d4uranbek.kia_api.entity.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * @author D4uranbek пт. 12:10. 18.03.2022
 */

@Component
public class ModelMapper {

    public List<ModelMinPriceDto> toModelMinPriceDtoList(List<Category> categories) {
        List<ModelMinPriceDto> modelMinPriceDtoList = new ArrayList<>();
        categories.forEach(category ->
                category.getModels().forEach(model -> modelMinPriceDtoList
                        .add(new ModelMinPriceDto(model.getName(), model.getMinPrice()))));
        return modelMinPriceDtoList;
    }

}
