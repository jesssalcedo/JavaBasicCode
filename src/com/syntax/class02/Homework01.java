package com.syntax.class02;

public class Homework01 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to add, subtract, 
		 * multiply and divide 2 decimal values. 
		 * Your program should say. 
		 * “The _______ of 2 numbers ___ and ___ is equal to _____”
		 */
		
		double num1=10.99;
		double num2=25.42;
		double sum, sub, div, mult;
	    sum=num1+num2;
	    sub=num1-num2;
	    div=num1/num2;
	    mult=num1*num2;
	    
	    System.out.println("The sum of 2 numbers " +num1+ " and " +num2+ " Is equal to " +sum);
	    System.out.println("The subtraction of 2 numbers " +num1+ " and " +num2+ " is equal to " +sub);
	    System.out.println("The division of 2 numbers " +num1+ " and " +num2+ " is equal to" +div);
	    System.out.println("The multiplication of 2 numbers " +num1+ " and " +num2+ " is equal to " +mult );
	    
	    /*
	     * Task 2: Write a program to find the square of the number 3.9. 
	     * You program should say “The square of the ____ is ____ ”
	     */
	    
	    double num3=3.9;
	    double num4=3.9;
	    double mult1=num3*num4; 
	    		
	    System.out.println("The square of the " +num3+ " is " +mult1);
	    
	   
	    
		
		

	}

}
