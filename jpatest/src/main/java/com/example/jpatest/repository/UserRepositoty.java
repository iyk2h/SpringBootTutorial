package com.example.jpatest.repository;

import com.example.jpatest.model.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoty extends JpaRepository<User, Long>{
}
