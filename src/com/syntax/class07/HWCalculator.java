package com.syntax.class07;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		double x = scan.nextInt();
		double y = scan.nextInt();
		double result;
		System.out.println("Please enter operator");
		char op = scan.next().charAt(0);
		switch (op) {
		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		default:
			result = 0;
		}
		
		System.out.println(x + " " + op + " " + y + " = " + result);
		scan.close();

	}

}
