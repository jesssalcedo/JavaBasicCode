package com.syntax.class04;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program to store a value whether user has diploma or not.
		 *  If user has a diploma, you should say congratulations, 
		 *  otherwise program should suggest to get a degree. 
		 *  Then if user has a degree program should check a gpa score. 
		 *  If gpa score is higher or equals to 3.5 → output should say
		 *   “You are eligible for scholarship”, otherwise → “You should have studied harder” .
		 */
		
		boolean diploma=false;
		double gpa=2;
		
		if (diploma) {
			System.out.println("Congratulations");
			if (gpa>=3.5) {
				System.out.println("you are eligible for scholarship");
			}else if (gpa <3.4) {
				System.out.println("You shouldve studies harder");
			}
			
		}else {
			System.out.println("You should get a degree");
		}
	}

}
