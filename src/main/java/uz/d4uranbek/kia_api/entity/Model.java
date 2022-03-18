package uz.d4uranbek.kia_api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Model {

    private String name;

    private String url;

    private String image;

    private BigInteger minPrice;

    private int soon;

}