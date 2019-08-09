package dev.ateam.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	    
		order = or.save(order);
		//TODO:FIX FRIDAY
//		String partList = order.getPartList();
//		br.findBypartList(partList);
//		int id=br.findBypartList(partList).get(0).getB_Id();
//		build.setB_Id(id);
		return order;
	}

	
	
	@Override
	public boolean deleteOrder(Order order) {
		or.delete(order);
		return true;
	}

//	@Override
//	public Order updateOrder(Order order) {
//		or.save(order);
//		return order;
//	}

	@Override
    public Order updateOrder(Order order) {
        return or.save(order);
    }
	
	@Override
	public Set<Order> getAllOrders() {
		Iterable<Order> order = or.findAll();
		Set<Order> orderSet = new HashSet<Order>((Collection<? extends Order>) order);
		
		return orderSet;
	}

	@Override
	public Order getOrderById(int id) {
		Order order = or.findById(id).get();
		return order;
	}

	
	
}