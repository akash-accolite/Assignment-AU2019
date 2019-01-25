package com.spring.assignment;

public class Cricket implements OutdoorSports{
	@Override
	public void indoor(String type) {
		System.out.println("playing indoor cricket");
	}
	
	@Override
	public void outdoor(String type) {
		System.out.println("Playing outdoor cricket");
	}

}
