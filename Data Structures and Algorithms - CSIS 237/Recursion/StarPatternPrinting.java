package problem_1;

import java.util.Scanner;

/*
 * Brady Lange
 * 3/11/18
 * Program 4
 * This program prints stars using recursion from a non-negative integer input
 */

public class StarPrinting 
{
	//Being user friendly if they enter in a wrong input
	Scanner console = new Scanner(System.in);

	//Recursion method that prints stars in a pattern
	public void printStarPattern(int input)
	{
		//Checking if the input entered is less than 0
		while(input < 0)
		{
			System.out.println("Error: You can only input positive numbers.\nPlease try again: ");
			input = console.nextInt();
			if(input > 0)
			{
				console.close();
				break;
			}
		}
		
		//Base case: if the input go to the next for loop
		if(input == 0)
			return;
		
		//If the input is not equal to 0 print from the input down to 1
		for(int i = 0; i < input; i++)
			System.out.print("*");
		System.out.println();
		printStarPattern(input - 1);

		//If the input is equal to zero this for loop will be executed
		for(int i = 0; i < input; i++)
			System.out.print("*");
		System.out.println();
	}
	
} //End of class
