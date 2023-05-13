package com.greycomtest.dummytest;

import com.greycomtest.dummytest.controller.ProductsController;
import com.greycomtest.dummytest.repository.ProductRepository;
import com.greycomtest.dummytest.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(DummyTestApplication.class, args);

	}

}
