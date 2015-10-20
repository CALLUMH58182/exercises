package com.as.cs.exercises;

public class TestsSwitchz {

	public static void main(String[] args) {
		char grade = 'C';
		
		switch(grade)
		{
		case 'A' :
			System.out.println("Noice");
			break;
		case 'B' :
		case 'C' :
			System.out.println("Pretty Good");
			break;
		case 'D' :
		case 'E' :
			System.out.println("Ok I guess");
			break;
		case 'F' :
			System.out.println("Erm wanna have another go?");
			break;
		case 'U' :
			System.out.println("LOL just give up");
		default :
			System.out.println("No no");
	}
	System.out.println("Your grade is " + grade);
 			
}
}

