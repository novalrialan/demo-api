package com.domain.controllers;

import com.domain.models.entities.Product;
import com.domain.services.ProductService;
// import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductController {
  @Autowired
  private ProductService productService;

  @PostMapping
  public Product create(@RequestBody Product product) {
    return productService.save(product);
  }

  @GetMapping("/products/all")
  public Iterable<Product> findAll() {
    return productService.findAll();
  }

  @GetMapping("/{id}")
  public Product findOne(@PathVariable("id") Long id) {
    return productService.findOne(id);
  }
}
