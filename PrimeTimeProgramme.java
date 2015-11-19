package com.as.cs.exercises;
import java.util.*;
public class PrimeTimeProgramme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls gimme dat number");
		float number = sc.nextInt();
		float numberRoot = (float) Math.sqrt(number);
		int x=0;
		int i=1;
		boolean isPrime= true;
		while(x==0){
			if((i+=1)<numberRoot){
				i+=1;
			}
		
			else{x=1;}
			if(x==0){
				if(Math.round(number/i)==number/i){
					x=1;
					isPrime= false;
				
				}
			}
		}

		if(isPrime==true){
			System.out.println("Yh dat was PrimeTime!");
		}
		else{
			System.out.println("Yh dat wasn't Primetime...");
		}
		
	 }
  }


