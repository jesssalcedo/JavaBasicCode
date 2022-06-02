package com.syntax.class06;

public class Switch {

	public static void main1(String[] args) {
		

		int day=4;
		String name;

		if (day==1) {
		name="Monday";
		
		}else if (day==2) {
		name="Tuesday";
		
		}else if (day==3) {
		name="Wednesday";
		
		}else if (day==4) {
		name= "Thursday";
		
		}else if (day==5) {
		name="Friday";
		
		}else if (day==6) {
		name="Saturday";
		
		}else if (day==7) {
		name="Sunday";
		
		}else {
		name="Invalid";
		}
		
		
		System.out.println(name);
		
		System.out.println("------------------------------------------------");
	
		
	
		
		switch(day) {
		
		
		case 1:
			name="Monday";
			break;
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6:
			name="Saturday";
			break;
		case 7:	
			name="Sunday";
		default:
			name="Invalid";
			break;  
			
		}

	}
		

}
