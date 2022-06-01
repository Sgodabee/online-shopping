package com.Sgodabee.onlineshopping.service;

import com.Sgodabee.onlineshopping.model.Cart;

public interface CartService {

    boolean saveCart(Cart cart);

    boolean updateCart(Cart cart);

    Cart findCart();

}
