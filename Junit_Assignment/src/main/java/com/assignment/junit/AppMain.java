package com.assignment.junit;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class AppMain {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<Student> studentList = new ArrayList<Student>();
		Criteria cr = session.createCriteria(Student.class);
		cr.add(Restrictions.gt("Id", 0));
		studentList = cr.list();
		System.out.println(" Record of students from Database ");

		for (Student s : studentList) {
			System.out.print("Id " + s.getId());
			System.out.print("Percentage " + s.getPercent());
			System.out.print("Date Of Birth " + s.getDob());
			System.out.println("Name " + s.getName());
					}
		// adding data in database to table name ranktable 
		StudentService st = new StudentService();
		List<StudentRank> rankList= st.getRankList(studentList);
//		  for (StudentRank rank : rankList) 
//		  { 
//			  session.save(rank);
//		  }
		  session.getTransaction().commit();
		//Here i am showing the rank of students
		  System.out.println("Ranking :");
		  for (StudentRank s : rankList) {
			    System.out.print("Rank "+s.getStudentRank());
			    System.out.print("Marks " + s.getMarks());
				System.out.print("Date Of Birth " + s.getDob());
				System.out.print("Id " + s.getStudentId());
				System.out.println("Name " + s.getStudentName());
				
			}
	}
}
