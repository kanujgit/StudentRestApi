package com.algoworks.student.serviceimpl;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algoworks.student.entity.Student;
import com.algoworks.student.repository.StudentRepository;
import com.algoworks.student.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository repo;
	
	
	@Override
	public Student saveDetail(Student student) {
		return repo.save(student);
		
	}

	@Override
	public List<Student> getAllList() {
		return repo.findAll();
		
	}

	@Override
	public Student getDetailByName(String name) {
		List<Student> stream= repo.findByName(name);
		return (Student)stream.get(0); 
	}
	
	

//	@Override
//	public Student getDetailByName(String name) {
//		List<Student> stream= repo.findByName(name);
//		return stream.get(0); 
//		
//	}

}
