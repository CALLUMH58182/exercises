package com.as.cs.exercises;

public class TestArray {

	public static void main(String[] args) {
		double[] myList= {1.9, 2.9, 3.4, 3.5};
		
		// Print all array elements
		
		for (int i = 0; i < myList.length; i++){
				System.out.println(myList[i] + " ");   // print vertical as 'println'	
		}
		
		// Sum of all elements
		
		double total = 0;
		
		for (int i = 0; i < myList.length; i++){
			total += myList[i];	
		}
		System.out.println("Total is: " + total);
		
		// Finding greatest element
		
		double max = myList[0];
		for (int i = 1; i < myList.length; i++){
			if (myList[i] > max) max = myList[i];
		}
		System.out.println("Max is " + max);

	}

}
