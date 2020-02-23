package com.algoworks.student.services;

import org.springframework.stereotype.Service;

import com.algoworks.student.entity.Student;

@Service
public interface StudentService {
	
	public Student saveDetail(Student student);

	public void getAllList();

	public void getDetailByName();
	
}
