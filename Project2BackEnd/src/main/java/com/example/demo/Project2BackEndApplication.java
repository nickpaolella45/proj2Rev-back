package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("dev.paolella")
@EntityScan("dev.paolella.entities")
@EnableJpaRepositories("dev.paolella.repositories")
public class Project2BackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project2BackEndApplication.class, args);
	}

}
