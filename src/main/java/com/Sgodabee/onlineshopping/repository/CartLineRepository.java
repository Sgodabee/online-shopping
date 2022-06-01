package com.Sgodabee.onlineshopping.repository;

import com.Sgodabee.onlineshopping.model.CartLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cartLineRepository")
public interface CartLineRepository extends JpaRepository<CartLine, Integer> {

    List<CartLine> findCartLineByCartId(int cartId);

    CartLine findCartLineByCartIdAndProductId(int cartId, int id);

}
