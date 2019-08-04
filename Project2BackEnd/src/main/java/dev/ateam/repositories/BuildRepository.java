package dev.ateam.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.ateam.entities.Build;

@Repository
public interface BuildRepository extends CrudRepository<Build,Integer>{

}
