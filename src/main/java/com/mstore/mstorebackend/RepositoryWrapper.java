package com.mstore.mstorebackend;

import com.mstore.mstorebackend.entity.Category;
import com.mstore.mstorebackend.repository.CategoryRepository;
import com.mstore.mstorebackend.repository.ProductRepository;
import com.mstore.mstorebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class RepositoryWrapper {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    CategoryRepository categoryRepository;
}
