package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		/*
		 * Lets ask a user where is he from 
		 * based on the country we will define favorite food
		 */
		
		Scanner scan=new Scanner(System.in);
		
		String country, favoriteFood;
		
		System.out.println("Please enter which country youre from?");
	    country=scan.nextLine(); 
	    
	    switch (country.toLowerCase()) {
	    
	    case "Mexico":
	    	favoriteFood="tacos";
	    	break;
	    case "Canada":
	    	favoriteFood="poutine";
	    case "Turkey":
	    	favoriteFood="lahmacun";
	    	break;
	    case "Pakistan":
	    	favoriteFood="pati chai";
	    	break;
	    case "Egypt":
	    	favoriteFood="koshary";
	    	break;
	    case "USA":
	    	favoriteFood="burgers";
	    	break;
	    default:
	    	favoriteFood="unknown";
	    	
	    }
	    
		System.out.println("You are from "+country+ " and your favorite food is "+favoriteFood);
 System.out.println("-----------------------------------------------------------------");
 


	}

}
