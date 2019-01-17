package com.au.soapAssignment;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class person {

	public String name;
	public int id;
	public int age;

	public person() {

	}

	public person(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	

	static ArrayList<person> persons = new ArrayList<person>();

	public void addPerson(String name, int id, int age) {
		  int a = 1;
		  persons.add(new person(name, id, age));
		
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getId()

	{
		return this.id;
	}
	
	public String showAll()
	{	

		String result = "";
		
		for(person p : persons) {
			
			result +="Name :" +p.getName() + " , Age:  "+p.getAge()+" , Id: "+p.getId() +" ; ";
			
		}
		
		
		return result;
	}
	
public String deletebyid(int id)
{
	
	
	System.out.println("Inside deleteby id and id is "+id);
	for(person p : persons )
	{
		
		
		if(id == p.getId())
		{ 
			
			System.out.println("selected id: "+p.getId()+"entered id is"+id);
			persons.remove(p); 
			return "deleted";
			
		}
	}
	return "Id value not present";
}

public String update(int i,String name,int age)
{
	for(person p : persons)
	{
		if(i == p.getId())
		{
			p.setName(name);
			p.setAge(age);
		}
		return "updated";
	}
	
	return "Record with this id not present";
	
}
	

}
