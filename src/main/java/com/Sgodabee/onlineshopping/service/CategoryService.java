package com.Sgodabee.onlineshopping.service;

import com.Sgodabee.onlineshopping.model.Category;

import java.util.List;

public interface CategoryService {

    String saveCategory(Category category);

    List<Category> findAllCategories();

    Category findCategoryById(Integer id);

    String deleteCategory(Integer id);

    String updateCategory(Category branch);

}
