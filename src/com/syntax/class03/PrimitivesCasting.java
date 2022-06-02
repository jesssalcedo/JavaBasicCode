package com.syntax.class03;

public class PrimitivesCasting {
	//ctrl+space --> auto complete 
	
	public static void main(String[] args) {
	
		int i=100; 
		double d=100;
		
		System.out.println(i); //100
		System.out.println(d); //100.0
		
		/*
		 * Widening: implicit: automatic - byte -> short -> int-> long-> float -> double
		 */
		
		long l=10000;
		
		// byte b= 130; error: cannot convert from int to byte 
		// int x=99.99 error: cannot convert from double to int 
		
		int x=(int)99.99; // narrowing 
		System.out.println(x); // 99 
		
		byte b=(byte)130; 
		System.out.println(b); //-126
		
		//Type mismatch: cannot convert from double to float 
		float f=10.99f;
		
		double dd=9.99;
		
		double price=100;
		
		
	

		
	}


}
