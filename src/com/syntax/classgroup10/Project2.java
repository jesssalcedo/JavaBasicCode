package com.syntax.classgroup10;

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. 
		 * When an array is created, retrieve all values
		 *  from it and while retrieving those values print 
		 *  capital for each country. (use 2 different loops).
		 */
		
		String[] country = new String[4];
		
		Scanner input =new Scanner(System.in); 
		
		System.out.println("Please enter an array of countries");
		
		String capital = "";
		
		for (int i = 0; i < country.length; i++) {
			country[i] = input.next();
			if (country[i].equalsIgnoreCase("USA")) {
				capital = "Washington DC";
			} else if (country[i].equalsIgnoreCase("France")) {
				capital = "Paris";
			} else if (country[i].equalsIgnoreCase("Austria")) {
				capital = "Vienna";
			} else {
				capital = "Unknown";
			}
			
			System.out.println("The capital for " + country[i] + " is " + capital);
		}
		
			//different example
			for(String x:country) {
				x=input.next();
					if(x.equalsIgnoreCase("usa")) {
						capital = "Washington DC";
					}else if (x.equalsIgnoreCase("France")) {
						capital = "Paris";
					} else if (x.equalsIgnoreCase("Austria")) {
						capital = "Vienna";
					} else {
						capital = "Unknown";
					}
					
					System.out.println("The capital for " + x + " is " + capital);
					
			}
	}
}