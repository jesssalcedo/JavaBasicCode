package com.syntax.class10;

public class UsaTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] usa= {
				{"New York", "Albany", "Bufffalo"},
				{"Los Angeles", "San Francisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa" },
				{"McLean", "Richmond", "Lessburg"}
				
				
		};
		
		System.out.println("Retrieve all values using for each loop");
	for(String[] state:usa) {
		for(String city:state) {
			System.out.print(city+" ");
		}
			
			System.out.println();
	
			
			
		}
	}
	}
	

