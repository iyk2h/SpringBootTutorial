package com.example.jpatest.repository;

import com.example.jpatest.JpatestApplicationTests;
import com.example.jpatest.model.entity.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTests extends JpatestApplicationTests{
    @Autowired
    private UserRepositoty userRepositoty;

    @Test
    public void create(){
        User user = new User();

        user.setAccount("test");
        user.setPassword("test");
        user.setName("onin");

        User newUser = userRepositoty.save(user);
        System.out.print(newUser);
    }

}
