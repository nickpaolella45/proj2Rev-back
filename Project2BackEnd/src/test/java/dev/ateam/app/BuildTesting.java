package dev.ateam.app;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import dev.ateam.entities.Build;
import dev.ateam.entities.Build;
import dev.ateam.services.BuildService;
import dev.ateam.services.BuildService;


@ExtendWith(SpringExtension.class)
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
@ContextConfiguration(classes = dev.ateam.app.RevPointRestServiceApplication.class)
class BuildTesting {

	@Autowired
	@Qualifier("BuildServiceDATA")
	BuildService bs;
	
	Build testBuild = new Build(0,"monkeys,lotsOfMonkeys");

	@Test
	@Commit
	@Order(1)
	void createBuild() {
		testBuild = bs.createBuild(testBuild);
	}
	
	@Test
	@Order(2)
	@Rollback
	void updateBuild() {
		testBuild.setPartList(testBuild.getPartList()+Math.random());
		bs.updateBuild(testBuild);
		System.out.println(testBuild);
	}
	
	@Order(3)
	@Commit
	@Test
	void deleteBuild() {
		bs.deleteBuild(testBuild);
	}


}
