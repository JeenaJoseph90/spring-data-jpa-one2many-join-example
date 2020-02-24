package jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
