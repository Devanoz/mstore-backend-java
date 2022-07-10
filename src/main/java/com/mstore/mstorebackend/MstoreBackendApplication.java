package com.mstore.mstorebackend;

import com.mstore.mstorebackend.entity.Category;
import com.mstore.mstorebackend.entity.Product;
import com.mstore.mstorebackend.entity.User;
import com.mstore.mstorebackend.repository.ProductRepository;
import com.mstore.mstorebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

@SpringBootApplication
public class MstoreBackendApplication   {



    public static void main(String[] args) {
        SpringApplication.run(MstoreBackendApplication.class, args);
    }



}
