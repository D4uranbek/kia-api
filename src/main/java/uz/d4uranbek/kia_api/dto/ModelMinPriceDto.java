package uz.d4uranbek.kia_api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

/**
 * @author D4uranbek пт. 11:55. 18.03.2022
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModelMinPriceDto {
    private String name;
    private BigInteger minPrice;
}
