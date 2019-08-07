package dev.ateam.app;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import dev.ateam.entities.AppUser;
import dev.ateam.repositories.UserRepository;
import dev.ateam.services.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AppUserTests {
  @Autowired
  @Qualifier("UserServiceDATA")
  UserService us;
  
  @Test
  public void saveAppUser() {
      
      AppUser user = new AppUser(0,"bob","bob","crashTestDummy");
      us.createUser(user);
      
  }
  
  @Test
  public void getAppUser() {
      
    List<AppUser> users = us.findByUsername("bob");
    System.out.println(users);
      
  }

  
  
  
  

}

