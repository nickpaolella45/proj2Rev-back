package dev.ateam.services;

import java.util.List;


import dev.ateam.entities.Order;

public interface OrderService {

	Order createOrder(Order order);
	boolean deleteOrder(Order order);
	Order updateOrder(Order order);
	List<Order> getAllOrders();
	Order getOrderById(int id);
	
}