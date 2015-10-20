package com.as.cs.exercises;
import java.util.*;
public class OddOrEven {

	public static void main(String[] args) {
		int[] key;
		Scanner sc = new Scanner(System.in); 
		int inputNum;
		int remainder;
		inputNum = sc.nextInt();
		remainder = inputNum%2;
		if(remainder==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}

	}

}
