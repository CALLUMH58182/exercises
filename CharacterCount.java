package com.as.cs.exercises;
import java.util.*;
public class CharacterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls input some string");
		String someString = sc.nextLine();
		String[] listedString = someString.split("|");
		int numberOfY = 0;
		for(int x=0;x<listedString.length;x++){
			System.out.println(listedString[x]);
			if(listedString[x].equals("y")){
				numberOfY+=1;
				System.out.println(listedString[x]);
			}
		
		}
		
		System.out.println(String.format("There are %d Ys" , numberOfY));
		
	}	

}