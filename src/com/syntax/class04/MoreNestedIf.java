package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * We need to check if replit was completed
		 * 
		 * if replit is completed, we want to see
		 * if you did 15 and more assignments -->great job
		 * if you did more then 10--> good 
		 * if you did less < 10 -- > try to complete all assignments 
		 */
		
		boolean didRepl=true;
		int assignments;
		
	
		
		if (didRepl) {
			System.out.println("How many assignments have you done");
			assignments=14;
			
			if (assignments>15) {
			System.out.println("you did a great job"); 
		        }else if (assignments >10) {
				System.out.println("You did a good job");
			
			   }else {
				System.out.println("Please complete all hw");
			
				
				

	}

		}
		
		
	}
	
}
