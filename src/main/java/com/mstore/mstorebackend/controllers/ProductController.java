package com.mstore.mstorebackend.controllers;


import com.mstore.mstorebackend.dto.ProductDto;
import com.mstore.mstorebackend.entity.Product;
import com.mstore.mstorebackend.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/products")
public class ProductController {

    @Autowired
    ProductService productService;

//    @RequestMapping(path = "/test",method = RequestMethod.GET)

   @GetMapping
    public List<Product> getAllProduct(){
       List<Product> allProducts = productService.getAllProducts();

       return allProducts;

   }

   @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto){

       return productService.createProduct(productDto);
   }


}
