package com.seokchankim.training.example.controller;

import com.seokchankim.training.example.dto.ProductDTO;
import com.seokchankim.training.example.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    /**
     * @name : retrieveAllProductList
     * @desc : 모든 상품리스트 정보를 리턴
     * @return : 모든 상품리스트 정보
     */
    @GetMapping(value = "prodlist")
    public List<ProductDTO> retrieveAllProductList() {
        return productService.retrieveAllProductList();
    }
}
