package com.mstore.mstorebackend.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;



@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String tittle;
    @Column
    public String description;
    @Column
    public int price;
    @Column
    public String image;
    @Column
    public int weight;
    @Column
    public int stock;

    @ManyToOne
    public Category category;

    @Column
    @CreationTimestamp
    public Date created_at;

    @Column
    @UpdateTimestamp
    public Date Updated_at;

    public Product(String tittle, String description, int price, String image, int weight, int stock ) {
        this.tittle = tittle;
        this.description = description;
        this.price = price;
        this.image = image;
        this.weight = weight;
        this.stock = stock;

    }

    public Product() {

    }
}
