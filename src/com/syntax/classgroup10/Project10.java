package com.syntax.classgroup10;

public class Project10 {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array?
		 */
		
		int[] num = { 10, 12, 8, 6, 70 };
		int max = 0;
​
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
​
			}
		}
		
		int secondLarge = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == max) {
				continue;
			} else if (num[i] > secondLarge) {
				secondLarge = num[i];
			}
		}
		System.out.println(secondLarge);

	}

}
