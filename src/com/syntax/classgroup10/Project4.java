package com.syntax.classgroup10;

public class Project4 {

	public static void main(String[] args) {
		/*
		 *  Create a 2D array or integer type where you
		 *   will store odd and even numbers. Develop a 
		 *   program which will identify/print the even numbers only.
		 */
		
		
		int [][] num = {
				
				{2, 4, 6, 8, 10},
				{1, 3, 5, 7, 9},
				
		        };
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(num[i][j]%2==0) {
					System.out.println("This number is even "+num[i][j]);
				}else {
					System.out.println("This number is odd"+num[i][j]);
				}
			}
		}

	}

}
