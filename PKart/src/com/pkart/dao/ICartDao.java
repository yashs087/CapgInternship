package com.pkart.dao;



import com.pkart.model.Cart;
import com.pkart.model.Product;



public interface ICartDao {
		
		void addItem(int cartId,Product product);
		
		void removeItem(int cartId,Product product);
		
		Cart viewCart(int cartId);
}
