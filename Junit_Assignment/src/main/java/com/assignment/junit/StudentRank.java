package com.assignment.junit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ranktable")
public class StudentRank {
	
	@Id
	@Column(name = "studentRank")
	public int  studentRank;
	
	@Column(name="studentId")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	public int studentId;
	
	@Column(name = "studentName")
	public String  studentName;
	
	@Column(name = "dob")
	public String  dob;
	
	@Column(name = "marks")
	public int  marks;
	
	public int getStudentRank() {
		return studentRank;
	}

	public void setStudentRank(int studentRank) {
		this.studentRank = studentRank;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
