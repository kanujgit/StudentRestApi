package com.algoworks.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algoworks.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
