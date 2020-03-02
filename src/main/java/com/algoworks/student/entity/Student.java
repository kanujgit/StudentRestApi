package com.algoworks.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

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
	@Size(min =2,max=10)
	@NotEmpty(message = "registration number must be filled")
	private String registrationNumber;

	@NotEmpty(message = "name must be filled")
	@Column(name = "name")
	private String name;
	
	
	@Column(name="email")
	@NotEmpty(message = "Email must not be empty")
	@Email(message ="Email must be a valid email address")
	private String email;

	@NotEmpty(message = "class name must be filled")
	@Column(name = "class_name")
	private String className;

	@Column(name = "roll_no")
	@Max(value = 10, message = "Roll no cannot be greater than 10")
	private Integer rollNumber;

}
