package com.syntax.classgroup10;

public class Project11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 5, 50, 6, 50, 12, 1 };
		​
				for (int i = 0; i < num.length; i++) {
					for (int j = i + 1; j < num.length; j++) {
						if (num[i] == num[j]) {
							System.out.println(num[i] + " and " + num[j]);
						}
					}
				}
	}

}
