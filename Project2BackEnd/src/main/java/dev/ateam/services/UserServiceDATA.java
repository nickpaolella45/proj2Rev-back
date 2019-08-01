package dev.ateam.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.ateam.entities.AppUser;
import dev.ateam.repositories.UserRepository;

@Component
@Service("UserServiceDATA")
public class UserServiceDATA implements UserService{
	
	@Autowired
	UserRepository ar;

	@Override
	public AppUser createUser(AppUser user) {
		ar.save(user);
		return user;
	}

	@Override
	public AppUser getUserById(int id) {
		AppUser user = ar.findById(id).get();
		return user;
	}

	@Override
	public AppUser getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<AppUser> allUsers() {
		Iterable<AppUser> users = ar.findAll();
		Set<AppUser> userset = new HashSet<AppUser>((Collection<? extends AppUser>) users);
		
		return userset;
	}

	@Override
	public AppUser updateUser(AppUser user) {
		ar.save(user);
		return user;
	}

	@Override
	public boolean deleteUser(AppUser user) {
		ar.delete(user);
		return true;
	}

	@Override
	public AppUser loginUser(AppUser user) {
		List<AppUser> theUsers= ar.findByName(user.getUsername());
		
		if(theUsers.get(0).getPassword() == user.getPassword()) {
			return theUsers.get(0);
		}
		return null;
	}

}
