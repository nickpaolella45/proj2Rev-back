package dev.ateam.app;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;
import dev.ateam.entities.Build;
import dev.ateam.services.BuildService;
import dev.ateam.services.OrderService;


@ExtendWith(SpringExtension.class)
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
@ContextConfiguration(classes = dev.ateam.app.RevPointRestServiceApplication.class)
class OrderTesting {

	@Autowired
	@Qualifier("OrderServiceDATA")
	OrderService os;
	
	

	@Test
	@Order(1)
	@Rollback
	//@Commit
	void createOrder() {
	  //Order(int orderId, int qmId, int rId, int aId, Build build, String status, String requestDetails)
	    dev.ateam.entities.Order testOrder = new dev.ateam.entities.Order(0,0,0,0,new Build(0,"duck"),"100% duck.","it is a duck.");
		testOrder = os.createOrder(testOrder);
	}
//	
//	@Test
//	@Order(2)
//	@Rollback
//	void updateOrder() {
//		testOrder.setStatus(testOrder.getStatus()+Math.random());
//		os.updateOrder(testOrder);
//		System.out.println(testOrder);
//	}
//	
//	@Test
//	@Order(3)
//	@Commit
//	void deleteOrder() {
//		os.deleteOrder(testOrder);
//	}


}
