package Excercises;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double sideA;
		double sideB;
		double sideC;
		String chooseSideString = null;
		
		System.out.println("Would you like help to solve a right triangle? \nPlease enter which side you are solving for>>> \nA\nB\nC ");
		chooseSideString = input.nextLine();
		
		if(chooseSideString.equalsIgnoreCase("A"));
		{
			System.out.println("Please enter side B");
			
			System.out.println("Please enter side C");
			
			sideA = Math.sqrt(sideC) - Math.sqrt(sideB);
			
			System.out.println("Side A is " + sideA);
					
		}
		
		
		
		
		

	}

}
