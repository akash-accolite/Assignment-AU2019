package com.spring.design_pattern;

import java.awt.Button;

public class CricketFactory implements PlayFactory {

	@Override
	public Sports createSports() {
		System.out.println("creating Sports : Cricket");
		return new CricketSports();
	}
}
