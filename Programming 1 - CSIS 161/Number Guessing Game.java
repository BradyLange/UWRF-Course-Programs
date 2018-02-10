/*
 * Brady Lange
 * CSIS 161 Programming
 * This program generates integer random numbers between 0 and 100 for the user to guess which one it is while giving them hints.
 * Program #6
 * Section: 02
 * Meets: M,W, & F at 1:00 PM to 1:50 PM.
 */

import javax.swing.*; //importing already coded code to use for user input

public class randomNumbers { //start of class

	public static void main (String [] args) { //start of main method
	
		//Declaring variables
		int num; //variable to store the random number
		int guess = 0; //variable to store the number guessed by the user
		String strGuess;
		boolean done; //boolean variable to control the loop

		num = (int) (Math.random() * 100); //converting Math.random() to integer

		done = false; //flag controlled loop

		int diff = 0; //setting to 0 so the program will run 

		int counter = 1; //number of tries

		while (!done && counter <= 5)
		{ //start of while 
			strGuess=JOptionPane.showInputDialog("Enter an Integer:\n" + "greater than or equal to zero and less than a hundred.");
			guess = Integer.parseInt(strGuess);
			System.out.println();
			diff =  Math.abs(num - guess); 

			//Beginning of if and else statement
			if (guess < 0 || guess > 100) 
			{ //if the users input isn't what is asked for it will receive the message below
				JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
				counter ++; //adding 1 to the counter to keep track of how many times the user has guessed
			}	
			else
				if (guess == num && diff == 0) 
				{ //using the or statement so the user doens't input a number less than 0 or more than 100 on accident
					JOptionPane.showMessageDialog(null, "You guessed the correct number.");
					done = true; //setting this to true will stop the loop since the user answered correctly (flag controlled loop)
				} //end of if 
			else
				if (guess < num && diff >= 0 && diff < 15) 
				{
					JOptionPane.showMessageDialog(null, "Your guess is somewhat low compared to the number.");
					counter ++;
				}
			else 
				if (guess < num && diff >= 15 && diff < 30) 
				{
					JOptionPane.showMessageDialog(null, "Your guess is moderately low compared to the number.");
					counter ++;
				}
			else 
				if (guess < num && diff >= 30 && diff < 50) 
				{
					JOptionPane.showMessageDialog(null, "Your guess is low compared to the number.");
					counter ++;
				}
			else 
				if (guess < num && diff >= 50) 
				{
					JOptionPane.showMessageDialog(null, "Your guess is very low comapared to the number.");
					counter ++;
				}
			else
				if (guess < num) 
				{
					JOptionPane.showMessageDialog(null, "Your guess is lower than the number. \n Guess again!");
					counter ++;
				}
			else
				if (guess > num && diff > 0 && diff < 15) 
				{
					JOptionPane.showMessageDialog(null, "Your guess is somewhat high compare to the number.");
					counter ++;
				}
			else 
				if (guess > num && diff >= 15 && diff < 30) 
				{
					JOptionPane.showMessageDialog(null, "Your guess is moderately high compared to the number.");
					counter ++;
				}
			else 
				if (guess > num && diff >= 30 && diff < 50) 
				{
					JOptionPane.showMessageDialog(null, "Your guess is high compared to the number.");
					counter ++;
				}
			else 
				if (guess > num && diff >= 50) 
				{
					JOptionPane.showMessageDialog(null, "Your guess is very high compared to the number.");
					counter ++;
				}
			else 
				if (guess > num) 
				{
					JOptionPane.showMessageDialog(null, "Your guess is higher than the number. \n Guess again!");
					counter ++;
				}
			else {
				JOptionPane.showMessageDialog(null, "Your input couldn't be determined. Please try again.");
				counter ++;
				}

		} //end of while
		
		//after the loop is completed I am notifying the users that they were correct or why the program quit on them
		if (guess == num && diff == 0)
			JOptionPane.showMessageDialog(null, "Congrats for guessing the correct number!");
		else
			JOptionPane.showMessageDialog(null, "You have guessed the number wrong too many times (5) restart the program please.");
	
	} //end of main method
	
} //end of class
