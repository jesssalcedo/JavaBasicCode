package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * 2. Create an array of words: 
		 * Java, Saturday, day, coding, is. 
		 * Print the following sentence using
		 *  elements of array: “Saturday is Java coding Day”.


		 */
		
		String[] words=new String[5];
		
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		
		//System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		for (int i=0; i<words.length; i++) {
			System.out.print(words[i]+" ");
			
			// enhanced for loop/ advanced for loop
			
			String[] colors= {"pink", "blue", "white", "black"};
			for(String color:colors) {
			System.out.print(color+" ");
			
			
			System.out.println("----------");
			int [] numbers= {10, 20, 30, 40}; 
			
			for(int num:numbers) {
				System.out.println(num);
			}
			}
		}
		
		

	}

}
