package com.syntax.class05;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your score for the quiz");
		int quiz=scan.nextInt();
		
		System.out.println("Please enter your score for the midterm");
		int midterm=scan.nextInt();
		
		System.out.println("Please enter your final score");
		int finalScore=scan.nextInt();
		
		int results= (( quiz + midterm + finalScore)/3); 
		
	System.out.println("Your average score is "+results);
		char grade;
		
		if(results>=90) {
			grade='A';
		}else if (results>=70 && results >=90) {
			grade='B';
		}else if(results>=50 && results>=70) {
			grade='C';
		}else {
			grade='F';
		}
	
		
		System.out.println("Youre a "+grade+ " student");
		
		/*
		 * if youre an a or b student youre doing a great job. 
		 * otherwiise-- please try harder
		 */
		
		if(grade=='A' || grade=='B') {
			System.out.println("you are doing great");
			}else {
			System.out.println("please try to study more");
		    	
		    	
		    	
		    }
	}

	}

