package uz.d4uranbek.kia_api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.d4uranbek.kia_api.dto.ModelMinPriceDto;
import uz.d4uranbek.kia_api.service.ModelService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author D4uranbek пт. 11:46. 18.03.2022
 */
@RestController
@RequiredArgsConstructor
public class ModelController {

    private final ModelService service;

    @GetMapping(value = "/models")
    public ResponseEntity<List<ModelMinPriceDto>> getAll() {
        return service.getAll();
    }

}
