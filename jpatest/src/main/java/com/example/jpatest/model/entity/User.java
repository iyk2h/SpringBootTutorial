package com.example.jpatest.model.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class User {
    private Long id;
    private String account;
    private String password;
    private String name;
}
