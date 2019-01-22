package Maven_assignment;
//If you want to see the effect of join then comment the line from 43 to 69
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {

	public static void addperson(Person per, String name, int id) {

		per.setId(id);
		per.setName(name);
		System.out.println("Done!");
		return;
	}
	
	public static void addcourse(Course per1, int id,String name, int id1) {
		per1.setCourseId(id);
		per1.setCourseName(name);
		per1.setId(id1);
		return;
		
	}
	

	public static void main(String[] args) {
		System.out.println("Hello World!");
		List<Person> results = new ArrayList<Person>();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Scanner in = new Scanner(System.in);
		System.out.println("Entering into Person");
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the id");
			int id = in.nextInt();
			String n = in.nextLine();
			System.out.println("Enter the name");
			String name = in.nextLine();
			Person per = new Person();
			addperson(per, name, id);
			System.out.println(per);
			;
			session.save(per);
		}
//		session.getTransaction().commit();
		System.out.println("entering into course");
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the id");
			int id = in.nextInt();
			String n = in.nextLine();
			System.out.println("Enter the name");
			String name = in.nextLine();
			Course per1 = new Course();
			System.out.println("Enter the id");
		int id1 = in.nextInt();
			addcourse(per1,id, name, id1);
			session.save(per1);
		}
		
		session.getTransaction().commit();
		
		System.out.println("You entered: ");

		Criteria cr = session.createCriteria(Person.class);
		results = cr.list();
		for (Person person : results) {
			System.out.println("Name : " + person.getName() + " Id: " + person.getId());
		
		
		}
		
		List<Person>studentList= new ArrayList<Person>();
		Criteria c = session.createCriteria(Person.class);
		
		studentList=c.list();
	
	 for(Person student: studentList) {
		  System.out.println(  
		  student.getName()+"|"
		  +student.getId()+"|"
		  +(!student.getCourses().isEmpty()?student.getCourses().get(0).getCourseName()
		  :"") ); }
}
}