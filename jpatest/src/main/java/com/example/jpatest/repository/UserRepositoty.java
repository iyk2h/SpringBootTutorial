package com.example.jpatest.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoty extends JpaRepository<User, Long>{
   
}
