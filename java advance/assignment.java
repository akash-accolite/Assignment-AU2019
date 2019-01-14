package com.assignment_advance_java;
//java advance assignment 
//concepts
//1: collection
//2: class
//3:object
//4:different sorting
//5:List

import java.util.*;


//class to hold information  for company
class company
{
	String name;
	List<person> person_obj=new LinkedList<person>(); 
	List<address> address_obj=new LinkedList<address>();
	
	company(String name)
	{
		this.name=name;
	}
	
	
}

//class to hold information for person
class person{
	
	String name;
	int age;
	String id;
	
	void get_emp_detail() {
		System.out.println("Name is "+this.name+" his age is "+this.age+" "
				+ "employee id is "+this.id);
		
	}
	
	person(String name,int age,String id)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
}


//class to sort person by age
class sort_by_age implements Comparator<person>
{
	
	public int compare(person a,person b)
	{
		return a.age-b.age;
	}
	
	
}

//class to sort person by name
class sort_by_name implements Comparator<person>
{
	public int compare(person a,person b)
	{
		 return a.name.compareTo(b.name);
	}
	
}
//Class to hold the address of different branches of the company
class address{
	
	String street;
	String city;
	String state;

	address(String street,String city,String state)
	{
		this.street=street;
		this.city=city;
		this.state=state;
	}
	
	//instance method to print the full address of different branches
	void get_address()
	{
		System.out.println("Full address is street number: "
				+this.street+" city : "+this.city+" State : "+this.state);
	}
}


//Class containing the main function and objects of different classes

public class assignment {

public static void main(String args[])
{
	
	//creating Accolite as object of company class
	company Accolite=new company("Accolite");
	
	//creating person object
	person person1=new person("Akash",24,"INT212");
	person person2=new person("Mayank",24,"INT213");
	person person3=new person("Sonu",24,"INT214");
	person person4=new person("Pramod",29,"INT234");
	person person5=new person("Rahul",27,"INT255");
	
	//adding person to accolite
	Accolite.person_obj.add(person1);
	Accolite.person_obj.add(person2);
	Accolite.person_obj.add(person3);
	Accolite.person_obj.add(person4);
	Accolite.person_obj.add(person5);
	
	//creating address object
	address address1=new address("street1","Bangalore","Karnataka");
	address address2=new address("street2","Hyderabad","Telangna");
	address address3=new address("street3","Delhi","Delhi");
	
	//adding address to accolite as the branch
	Accolite.address_obj.add(address1);
	Accolite.address_obj.add(address2);
	Accolite.address_obj.add(address2);
	
	System.out.println("Address of different branches are:");
	
	
	//printing the address of different branches
	
	for(int i=0;i<Accolite.address_obj.size();i++)
	{
	
		Accolite.address_obj.get(i).get_address();
	}
	
	//printing the details of all the employee
	System.out.println("Detail of Employee is");
	for(int i=0;i<Accolite.person_obj.size();i++)
	{
	
		Accolite.person_obj.get(i).get_emp_detail();
	}
	
	System.out.println("\n");
	
	
	//printing the details of employee in ascending order of their age
	Collections.sort(Accolite.person_obj,new sort_by_age());
	System.out.println("Name of employee in ascending order of their age is\n");
	
	for(int i=0;i<Accolite.person_obj.size();i++)
	{
	
		Accolite.person_obj.get(i).get_emp_detail();
	}
	
	
	//printing the details of employee in ascending order of their name
	Collections.sort(Accolite.person_obj,new sort_by_name());
	System.out.println("Alphabet wise anme of employee is\n");
	
	for(int i=0;i<Accolite.person_obj.size();i++)
	{
	
		Accolite.person_obj.get(i).get_emp_detail();
	}
	
	
	
}
}