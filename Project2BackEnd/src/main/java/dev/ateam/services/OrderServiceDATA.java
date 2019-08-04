package dev.ateam.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.ateam.entities.Order;
import dev.ateam.repositories.OrderRepository;

@Component
@Service("OrderServiceDATA")
public class OrderServiceDATA implements OrderService{

	@Autowired
	OrderRepository or;
	
	@Override
	public Order createOrder(Order order) {
		or.save(order);
		return order;
	}

	@Override
	public boolean deleteOrder(Order order) {
		or.delete(order);
		return true;
	}

	@Override
	public Order updateOrder(Order order) {
		or.save(order);
		return order;
	}

	@Override
	public List<Order> getAllOrders() {
		Iterable<Order> order = or.findAll();
		List<Order> orderSet = new ArrayList<Order>((Collection<? extends Order>) order);
		
		return orderSet;
	}

	@Override
	public Order getOrderById(int id) {
		Order order = or.findById(id).get();
		return order;
	}

	
	
}
