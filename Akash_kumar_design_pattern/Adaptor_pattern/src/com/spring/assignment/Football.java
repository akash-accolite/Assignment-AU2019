package com.spring.assignment;

public class Football implements OutdoorSports{
	@Override
	public void indoor(String type) {
		System.out.println("playing indoor football");
	}
	
	@Override
	public void outdoor(String type) {
		System.out.println("Playing outdoor football");
	}


}
