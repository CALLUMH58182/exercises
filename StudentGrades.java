package com.as.cs.exercises;

public class StudentGrades {

	public static void main(String[] args) {
		float quiz = 67;
        float midTerm = 85;
        float finalScore = 72;
        
        float average = (quiz + midTerm + finalScore) / 3;
        System.out.println(average);
        
        if(average>=80){
        	System.out.println("A*");
        }
        else if(average>=70){
        	System.out.println("A");
        }
        else if(average>=60){
        	System.out.println("B");
        }
        else if(average>=50){
        	System.out.println("C");
	
	}

}
}