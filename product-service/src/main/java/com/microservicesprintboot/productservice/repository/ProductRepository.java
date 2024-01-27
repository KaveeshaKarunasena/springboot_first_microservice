package com.microservicesprintboot.productservice.repository;

import com.microservicesprintboot.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
