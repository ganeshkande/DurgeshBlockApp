package com.bikkadIt.blog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadIt.blog.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	
}
