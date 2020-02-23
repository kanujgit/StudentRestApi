package com.algoworks.student.serviceimpl;

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
	public void getAllList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDetailByName() {
		// TODO Auto-generated method stub
		
	}

}
