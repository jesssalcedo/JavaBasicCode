package com.syntax.class05;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to
		 *  input city and temperature. Your program should 
		 *  convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What city do you live in?");
		String city=scan.next();
		System.out.println("Please input temperature in fahrenheit?");
		double tempFehren=scan.nextDouble();
		
		double tempCelciu=(tempFehren-32)/1.8;
		
		System.out.println("The temperature in the city of "+city+" is "+tempCelciu);
		
	
		
		
		

	}

}
