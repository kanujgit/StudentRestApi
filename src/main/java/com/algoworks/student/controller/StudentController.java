package com.algoworks.student.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algoworks.student.api.respose.Response;
import com.algoworks.student.entity.Student;
import com.algoworks.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/")
	public Response<Student> saveDetail(@Valid @RequestBody Student student) {
		Student st=  service.saveDetail(student);
		return new Response<>(st,"data save succesfully");
	}

	@GetMapping("/")
	public Response<List<Student>> getAllList() {
		List<Student> st=  service.getAllList();
		if(st.size() == 0) {
			return new Response<List<Student>>("No records exist");
		}
		return new Response<List<Student>>(st,"data fetch succesfully");
	}
	
	@GetMapping("/{name}")
	public Response<List<Student>> getDetailByName(@PathVariable String name) {
		List<Student> st=  service.getDetailByName(name);
		return new Response<List<Student>>(st,"data fetch succesfully");
	}
	
}
