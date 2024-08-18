package com.seokchankim.training.example.service;

import com.seokchankim.training.example.dto.ProductDTO;
import com.seokchankim.training.example.mapper.ProductMapper;
import com.seokchankim.training.example.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    /**
     * @name : retrieveAllProductList
     * @desc : 모든 상품리스트 정보를 리턴
     * @return : 모든 상품리스트 정보
     */
    public List<ProductDTO> retrieveAllProductList() {
        return productMapper.toProductDTOList(productRepository.findAll());
    }
}
