package dev.ateam.services;

import java.util.Set;

import dev.ateam.entities.Users;

public interface UserService {

	
	
	Users createUser(Users user);
	
	Users getUserById(int id);
	Users getUserByName(String name);
	Set<Users> allUsers();
	
	Users updateUser(Users user);
	
	boolean deleteUser(Users user);
	
	Users loginUser(Users user);
	
}
