package com.bikkadit.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
