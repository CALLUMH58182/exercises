package com.as.cs.exercises;

public class IfAndLoops {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
	  if(x < 50){
		  System.out.println("x is less than 50");
	  }else{
		  System.out.println("x is not less than 50");
	  }if(x == 25){
		  System.out.println("x is 25");
	  }else if(x == 75){
		  System.out.println("x is 75");
	  }
	  if(x == 30){
		  if(y == 10){
			  System.out.println("x = 30, y = 10");
		  }
	  }
}
}

