package com.algoworks.student.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.algoworks.student.entity.Student;

@Service
public interface StudentService {

	public Student saveDetail(Student student);

	public List<Student> getAllList();

//	public Student getDetailByName(String name);

	public Student getDetailByName(String name);

}
