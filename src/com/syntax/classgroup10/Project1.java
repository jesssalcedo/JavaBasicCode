package com.syntax.classgroup10;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		/*
		 *  Using Scanner create an array of integer values. 
		 *  After the array is created, calculate the sum of all stored elements in that array.
		 */
		
		int[] num=new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 5 integer values");
		
		
		int sum = 0; // declaring variable of sum
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
			sum = sum + num[i]; 
		} System.out.println("The sum of all the integer values is " +sum);
	

		
	}

}
