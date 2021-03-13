package com.pkart.service;

import com.pkart.model.Cart;
import com.pkart.model.Product;

public interface ICartService {
		boolean addItem(int cartId,Product product);
	
		boolean removeItem(int cartId,Product product);
	
		Cart viewCart(int cartId);
}
