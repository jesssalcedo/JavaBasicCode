package com.syntax.class10;

public class AnotherWay2DoArray {

	public static void main(String[] args) {
		/*
		 *  create 2d array of states
		 *  1 array -> NY--> all cities 
		 *  2 array->CA-->all cities in CA states
		 *  3 array->FL-->all cities of FL
		 *  4 array-> VA --> all cities of VA state
		 */
		
		String[][] usa= {
				{"New York", "Albany", "Bufffalo"},
				{"Los Angeles", "San Francisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa" },
				{"McLean", "Richmond", "Lessburg"}
				
				
		};
		
		System.out.println(usa[1][2]);//San Jose
		System.out.println("I want to go to "+usa[2][0]);//Miami
		
		System.out.println("Total # of 1D arrays in array usa= "+usa.length);
       
		//I want to see how many elements inside of my first array
		
		int elem1array=usa[0].length;
		System.out.println("# of elements in 1 array ="+elem1array);
		
		int elem2array=usa[1].length;
		System.out.println("# of elements in 1 array ="+elem2array);
		
		//outer loop itterates over rows
		
		for(int row=0; row<usa.length; row++) {
			
			for(int col=0; col <usa[row].length; col++) {
				System.out.print(usa[row][col]+" ");
			}
			
			System.out.println();
			
		
			
			
		
		}
		
		
	}

}
