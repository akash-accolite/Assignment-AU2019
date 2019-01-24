package com.au.spring.dao;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.spring.model.Student;
import com.au.spring.rowmapper.RowMapperimpl;

@Repository
public class StudentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	
	public List<Student> getName() {

		return  jdbcTemplate.query("Select * from student",new RowMapperimpl() );
	}
	
	public void insertDetails(Student student) {
		jdbcTemplate.update("insert into student values (" + student.getStudentId() + ", '" + student.getStudentName() + "');");
	}
	
	

}
