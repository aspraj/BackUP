package com.httpentityexample.entities;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer studentId;
	private String studentName;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private LocalDate dateOfBirth;
	private String courseEnrolled;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth
				+ ", courseEnrolled=" + courseEnrolled + "]";
	}
	

}