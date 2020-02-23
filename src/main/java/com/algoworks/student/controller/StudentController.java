package com.algoworks.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algoworks.student.api.respose.Response;
import com.algoworks.student.entity.Student;
import com.algoworks.student.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/")
	public Response<Student> saveDetail(@RequestBody Student student) {
		Student st=  service.saveDetail(student);
		return new Response<Student>(st,"data save succesfully");
	}

	@GetMapping("/")
	public Response<List<Student>> getAllList() {
		List<Student> st=  service.getAllList();
		return new Response<List<Student>>(st,"data fetch succesfully");
	}
	
	@GetMapping("/getDetailByName/{name}")
	public Response<Student> getdetailByName(@PathVariable String name) {
		Student st=  service.getDetailByName(name);
		return new Response<Student>(st,"data fetch succesfully");
	}
	
}
