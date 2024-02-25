package com.nivektion.productmicroservice.controller;

import java.util.List;
import com.nivektion.productmicroservice.entity.Product;
import com.nivektion.productmicroservice.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
  //MODEL
  private IProductRepository iProductRepository;

  @Autowired
  public ProductController(IProductRepository iProductRepository) {
    this.iProductRepository = iProductRepository;
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<Product> getAllProducts() {
    return iProductRepository.findAll();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void createProduct(@RequestBody Product product) {
    iProductRepository.save(product);
  }
}
