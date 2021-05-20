package com.infy.infycart.order.service;

import java.util.List;

import com.infy.infycart.order.dto.ProductsOrderedDTO;

public interface ProductsOrderedService {

	String addProduct(ProductsOrderedDTO productsOrderedDTO);

	String deleteProduct(ProductsOrderedDTO productsOrderedDTO);

	List<ProductsOrderedDTO> viewProductByBuyerId(Integer buyerId);

	List<ProductsOrderedDTO> viewProduct();

}
