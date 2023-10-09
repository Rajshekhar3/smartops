package com.example.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name="STUD")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studId;
	private String firstName;
	private String lastName;
	private int rollNo;
	private String grade;
	
	public Student() 
	{
		
	}

	public Student( String firstName, String lastName, int rollNo, String grade) {
		super();
		//this.studId = studId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.grade = grade;
	}

	public long getStudId() {
		return studId;
	}

	public void setStudId(long studId) {
		this.studId = studId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
	
	
		

}
