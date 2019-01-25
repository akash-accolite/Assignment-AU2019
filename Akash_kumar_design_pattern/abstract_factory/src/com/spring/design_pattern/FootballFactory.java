package com.spring.design_pattern;

public class FootballFactory implements PlayFactory{
	@Override
	public Sports createSports() {
		System.out.println("creating football");
		return new FootballSports();
	}

}
