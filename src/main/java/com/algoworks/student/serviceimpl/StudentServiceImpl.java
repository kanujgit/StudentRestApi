package com.algoworks.student.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algoworks.student.entity.Student;
import com.algoworks.student.exception.EntityNotFoundException;
import com.algoworks.student.repository.StudentRepository;
import com.algoworks.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveDetail(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllList() {
		// Page<Student> page = repo.findAll(new PageRequest(1, 10));
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public List<Student> getDetailByName(String name) {
		List<Student> stream = studentRepository.findByName(name);
		if(stream.size() == 0) {
			throw new EntityNotFoundException("No stufent found with name: " + name);
		}
		return stream;
	}
	

//	@Override
//	public Student getDetailByName(String name) {
//		List<Student> stream= repo.findByName(name);
//		return stream.get(0); 
//		
//	}

}
