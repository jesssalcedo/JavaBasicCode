package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
	//Create an array to store char values and then print those in reverse order
		
	char[] grades= {'a', 'b', 'c', 'd'};
	
	for(int i=0; i<grades.length; i++) {
		System.out.print(grades[i]+ " ");
	}
	
	System.out.println("-------------------");
		
		for (int i=grades.length-1; i>=0; i--) {
			System.out.print(grades[i]+ " ");
			
			
		}
		
		
		
	}

}
