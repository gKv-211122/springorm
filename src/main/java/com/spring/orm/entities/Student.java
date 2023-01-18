package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	
	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_name")
	private String studntName;
	
	@Column(name="student_city")
	private String studentCity;

	public Student(int studentId, String studntName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studntName = studntName;
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudntName() {
		return studntName;
	}

	public void setStudntName(String studntName) {
		this.studntName = studntName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	

}
