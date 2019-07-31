package dev.paolella.repositories;

import org.springframework.stereotype.Repository;

import dev.paolella.entities.Users;

@Repository
public class UserRepository extends CrudRepository<Users,Integer>{

}
