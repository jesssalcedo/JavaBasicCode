package com.syntax.classgroup10;

public class Project3 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. 
		// Print the sum of all numbers.
		
		int[][] value = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
				}; 
		int sum = 0; 
		
		for(int i=0; i<value.length; i++) {
			for(int j=0; j<value[i].length; j++) {
				sum=sum+value[i][j];
				
			}
			
		}System.out.println("The sum of all numbers is "+sum);

	}

}
