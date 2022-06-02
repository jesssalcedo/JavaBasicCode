package com.syntax.class05;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		/*
		 *  Write a program that will read three inputs of scores (quiz, mid term, and final scores) and 
		 *  determine the grade based on the following rules:

		if the average score >=90 → grade=A
		if the average score >= 70 and <90 → grade=B
		if the average score>=50 and <70 → grade=C
		if the average score<50 → grade=F

		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your score for the quiz");
		int quiz=scan.nextInt();
		
		System.out.println("Please enter your score for the midterm");
		int midterm=scan.nextInt();
		
		System.out.println("Please enter your final score");
		int finalScore=scan.nextInt();
		
		int results= (( quiz + midterm + finalScore)/3); 
		
		if(results>=90) {
			
		}
		
		
	}

}
