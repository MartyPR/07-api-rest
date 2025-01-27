package com.example.demo.DTO.converterDTO;

import com.example.demo.DTO.dishfood.DishfoodRequestDTO;
import com.example.demo.DTO.dishfood.DishfoodResponseDTO;
import com.example.demo.models.Dishfood;
import com.example.demo.models.Menu;
import org.springframework.stereotype.Component;

@Component
public class DishfoodConverter {
    public static Dishfood toEntity(DishfoodRequestDTO dto, Menu menu) {
        return Dishfood.builder()
                .name(dto.getName())
                .price(dto.getPrice())
                .isPopular(dto.getIsPopular())
                .menu(menu)
                .build();
    }

    public static DishfoodResponseDTO toResponseDTO(Dishfood dishfood) {
        return DishfoodResponseDTO.builder()
                .id(dishfood.getId())
                .name(dishfood.getName())
                .price(dishfood.getPrice())
                .isPopular(dishfood.getIsPopular())
                .menu(dishfood.getMenu().getName())
//                .orderList(dishfood.getOrderList() == null ? Collections.emptyList() : dishfood.getOrderList().stream()
//                        .map(Order::getId).collect(Collectors.toList()))
                        .build();
    }
}
