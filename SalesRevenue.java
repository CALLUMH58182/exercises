package com.as.cs.exercises;
import java.util.*;
public class SalesRevenue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float unitPrice;
		int quantity;
		float zeroPointOne = Float.parseFloat("0.1");
		float zeroPointOneFive = Float.parseFloat("0.15");
		
		unitPrice = sc.nextFloat();
		quantity = sc.nextInt();
		
		float revenue = unitPrice * quantity;
		
		
		if(quantity>=120){
			revenue = revenue - (revenue*zeroPointOneFive);
		
		}
		else if(quantity>=100)
			revenue = revenue - (revenue*zeroPointOne);
		
	System.out.println(Math.round(revenue*100)/100);
		
		
		

	}

}
