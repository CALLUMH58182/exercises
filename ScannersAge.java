package com.as.cs.exercises;
import java.util.*;
public class ScannersAge {

	public static void main(String[] args) 
	{
		checkEligibility();

	}

	static void checkEligibility(){
		int age;
		
	//Scanner object is used to enter data
		
		Scanner sc=new Scanner(System.in);
		System.out.print("What is your age?");
		age=sc.nextInt();
		if(age>=18)
			System.out.println("Lets get wasted");
		else 
			System.out.println("Hmmm, aren't you a bit too young?");
	}
}


