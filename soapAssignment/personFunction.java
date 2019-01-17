package com.au.soapAssignment;

import java.util.HashMap;
import java.util.*;

public class personFunction {
	

public String create(String name,int id,int age) {

	person obj=new person();
	obj.addPerson(name,id,age);
	return "person added";
	
}

public String update(int id,String name,int age)
{
	
person obj=new person();
return obj.update(id,name,age);
}


public String showall()
{
	person obj=new person();
	return obj.showAll();
}

public String deleteById(int id)
{
	person obj=new person();
	
	return 	obj.deletebyid(id);
	

}

}
