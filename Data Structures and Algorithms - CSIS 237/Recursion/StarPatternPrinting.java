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
	//Variables
	private int counter; //Keeping track of the amount of stars that have been printed
	private int totalStars; //Keeping track the max amount of stars to be printed
	private boolean upperFlag; //Flag that controls what if statement that will be executed
	
	
	//Constructor
	public StarPrinting()
	{
		counter = 0;
		totalStars = 0;
		upperFlag = false;
	}
	
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
				break;
			}
		}
		
		//Upper bound: 1 to size of input amount of stars
		if(input == 0 || upperFlag == true)
		{
			for (int i = 0; i < input + 1; i++)
			{
				System.out.print("*");
				++counter;
			}
			System.out.println();
			//Base case to stop the method
			if(counter == totalStars)
				System.exit(0);
			printStarPattern(input + 1);
		}
			
		//Lower bound size of input to 1 star
		else if(input != 0 && upperFlag == false)
		{
			for(int i = input; i > 0; i--)
			{
				System.out.print("*");
				++counter;
			}
			System.out.println();
			if(input == 1)
			{
				totalStars = counter * 2;
				upperFlag = true;
			}
			printStarPattern(input - 1);
		}
		
		//If conditions aren't met an error will be thrown
		else
		{
			System.out.println("There has been an error in printing your star pattern.");
			System.exit(1);
		}
		
		console.close();
	}
	
} //End of class
