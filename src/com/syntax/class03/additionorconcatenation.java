package com.syntax.class03;

public class additionorconcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		String c="Hello";
		String d="Hi";
		
		System.out.println(a+b+c+d); //30HelloHi
		System.out.println(a+c+b+d); //10HelloHi
		System.out.println(c+d+a+b); //HelloHi1020 B/C String can not add to an int
		System.out.println(c+d+(a+b)); //HelloHi30 (Parenthesis on numeric value)
		
		boolean boo=true;
		System.out.println(c+boo);
		
				
		
		
		
		
		
					

	}

}
