package com.syntax.class02;

import java.nio.file.spi.FileSystemProvider;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Jessica"; //non primitives start with Capital (S) 
		
		String lastName="Salcedo"; // 
		
		long phone= 123456790l; 
		
		// xxx-xxx-xxxx 
		
		String phoneNumber="123-456-7890"; 
		
		String address="123 Washington St"; 
		
		int age =30; 
		String city="Miami"; 
		
		
		//shortcut for printing 
		//type syso =ctrl +space --> hit enter
		
		/*we can use + -> works as concatenation operator 
		 * to attach string to string 
		 * to attach string to int 
		 * to attach string to doubke 
		 * to any other type 
		 */
		
		/* We can use + to atttach String to String
		 */
		
		System.out.println(name+" "+lastName); //Jessica Salcedo
		
		//create a print out, Jessica lives in Miami 
		System.out.println(name+" lives in "+city);
		
		//Jessica is 30 years old 
		
		System.out.println(name+ " is "+age+" years old");

	}

}
