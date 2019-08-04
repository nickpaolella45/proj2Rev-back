package dev.ateam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.ateam.entities.Order;
import dev.ateam.services.OrderService;

@RestController
public class OrderController {

	@Autowired
	@Qualifier("OrderServiceDATA")
	OrderService or;

	// create
	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	public Order createOrder(@RequestBody Order order) {
		return or.createOrder(order);
	}

	// read
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public List<Order> allOrders() {
		return or.getAllOrders();
	}

	@RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
	public Order getOrder(@PathVariable int id) {
		return or.getOrderById(id);
	}

	// update use the put method for updating a resource
	// put should update a resource if it exists else it will create a new associate
	@RequestMapping(value = "/orders", method = RequestMethod.PUT)
	public Order updateOrder(@RequestBody Order order) {
		return or.updateOrder(order);
	}

	// delete
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.DELETE)
	public boolean removeOrder(@PathVariable int id) {
		return or.deleteOrder(or.getOrderById(id));
	}

}
