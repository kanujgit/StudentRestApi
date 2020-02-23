package com.algoworks.student.services;

import com.algoworks.student.entity.Student;

public interface StudentService {
	
	public Student saveDetail(Student student);
	
	public void getAllList();

	public void getDetailByName();
	
}
