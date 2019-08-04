package dev.ateam.repositories;

import org.springframework.data.repository.CrudRepository;

import dev.ateam.entities.Order;

public interface OrderRepository extends CrudRepository<Order,Integer>{

}
