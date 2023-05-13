package com.greycomtest.dummytest.service;

import com.greycomtest.dummytest.dto.ProductRequest;
import com.greycomtest.dummytest.dto.ProductResponse;
import com.greycomtest.dummytest.model.Product;
import com.greycomtest.dummytest.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;


    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {}->{} is saved!", product.getId(), product.getName());
    }

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream().map(this::toProductResponse).toList();
    }

    private ProductResponse toProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}

