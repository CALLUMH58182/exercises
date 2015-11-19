package com.as.cs.exercises;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls input which fibonacci number you would like");
		int nth = sc.nextInt();
		int a=0;
		int b=1;
		int temp;
		for(int i=1;i<nth;i++){
			temp=a+b;
			a=b;
			b=temp;
		}
		
		System.out.println(a);
		
		}

	}


