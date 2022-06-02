package com.syntax.class03;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * declare a variable rate 
		 * If rate is more than 5 --> I am not buying a house
		 */
		
		double mortgageRate=4.5;
		
		if (mortgageRate>5) {
			System.out.println("I am not buying a house");
			
		}
		
		/*
		 * Declare 2 variables and check if num1 is bigger than num2
		 */
		
		int num1=99;
		int num2=100;
		
		if(num1<num2) {
			System.out.println(num1+" is bigger than "+num2);
		}
		
		/*
		 * Declare temp,
		 * if temp is higher than 75 --> I will go for a walk
		 */
		int temp=68;
		
		if(temp>75 ) { //code goes inside if{} 
			           // When condition is true 
			System.out.println(" I will go for a walk");
			
		}else { // means otherwise. Code comes to else
			    // when condition is false 
			
			System.out.println("I am going to study Java");
			
		}
		
		System.out.println("------------------");
		
		char gender='m';
		char gender1='f';
		
		System.out.println(gender+gender1);
		
		if (gender=='f') {
			System.out.println("You like shopping");
		} else {
			System.out.println("You like watching sport");
		
		}
		
		System.out.println("-------------------------");
		
		String browser="chrome";
		
		if (browser.equals("chrome")) { // With string only spell out execution for i.e instead of = -> equals 
			
			System.out.println("All test cases will be executed on chrome");
		} else {
			System.out.println("I am not executing any test cases");
			System.out.println("Reason - wrong browser");
			
			
			
			
		}

	}

}
