package com;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// POJO -> Plain Old Java Object means class with only attributes 
// 		   constructor getters and setters

@Entity
@Table(name = "student2")
public class Student {
	@Id
	@Column(name = "id")
	private int roll;
	@Column(name = "name")
	private String name;
	@Column(name = "mail")
	private String mail;
	@Column(name = "marks")
	private int marks;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student() {
		
	}
	public Student(int roll, String name, String mail, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.mail = mail;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", mail=" + mail + ", marks=" + marks + "]";
	}
	
	
}
