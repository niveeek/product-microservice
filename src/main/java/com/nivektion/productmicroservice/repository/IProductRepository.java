package com.nivektion.productmicroservice.repository;

import com.nivektion.productmicroservice.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductRepository extends MongoRepository<Product, String> {

}
