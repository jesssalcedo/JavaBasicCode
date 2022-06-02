package com.syntax.Review03;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user="Jessica";
		String password="pass123";
		
		/*
		 * whenever we use primitive data types like byte, short in long float double char boolean
		 * we use=====
		 * whenever we use non-primitive data types we us .equals method String
		 * 
		 * 
		 */
		
		if(user.equals("Jessica")&& password.equals("pass123")) {
			System.out.println("Welcome back to Syntax");
			
		}else {
			System.out.println("username or password is not correct");
		}
		
		// when Debugging make sure
		// you have not disabled the breakpoint
		// you have not enabled the skip all breakpoints options in debug windows

	}

}
