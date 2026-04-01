package com.gekika.backend.controller;

import com.gekika.backend.models.Category;
import com.gekika.backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public ResponseEntity<List<Category>> listCategories(){
        List<Category> body = categoryService.listcategories();
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Void> createCategory(@RequestBody Category category){
        if(Objects.nonNull(categoryService.findCategoryByCategoryName(category.getCategoryName()))){
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
            }
        categoryService.createCategory(category);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
