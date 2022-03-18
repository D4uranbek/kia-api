package uz.d4uranbek.kia_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author D4uranbek пт. 11:46. 18.03.2022
 */
@RestController
public class HomeController {

    @GetMapping(value = {"", "/"})
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("KIA API", HttpStatus.OK);
    }
}
