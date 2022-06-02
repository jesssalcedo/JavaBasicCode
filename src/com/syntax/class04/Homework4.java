package com.syntax.class04;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create a java program in which using Scanner you are going to capture 2 numbers.
         *And once you capture 2 numbers, please check which one is the largest.
		 * 
		 */
		
		Scanner number=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num1=number.nextInt();
		System.out.println("Give me another number please");
		int num2=number.nextInt();
		
		if(num2>num1) {
			System.out.println(num2+" is greater than "+num1);
		}else {
			System.out.println(num1+" is greater than "+num2);
		} 
			
		}
		
		
			
		
		
		
		

	}
