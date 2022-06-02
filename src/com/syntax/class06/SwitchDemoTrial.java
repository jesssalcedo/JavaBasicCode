package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemoTrial {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String instructor, meaning;
		
		System.out.println("Please enter name of instructor");
		instructor=scan.next();
		
		switch (instructor) {
		
		
		case ("Asghar"):
			  meaning= "Will take care of java assignments";
			  break;
		case ("Moazzam"):
			  meaning= "Will take care of SDLC Assignment";
			  break;
		case ("Weqas"):
			      meaning= "Will take care of Selenium assignment";
			      break;
		case ("Asel"):
			      meaning="Will take care of every assignment";
			      break;
		default:
			    meaning="Unknown";
			    
		}
		
		System.out.println("Your instructor is "+instructor+  " and she "+meaning);
				
				


	}

}
