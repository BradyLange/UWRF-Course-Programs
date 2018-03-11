package problem_1;

import java.util.Scanner;

/*
 * Brady Lange
 * 3/11/18
 * Program 4
 * This program tests the class StarPrinting to make sure the stars are printed out properly 
 */

public class StarPrintingApp {

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		
		//Instantiating the StarPrinting class
		StarPrinting printPattern = new StarPrinting();

		//Printing out a star pattern
		System.out.println("Enter the number of lines in the star pattern you want: ");
		int input = console.nextInt();
		printPattern.printStarPattern(input);
		
		console.close();

	} //End of main method

} //End of class
