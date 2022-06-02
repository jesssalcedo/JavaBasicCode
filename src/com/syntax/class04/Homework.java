package com.syntax.class04;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a java program in which using
		 *  Scanner you are going to capture user’s 
		 *  first name, last name and state where he/she lives.
		 */
		
		Scanner input=new Scanner(System.in);// memorize this 
		
		//send instructions to console
		
		System.out.println("Please enter your first name only");

		String firstname=input.next(); 
		System.out.println("Hello "+firstname);
		
		System.out.println(firstname+" Please enter your last name");
		
		String lastname=input.next();
		System.out.println( lastname);
		
		System.out.println(firstname+ lastname+ " Which State do you live in");
		String state=input.next();
	
				
	}

}
