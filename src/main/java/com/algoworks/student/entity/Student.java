package com.algoworks.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "reg_number")
	@NotEmpty(message = "registration number must be filled")
	private String registrationNumber;

	@NotEmpty(message = "name must be filled")
	@Column(name = "name")
	private String name;

	@NotEmpty(message = "class name must be filled")
	@Column(name = "class_name")
	private String className;

	@Column(name = "roll_no")
	private Integer rollNumber;

}
