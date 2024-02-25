package com.nivektion.productmicroservice.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
@RefreshScope
@Getter
@Setter
public class CategoryController {
  @Value("${app.testProperty}")
  private String testProperty;

  @GetMapping("testProperty")
  public String getTestProperty() {
    return this.testProperty;
  }
}
