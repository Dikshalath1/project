package com.infy.infycart.order.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.infycart.order.entity.ProductsOrdered;
import com.infy.infycart.order.entity.ProductsOrderedId;

public interface ProductsOrderedRepository extends CrudRepository<ProductsOrdered,ProductsOrderedId>{

	List<ProductsOrdered> findByBuyerId(Integer buyerId);
	
}
