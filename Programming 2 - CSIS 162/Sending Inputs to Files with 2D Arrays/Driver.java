/*
 * Brady Lange
 * Class: CSIS 162 Prgramming
 * Program #4
 * Due Date: April 18th, 2017
 * This class of code creates a two-dimensional array of temperatures of each month of the year and then outputs the data to a text file.
 * It consists of two classes: temperature and driver	
 */

import java.io.*; //importing already coded code

public class driver { //start of driver class

	public static void main(String [] args) throws FileNotFoundException
	{
		
		//creating output file stream
		PrintWriter outFile = new PrintWriter("outFile.txt");
		
		//Creating the object (default constructor)
		temperature monthsTemperatures = new temperature();
		outFile.println(monthsTemperatures);
	
	
		//Coding information for the outFile for the lowest temp total of all the months
		double lowTemperature = temperature.indexLowTemp();
		outFile.println("\nThe lowest temperature of all months is: " + lowTemperature);
		 
		//Coding information for the outFile for the highest temp total of all the months
		double highTemperature = temperature.indexHighTemp();
		outFile.println("\nThe highest temperature of all months is: " + highTemperature);
		 
		//Coding information for the outFile for the average low temp for the year
		double averageLowTemp = temperature.avgLowTemp();
		String monthLow = String.format("%.2f" , averageLowTemp);
		outFile.println("\nThe average low temperature for the year of all the months is: " + monthLow);
		 
		//Coding information for the outFile for the average high temp for the year
		double averageHighTemp;
		averageHighTemp = temperature.avgHighTemp();
		String monthHigh = String.format("%.2f", averageHighTemp);
		outFile.println("\nThe average high temperature for the year of all the months is: " + monthHigh);
		
		//closing the outFile
		outFile.close();
		
		int [][] array = {{2,3,5}, {3,4,1}};
		for(int column = 0; column < array[0].length; column++)
			System.out.print(array[0][column]);
		
	} //end of main
	
} //end of driver class
