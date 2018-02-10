/*
 * Brady Lange
 * CSIS 161 Programming
 * Section: 02
 * Meets: M,W, & F at 1:00 PM to 1:50 PM.
 */
//This program uses user defined methods and provides assistance with tax returns for people.

import java.util.*; //importing predefined code 

public class programOne { //start of public class
	static Scanner console = new Scanner(System.in); //adding static to be able to use on class level
//Declaring finals
	static final String cont = "continue"; //adding static to be able to use on class level
	static final String stop = "stop"; //adding static to be able to use on class level
public static void main(String [] args) { //start of main method
	
//Declaring variables
double yearlyIncome;
double consultTime;
double hourlyRate;
double billing = 0; //declaring billing with 0 so the program will run properly. It will be given a number later.
String ask;

//Calling a greeting method
programOne.getGreet(); //programOne is the class and getGreet is the method being called

//Asking user if they want to continue or not using a method
ask = programOne.getOption();

while (ask.equalsIgnoreCase(cont)) { //beginning of while loop //using IgnoreCase so an error wont occur from the user typing it in with differnet cases

//Asking user for yearly income using a method
yearlyIncome = programOne.getIncome();
	
//Asking user for hourly rate using a method
hourlyRate = programOne.getRate();
	
//Asking user for consulting time using a method
consultTime = programOne.getConsult();
	
//Determining the billing using a method
billing = programOne.getBilling(yearlyIncome, hourlyRate, consultTime, billing);
	
//Printing out the output using a method
programOne.getOutput(yearlyIncome, hourlyRate, consultTime, billing);

//Asking the user again if they'd like to continue or stop using a method

ask = programOne.getOption(); //already created this code previously in the program

} //end of while loop	
	
//Calling a goodbye method
if (ask.equalsIgnoreCase(stop))
	programOne.getBye();	
else 
	System.out.println("There has been an error with what you have typed. Sorry please try again!");
	
} //end of main method

		public static void getGreet() { //start of getGreet method
			System.out.println("Hello there valued customer! Welcome to A & A Accounting. We are glad you chose us to help you with your tax returns!");
			return; //nothing will be returned
		} //end of getGreet method
		public static String getOption() {
			System.out.print("Would you like to continue or stop? ");
			String ask = console.next();
			return ask; //throwing back the variable ask to its call
		} //end of getOption method
		public static double getIncome() { //start of getYrIncome method
			System.out.print("What is your yearly income? ");
			double yearlyIncome = console.nextDouble();
			return yearlyIncome;
		} //end of getIncome method	
		public static double getRate() { //start of getRate method
			System.out.print("What is your hourly rate? ");
			double hourlyRate = console.nextDouble();
			return hourlyRate;
		} //end of getRate method
		public static double getConsult() { //start of getConsult method
			System.out.print("How much consulting time in minutes did you need? ");
			double consultTime = console.nextDouble();
			return consultTime;
		} //end of getConsult method
		public static double getBilling(double val1, double val2, double val3, double bill) { //start of getBilling method
			if (val1 <= 25000 && val3 <= 30)
				 bill = 0;
			else if (val1 <= 25000 && val3 > 30)
				 bill = val2 * 0.4 * ((val3-30)/60);
			if (val1 > 25000 && val3 <= 20)
				bill = 0;
			else if (val1 > 25000 && val3 > 20)
				bill = val2 * 0.7 * ((val3-20)/60);
			return bill;
		} //end of getBilling method
		public static void getOutput(double val1, double val2, double val3, double val4) { //start of getOutput method
			String billForm = String.format("%.2f", val4); //formatting these numbers as they are money and require two decimal places only.
			String incomeForm = String.format("%.2f", val1);
			String rateForm = String.format("%.2f", val2);
			System.out.println("Your billing amount is $" + billForm);
			System.out.println("Based off of making $" + incomeForm + " with " + val3 + " minutes of help and rate of $" + rateForm + " per hour.");
			return; //void method
		} //end of getOutput method
		public static void getBye() { //start of bye method
			System.out.println("Thank you for using A & A Accounting Firm. I hope you liked our service. Please come again, good bye!");
			return; //void method
		} //end of bye method
		
} //end of public class

