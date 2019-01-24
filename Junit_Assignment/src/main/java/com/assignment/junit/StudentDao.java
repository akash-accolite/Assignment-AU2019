package com.assignment.junit;

import java.util.List;

public interface StudentDao {
	public List<Student> getStudents();
	public void saveStudent(Student student);
	
}
