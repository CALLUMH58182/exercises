package com.as.cs.exercises;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		int numPets = 6;
		String petStatus = (numPets < 4) ? "Within Limit": "Exceeded Limit";
		
		System.out.println("the pet status is : " + petStatus);

}
}


