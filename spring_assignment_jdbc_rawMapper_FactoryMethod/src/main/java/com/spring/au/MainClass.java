package com.spring.au;
 import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		JDBCTemplateDao jdbc=applicationContext.getBean(JDBCTemplateDao.class);
		Student student = new Student();
		student.setStudentId(166);
		student.setStudentName("an");
		jdbc.saveStudent(student);

		List<Student> lt=jdbc.findall();
		for(Student w:lt) {
			System.out.println("Id : "+w.getStudentId()+" Name :"+w.getStudentName());
		}
		
		A a=(A)applicationContext.getBean("A");  
	    
		
	
	
	}
}
