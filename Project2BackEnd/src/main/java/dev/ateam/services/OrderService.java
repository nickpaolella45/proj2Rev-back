package dev.ateam.services;

import java.util.Set;

import dev.ateam.entities.Order;

public interface OrderService {

	Order createOrder(Order order);
	boolean deleteOrder(Order order);
	Order updateOrder(Order order);
	Set<Order> getAllOrders();
	Order getOrderById(int id);
	
}