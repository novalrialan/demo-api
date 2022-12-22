package com.domain.services;

import com.domain.models.entities.Product;
import com.domain.models.repos.ProductRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@jakarta.transaction.Transactional
@RequiredArgsConstructor

public class ProductService {
  @Autowired
  private ProductRepo productRepo;

  public Product save(Product product) {
    return productRepo.save(product);
  }

  public Product findOne(Long id) {
    return productRepo.findById(id).get();
  }

  public Iterable<Product> findAll() {
    return productRepo.findAll();
  }

  public void removeOne(long id) {
    productRepo.deleteById(id);
  }

  public List<Product> findByName(String name) {
    return productRepo.findByNameContains(name);
  }
}
