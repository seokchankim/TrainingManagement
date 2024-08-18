package com.seokchankim.training.example.mapper;

import com.seokchankim.training.example.dto.ProductDTO;
import com.seokchankim.training.example.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    public List<ProductDTO> toProductDTOList(List<ProductEntity> productEntityList);
    public ProductDTO toProductDTO(ProductEntity productEntity);
}
