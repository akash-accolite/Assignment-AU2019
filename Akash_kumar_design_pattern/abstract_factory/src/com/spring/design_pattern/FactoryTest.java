package com.spring.design_pattern;

public class FactoryTest {

	public static void main(String a[]){
        Sports btn = GUISports.createSports();
        btn.play();
    }
	
}
