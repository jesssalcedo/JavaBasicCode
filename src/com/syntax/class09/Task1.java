package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and 
		 * store grades into it: A,B,C,D,E,F.
		 *  Then print a grade B (use 2 different
		 *   ways of creating an array).

		 */
		
		char[] grades=new char[6];
		
		grades[0]='a';
		grades[1]='b';
		grades[2]='c';
		grades[3]='d';
		grades[4]='e';
		grades[5]='f';
		
		System.out.println(grades[1]);
		System.out.println("-------------------------");
		
		char[] grade= {'a', 'b', 'c', 'd', 'e', 'f'};
		
		//System.out.println(grade[0]);
		
		for (int i=0; i<grade.length;i++) {
			System.out.print(grade[i]+" ");
		}
	}

}
