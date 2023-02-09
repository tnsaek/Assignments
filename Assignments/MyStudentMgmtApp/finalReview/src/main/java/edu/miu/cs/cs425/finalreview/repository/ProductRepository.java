package edu.miu.cs.cs425.finalreview.repository;

import edu.miu.cs.cs425.finalreview.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
