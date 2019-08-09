package dev.ateam.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.ateam.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order,Integer>{

	List<Order> findByStatusAndRequestDetails(String status, String requestdetails);
	//List<Order> findByOrderid(int orderId);
}
