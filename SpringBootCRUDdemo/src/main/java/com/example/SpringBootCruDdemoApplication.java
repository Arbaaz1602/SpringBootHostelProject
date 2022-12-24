package com.example;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.Entity.Student;
import com.example.userRepository.userRepository;

@SpringBootApplication
public class SpringBootCruDdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootCruDdemoApplication.class);
		
		userRepository stdObjectr = context.getBean(userRepository.class);
		Student S1 = new Student(101, "Adnan", "Mirza", "Aurangabad", "8390816370");
		
		Optional<Student> findById = stdObjectr.findById(100);
		System.out.println(findById);
		
	}

}
