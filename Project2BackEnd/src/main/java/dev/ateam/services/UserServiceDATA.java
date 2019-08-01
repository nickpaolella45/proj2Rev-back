package dev.ateam.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.ateam.entities.Users;
import dev.ateam.repositories.UserRepository;

@Component
@Service("UserServiceDATA")
public class UserServiceDATA implements UserService{
	
	@Autowired
	UserRepository ar;

	@Override
	public Users createUser(Users user) {
		ar.save(user);
		return user;
	}

	@Override
	public Users getUserById(int id) {
		Users user = ar.findById(id).get();
		return user;
	}

	@Override
	public Users getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Users> allUsers() {
		Iterable<Users> users = ar.findAll();
		Set<Users> userset = new HashSet<Users>((Collection<? extends Users>) users);
		
		return userset;
	}

	@Override
	public Users updateUser(Users user) {
		ar.save(user);
		return user;
	}

	@Override
	public boolean deleteUser(Users user) {
		ar.delete(user);
		return true;
	}

	@Override
	public Users loginUser(Users user) {
		List<Users> theUsers= ar.findByName(user.getUsername());
		
		if(theUsers.get(0).getPassword() == user.getPassword()) {
			return theUsers.get(0);
		}
		return null;
	}

}
