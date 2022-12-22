package com.domain.models.repos;

import com.domain.models.entities.Product;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
  // cara membuat custom fungtion
  List<Product> findByNameContains(String name);
}
