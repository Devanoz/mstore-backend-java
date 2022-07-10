package com.mstore.mstorebackend.service;


import com.mstore.mstorebackend.dto.CategoryDto;
import com.mstore.mstorebackend.entity.Category;
import com.mstore.mstorebackend.repository.CategoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;


    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public CategoryDto createCategory(CategoryDto categoryDto){
        Category category = new Category();

        BeanUtils.copyProperties(categoryDto,category);

        Category save = categoryRepository.save(category);

        BeanUtils.copyProperties(save,categoryDto);

        return categoryDto;
    }
}
