package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte num=12;
		
		if (num>0) {
			System.out.println("Then the number is positive");
		}else {
			System.out.println("Then the number is negative");
		}
		/*
		 * another example
		 */
		
		int a=0;
		
		if (a >0) {
			System.out.println(a+" ia positive");
		} else if (a==0) { // if you use only one "=" always need boolean expression
			System.out.println(a+" is not negative or positive");
		}else {
			System.out.println(a+ " is negative");
		}

	}

}
