package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class MenuResponseDTO {
    private Long id;
    private String name;
    private List<DishfoodResponseDTO> dishfoods;
}