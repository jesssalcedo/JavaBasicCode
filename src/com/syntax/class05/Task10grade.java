package com.syntax.class05;

import java.util.Scanner;

public class Task10grade {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
           Example: if user is born in March, April, May → season =“Spring”
          if user is born in June, July, August →
          season =“Summer” etc …
          At the end of the program we should see output as “You were born is season ______“.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the month that you were born in?");
		String month=scan.next();
		
		if (month.equalsIgnoreCase("March")|| month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")){
			System.out.println("You were born in the season of spring"
					+ "");
			
		}else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")){
			System.out.println("You were born in the season of summer");
			
		}else if (month.equalsIgnoreCase("September")|| month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")){
			System.out.println("You were born in the season fall");
			
		}else if (month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")) {
			System.out.println("You were born in the season Winter");
			
			
		}

	}

}
