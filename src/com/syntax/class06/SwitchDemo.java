package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char choice='Y';
		String meaning; 
		
		//variable and matching cases MUST be of same type 
		//switch does not allow to have duplicate cases
		switch(choice) {
	
		case 'Y':
			meaning="Yes";
			break;
		case 'M':
			meaning="Maybe";
			break;
		case 'N':
			meaning="No";
			break;
		default:
			meaning="Unknown";
			
			
		}
		
		System.out.println(meaning);
		
		

	}

}
