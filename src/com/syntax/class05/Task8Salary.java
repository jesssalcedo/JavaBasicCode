package com.syntax.class05;

import java.util.Scanner;

public class Task8Salary {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter 
		 * numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years 
		 * than user is eligible for the bonus, otherwise
		 *  he is not. Once user is eligible and salary is 
		 *  larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter how many years have you worked here?");
		int years=scan.nextInt();
		System.out.println("Please enter what is your annual salary?");
		double salary=scan.nextDouble();
		
		if(years>=5) {
			System.out.println("You're eligible for a bonus");
			if(salary>50000) {
				System.out.println("Bonus = 5000");
			}else {
					System.out.println("Bonus=3000");
				}
			}else {
				System.out.println("You're not eligible for bonus");
			}
		}

	}


