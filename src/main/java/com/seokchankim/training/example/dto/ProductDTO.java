package com.seokchankim.training.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO {
    private String productId;
    private String productName;
    private Long price;
    private String category;
    private Long deliveryFee;
}
