package com.example.demo.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DishfoodRequestDTO {
    private String name;
    private Double price;
    private Boolean isPopular;
    private Long menuId;
}