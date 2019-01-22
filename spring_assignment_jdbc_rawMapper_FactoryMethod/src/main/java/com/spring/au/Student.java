package com.spring.au;

public class Student {

	private long student_id;
	private String student_name;

	
	public long getStudentId() {
		return student_id;
		}

	public void setStudentId(long studentId) {
		//System.out.println("inside setstudent id ");
			this.student_id = studentId;
			}

	public String getStudentName() {
		return student_name;
	}

	public void setStudentName(String studentName) {
		//System.out.println("inside set student name");
		this.student_name = studentName;
		}


}