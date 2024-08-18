package com.seokchankim.training.product.mapper;

import com.seokchankim.training.product.dto.ProductDTO;
import com.seokchankim.training.product.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    public List<ProductDTO> toProductDTOList(List<ProductEntity> productEntityList);
    public ProductDTO toProductDTO(ProductEntity productEntity);
}
