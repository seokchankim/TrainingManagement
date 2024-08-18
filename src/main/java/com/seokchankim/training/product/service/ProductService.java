package com.seokchankim.training.product.service;

import com.seokchankim.training.product.dto.ProductDTO;
import com.seokchankim.training.product.mapper.ProductMapper;
import com.seokchankim.training.product.repository.ProductRepository;
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
