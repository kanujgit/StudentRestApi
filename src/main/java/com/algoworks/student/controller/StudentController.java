package com.algoworks.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algoworks.student.entity.Student;
import com.algoworks.student.services.StudentService;

@RestController

@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service ;
	
	@PostMapping("/")
	public Student saveDetail(Student student )
	{
		service.saveDetail(student);
	}
	
	
}
