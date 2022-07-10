package com.mstore.mstorebackend.dto;


import com.mstore.mstorebackend.entity.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@NoArgsConstructor
@Data
public class ProductDto {

    private long id;
    private String tittle;
    private String description;
    private int price;
    private String image;
    private int weight;
    private int stock;

    @ManyToOne
    @JoinColumn(

    )
    private Category category;

    public ProductDto(long id, String tittle, String description, int price, String image, int weight, int stock) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.price = price;
        this.image = image;
        this.weight = weight;
        this.stock = stock;
    }
}
