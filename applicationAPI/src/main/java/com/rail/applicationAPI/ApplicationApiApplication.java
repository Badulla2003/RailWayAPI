package com.rail.applicationAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rail.applicationAPI.entity.StudentService;
import com.rail.applicationAPI.entity.Students;

@SpringBootApplication
@RestController
public class ApplicationApiApplication {
	
	@Autowired
	StudentService studentser;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationApiApplication.class, args);
	}
	
	@GetMapping("/")
	public String hi() {
		return "hello world!";
	}
	
	@GetMapping("/students")
	public List<Students> getStudent(){
		return studentser.getStudents();
	}

}
