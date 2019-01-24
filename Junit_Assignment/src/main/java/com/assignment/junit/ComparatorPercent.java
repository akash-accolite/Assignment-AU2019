package com.assignment.junit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
public class ComparatorPercent implements Comparator<Student>{
	SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		Date First,Second;
	    public int compare(Student s1, Student s2) {
	        if(s1.getPercent() < s2.getPercent()){
	            return 1;
	        } 
	        else if(s1.getPercent() > s2.getPercent())
	        {
	            return -1;
	        }
	        else
	        {
	        	try {
					First = format.parse(s1.getDob());
				} catch (Exception e) {
					System.out.println(e);
				}
	        	try {
					Second = format.parse(s2.getDob());
				} catch (ParseException e) {
					System.out.println(e);
				} 
	        	if(First.compareTo(Second)<0) 
	   			  {
	        		return -1; 
	   			  }
	   		  else 
	   		  { 
	   			 return 1;
	   		  }
	        }
	}
}


