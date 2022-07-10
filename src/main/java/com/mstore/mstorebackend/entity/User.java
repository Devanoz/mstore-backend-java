package com.mstore.mstorebackend.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column
    public String name;
    @Column
    public String email;


    @Column
    @CreationTimestamp
    public Date email_verified_at;

    @Column
    @CreationTimestamp
    public Date created_at;

    @Column
    @UpdateTimestamp
    public Date updated_at;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {

    }
}
