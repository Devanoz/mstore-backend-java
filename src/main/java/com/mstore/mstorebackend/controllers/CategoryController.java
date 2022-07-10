package com.mstore.mstorebackend.controllers;


import com.mstore.mstorebackend.dto.CategoryDto;
import com.mstore.mstorebackend.entity.Category;
import com.mstore.mstorebackend.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class    CategoryController {

    CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories(){

        return categoryService.getAllCategories();
    }

    @PostMapping
    public CategoryDto createCategory(@RequestBody CategoryDto categoryDto){
        CategoryDto category = categoryService.createCategory(categoryDto);

        return category;
    }
}
