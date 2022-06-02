package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean vaccine=true;
		int dose=2;
		
		if(vaccine) {
			System.out.println("Let me check how many doses you have");
	
		     if (dose==1) {
			      System.out.println("You need one more shot");
		} else {
			System.out.println("You are fully vacinated");
		}
		}
		System.out.println("-------------------------------------");
		
		String month="June";

		int day=19;
		
		if (month.equals("May")){
			System.out.println("Today is Mothers Day");
		}else if(month.equals("June")) {
		System.out.println("Let me check what is todays date");
			
		    if(day==19) {
			System.out.println("Today is fathers day");
		}
		}
	}

}
