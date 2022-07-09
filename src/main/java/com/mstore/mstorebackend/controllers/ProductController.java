package com.mstore.mstorebackend.controllers;


import com.mstore.mstorebackend.dto.ProductDto;
import com.mstore.mstorebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    @Autowired
    ProductService productService;

//    @RequestMapping(path = "/test",method = RequestMethod.GET)

    @GetMapping(path = "/test")
    public String test(){

        return "product test passed";
    }


}
