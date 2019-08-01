package dev.ateam.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.ateam.entities.Users;
import dev.ateam.services.UserService;

@RestController
public class UserController {
	
	// A resource is an entity/object that your api/rest service exposes
	// an example is the associates
	
	@Autowired
	@Qualifier("UserServiceDATA")
	UserService as;
	
	// create
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public Users createUser(@RequestBody Users user) {		
		return as.createUser(user);
	}
	
	//read
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public Set<Users> allUsers(){
		return as.allUsers();
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public Users getUser(@PathVariable int id) {
		return as.getUserById(id);
	}
	
	//update use the put method for updating a resource
	// put should update a resource if it exists else it will create a new associate
	@RequestMapping(value = "/users", method =RequestMethod.PUT)
	public Users updateUser(@RequestBody Users user) {
		return as.updateUser(user);
	}
	
	//delete
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public boolean removeUser(@PathVariable int id) {
		return as.deleteUser(as.getUserById(id));
	}

}
