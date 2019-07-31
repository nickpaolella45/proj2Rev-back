package dev.paolella.services;

import java.util.Set;

import dev.paolella.entities.Users;

public interface UserService{

	Users loginUser(String username, String password);	
	
}
