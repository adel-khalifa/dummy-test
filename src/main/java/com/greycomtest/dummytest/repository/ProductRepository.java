package com.greycomtest.dummytest.repository;

import com.greycomtest.dummytest.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
