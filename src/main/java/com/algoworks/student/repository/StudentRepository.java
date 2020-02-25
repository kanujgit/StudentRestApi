package com.algoworks.student.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.algoworks.student.entity.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

	List<Student> findByName(String naem);
//	
//	Long countByLastname(String lastname);
//	
//	List<Student> findByLastname(String lastname);
//	
	Student findByRegistrationNumber(String reg);


}
