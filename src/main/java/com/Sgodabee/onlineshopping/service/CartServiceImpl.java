package com.Sgodabee.onlineshopping.service;

import com.Sgodabee.onlineshopping.repository.CartRepository;
import com.Sgodabee.onlineshopping.model.Cart;
import com.Sgodabee.onlineshopping.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service("cartService")
public class CartServiceImpl implements CartService {

    @Qualifier("cartRepository")
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private HttpSession httpSession;

    @Override
    public boolean saveCart(Cart cart) {
        // TODO Auto-generated method stub
        cartRepository.saveAndFlush(cart);
        return true;
    }

    @Override
    public boolean updateCart(Cart cart) {
        // TODO Auto-generated method stub
        cartRepository.saveAndFlush(cart);
        return true;
    }

    @Override
    public Cart findCart() {
        // TODO Auto-generated method stub
        return ((UserModel) httpSession.getAttribute("userModel")).getCart();
    }

}
