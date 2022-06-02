package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter name");
		
		String name=scan.next(); //capture String 
		
		System.out.println("Please enter age"); //capture int 
		int age=scan.nextInt();//capture int
		
		System.out.println("Please enter your price");
		double price=scan.nextDouble(); //capture double 
		
		System.out.println("Please enter boolean");
		boolean boo=scan.nextBoolean(); // capture boolean 		
		
		System.out.println("Please enter any char");
		char character=scan.next().charAt(0);//capture 1 character 
		System.out.println(character);
		

	}

}
