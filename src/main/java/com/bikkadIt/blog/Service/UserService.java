package com.bikkadIt.blog.Service;

import java.util.List;

import com.bikkadIt.blog.Entity.User;
import com.bikkadIt.blog.payLods.UserDto;

public interface UserService {
	
	UserDto createUser (UserDto user);
	
	UserDto updateUser (UserDto user,Integer userId);
	
	UserDto getuserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer UserId);
	
	
	
	
	
	
		
	}
	
	
	

	
	

