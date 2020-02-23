package com.algoworks.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name="reg_number")
	private String registrationNumber;
	
	@Column(name="name")
	private String name;

	@Column(name="class_name")
	private String className;
	
	@Column(name="roll_no")
	private Integer rollNumber;

}
