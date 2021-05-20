package com.infy.infycart.order.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.infycart.order.entity.Order;

public interface OrderRepository extends CrudRepository<Order,Integer>{

	List<Order> findByBuyerId(Integer buyerId);
	
}
