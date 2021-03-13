package com.pkart.service;

import com.pkart.dao.CartDaoImpl;
import com.pkart.dao.ICartDao;
import com.pkart.model.Cart;
import com.pkart.model.Product;

public class CartServiceImpl implements ICartService{

	
	private static ICartDao cartDao;
	
	public CartServiceImpl() {

		if (cartDao==null) {
			cartDao= new CartDaoImpl();
		}
	}

	@Override
	public boolean addItem(int cartId, Product product) {
		cartDao.addItem(cartId, product);
		Cart currentCart = cartDao.viewCart(cartId);
		if (currentCart!=null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean removeItem(int cartId, Product product) {
		cartDao.removeItem(cartId, product);
		Cart currentCart = cartDao.viewCart(cartId);
		if (currentCart!=null) {
			return true;
		}
		return false;
	}

	@Override
	public Cart viewCart(int cartId) {
		
		return cartDao.viewCart(cartId);
	}
	
	
	
	
}
