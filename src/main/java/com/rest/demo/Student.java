package com.rest.demo;


import jakarta.persistence.*;
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentid;
	private String name;
	private int age;
	private String gender;
	private String school_name;

	// Constructors, getters, and setters
	public Student() {}

	public Student(String name, int age, String gender, String school_name) {
		this.name = name;
	    this.age = age;
	    this.gender = gender;
	    this.school_name = school_name;
	    }

	public Long getStudentId() {
		return studentid;
	}

	

	public String getName() {
		return name;
	}

	

	public int getAge() {
		return age;
	}

	
	public String getGender() {
		return gender;
	}

	

	public String getSchool_name() {
		return school_name;
	}

	
	

	    
	}

	


