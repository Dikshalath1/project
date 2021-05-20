package com.project.infycart.product.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.infycart.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	List<Product> findByCategory(String category);
	List<Product> findByProductname(String productname);
	public Product findByProdId(Integer prodId); 
}
