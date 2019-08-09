package dev.ateam.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dev.ateam.entities.Order;

public interface OrderRepository extends CrudRepository<Order,Integer>{

	List<Order> findBystatusAndFindByrequest_details(String status, String request_details);
	
}
