package com.seokchankim.training.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "tb_product_m", schema = "vuejs")
@Data
public class ProductEntity {
    @Id
    private String productId;

    private String productName;
    private Long price;
    private String category;
    private Long deliveryFee;
}
