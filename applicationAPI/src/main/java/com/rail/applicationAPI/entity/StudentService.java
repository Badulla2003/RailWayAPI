package com.rail.applicationAPI.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRep;
	
	public List<Students> getStudents(){
		return studentRep.findAll();
	}

}
