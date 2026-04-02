package com.gekika.backend.service;

import com.gekika.backend.models.Category;
import com.gekika.backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> listcategories(){
        return categoryRepository.findAll();
    }
    public void createCategory(Category category) {
        categoryRepository.save(category);
    }
    public Optional <Category> readCategoryById(Integer categoryId) {
        return categoryRepository.findById(categoryId);
    }
    public Category readCategoryByCategoryName(String categoryName) {
        return categoryRepository.findByCategoryName(categoryName);
    }
    public void deleteCategoryById(Integer categoryId) {
        categoryRepository.deleteById(categoryId);
    }
    public void updateCategory(Integer categoryId, Category newcategory) {
        Category category = categoryRepository.findById(categoryId).get();
        category.setCategoryName(newcategory.getCategoryName());
        category.setDescription(newcategory.getDescription());
        category.setImageUrl(newcategory.getImageUrl());
        categoryRepository.save(category);
    }

}
