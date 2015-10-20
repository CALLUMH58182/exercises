package com.as.cs.exercises;

public class StringTester {

	public static void main(String[] args) {
		//2 strings
		String firstName = "Callum";
		String lastName = "Hedges";
		String fullName = firstName+" "+lastName;
		String anotherFirstName = "Callum";
		String newName = new String("Callum");
        String str = "CallumJameyHedges";
        String subStringOne = str.substring(0,11);
        String subStringTwo = str.substring(6);
        
		System.out.println(fullName);//adds 1st and last together
		System.out.println(firstName.equals(lastName));//returns false.
		System.out.println(firstName.equals(anotherFirstName));//returns true.
		System.out.println(firstName==anotherFirstName);//returns true.
		System.out.println(firstName==newName);//false as the 'new', 
		//has created another object in heap containing address of 'Callum' in scp.
		System.out.println(subStringOne);//returns 'CallumJamey'
		System.out.println(subStringTwo);//returns 'JameyHedges'
		
	} 
	
}
