package com.Sgodabee.onlineshopping.repository;

import com.Sgodabee.onlineshopping.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
