package com.algoworks.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.algoworks.student.entity.Student;

@Service
public interface StudentService {

	public Student saveDetail(Student student);

	public List<Student> getAllList();

	public List<Student> getDetailByName(String name);

}
