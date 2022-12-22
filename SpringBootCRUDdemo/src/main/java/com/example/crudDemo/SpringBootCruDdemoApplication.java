package com.example.crudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.Entity.Student;
import com.example.userRepository.userRepository;

@SpringBootApplication
public class SpringBootCruDdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(userRepository.class);
		
		userRepository stdObjectr = context.getBean(userRepository.class);
		Student S1 = new Student(100, "Arbaaz", "Sayed", "Goa", "9822140878");
		
		stdObjectr.save(S1);
		
	}

}
