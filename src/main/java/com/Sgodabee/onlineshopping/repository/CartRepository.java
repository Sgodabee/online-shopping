package com.Sgodabee.onlineshopping.repository;

import com.Sgodabee.onlineshopping.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("cartRepository")
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
