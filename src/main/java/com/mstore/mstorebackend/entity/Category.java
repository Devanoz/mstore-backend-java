package com.mstore.mstorebackend.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;
    @Column
    public String image;

    @Column
    @CreationTimestamp
    public Date created_at;

    @Column
    @UpdateTimestamp
    public Date updated_at;


    public Category(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public Category() {

    }
}
