package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Tuesday and Wednesday- manual testing 
		 * Thursday --> review 
		 * Saturday and Sunday --> Java
		 * Monday and Friday -->No class
		 */
		
		String day="Monday";
				
	
	if(day.equals("Monday")|| day.equals("Friday")) {
		System.out.println("We dont have class");	
	
	}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
		System.out.println("I have manual testing class");
	
	} else if (day.equals("Saturday") || day.equals("Sunday")) {
		System.out.println("I have Java class");
	
	} else if (day.equals("Thursday")) {
		System.out.println("Then we have review class");
	}
		

	}
}

