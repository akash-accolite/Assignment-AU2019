package com.spring.design_pattern;

public class GUISports {
		private GUISports() {
			
		}

		public static Sports createSports() {
			String py=null;
			py="Cricket";
			
			if("Cricket".equalsIgnoreCase(py)){
	            return new CricketFactory().createSports();
	        } else if("Football".equalsIgnoreCase(py)){
	            return new FootballFactory().createSports();
	        }
			return null;
}
}
