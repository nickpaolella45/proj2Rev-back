package dev.ateam.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.ateam.entities.Users;

@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {

	List<Users> findByName(String name);
	
}
