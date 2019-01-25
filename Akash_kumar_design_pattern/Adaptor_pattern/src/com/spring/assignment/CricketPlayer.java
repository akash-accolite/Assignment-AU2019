package com.spring.assignment;

public class CricketPlayer implements Sports {
	OutdoorSports outdoorSports;
	
	 public CricketPlayer(String type){
		   
	      if(type.equalsIgnoreCase("cricket") ){
	         outdoorSports = new Cricket();			
	         
	      }else if (type.equalsIgnoreCase("Football")){
	    	  outdoorSports = new Football();
	      }	
	   }

	   @Override
	   public void play(String type) {
	   
	      if(type.equalsIgnoreCase("Cricket")){
	         System.out.println("This is cricket");
	      }
	      else if(type.equalsIgnoreCase("Football")){
	         System.out.println("This is Football");
	      }
	   }

}
