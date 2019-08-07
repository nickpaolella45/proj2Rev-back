package dev.ateam.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import dev.ateam.app.RevPointRestServiceApplication;
import dev.ateam.entities.AppUser;
import dev.ateam.services.UserService;

@ExtendWith(SpringExtension.class)
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
@ContextConfiguration(classes = dev.ateam.app.RevPointRestServiceApplication.class)
class AssociateTesting {

	@Autowired
	@Qualifier("UserServiceDATA")
	UserService us;
	
	int userID;
	
	@Test
	@Commit
	@Order(1)
	void createUser() {
		AppUser user = new AppUser(-1,"TestUser","Pass","crash test dummy");
		user =us.createUser(user);
		userID = user.getId();
	}

	@Test
	@Commit
	@Order(2)
	void findAssociateByID() {
		AppUser user = us.findByUsername("TestUser").get(0);
		System.out.println(user);
		Assert.notNull(user);
	}
	
	@Order(3)
	@Commit
	@Test
	void deleteAssociate() {
		AppUser user = us.findByUsername("TestUser").get(0);
		us.deleteUser(user);
	}
	
//	void AssociateCrudTest() {
//		this.createAssociate();
//		this.findAssociateByName();
//		this.deleteAssociate();
//		
//	}
	
}
