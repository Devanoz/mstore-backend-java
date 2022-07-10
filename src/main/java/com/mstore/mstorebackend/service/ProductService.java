package com.mstore.mstorebackend.service;


import com.mstore.mstorebackend.dto.ProductDto;
import com.mstore.mstorebackend.entity.Product;
import com.mstore.mstorebackend.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public List<Product> getAllProducts(){

        return productRepository.findAll();
    }

    public ProductDto createProduct(ProductDto productDto){
        Product product = new Product();

        BeanUtils.copyProperties(productDto,product);

        productRepository.save(product);

        return productDto;
    }

}
