/*
 * Name: Brady Lange
 * Class: CSIS 162 Programming
 * Program #3
 * Due Date: April 7th, 2017
 * This Java program works with arrays and objects by reading data from an inFile and outputting them formatted in an outFile.
 * It consists of two classes: gradebook and driver	 
 */

import java.util.*; //importing already coded code
import java.io.*;

public class gradebook { //start of gradebook class
	
	private String firstName, lastName;
	private double [] scores = new double [5];
	static private Scanner inFile; //static variables because they belong to every object
	static private int flag; //to control the inFile
	private double averageScores; //one students average
	private char grade; //letter grade of students average score
	private double sum; //some of students scores
	private static double avg; //finding the average of the whole class so it will be static

	//default constructor
	public gradebook()  throws FileNotFoundException
	{
		firstName = "";
		lastName = "";
		
		if(flag == 0) //will allow the file to not be reopened each time the default constructor is looped
			inFile = new Scanner(new FileReader("inFile.txt"));
		
		//reading the students names
		firstName = inFile.next();
		lastName = inFile.next();
		
		//file will not be able to be reopened anymore
		flag = 1;
		
		//loop for the student test scores
		for(int index = 0; index < scores.length; index++)
			{
			scores[index] = inFile.nextDouble();
			sum += scores[index];
			averageScores = sum / scores.length;
			}
		 //adding the average scores of the students
		avg += averageScores;
		
		//determine letter grade
		if (averageScores >= 90)
			grade = 'A';
		else if (averageScores >= 80 && averageScores < 90)
			grade = 'B';
		else if (averageScores >= 70 && averageScores < 80)
			grade = 'C';
		else if (averageScores >= 60 && averageScores < 70)
			grade = 'D';
		else if (averageScores < 60)
			grade = 'F';
		else 
			grade = '?';
		
	} //end of default constructor
	
	//alternate constructor
	public gradebook(String firstName, String lastName, double [] scores) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		for(int index = 0; index < scores.length; index++)
			this.scores[index] = scores[index];
	}
	
	//class average method
	public static double classAverage()
	{
		//closing the inFile
		inFile.close();
		return avg / 10;
	}
	
	//setters
	public void setFirstName(String name)
	{
		firstName = name;
	}
	
	public void setLastName(String name)
	{
		lastName = name;
	}
	
	public void setScores(double [] scores)
	{
		for(int index = 0; index < scores.length; index++)
			this.scores[index] = scores[index];
	}

	//getters
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public double [] getScores()
	{
		double [] tempArray = new double[scores.length];
		for(int index = 0; index < tempArray.length; index++)
			tempArray[index] = this.scores[index];
		return tempArray;
	}
	
	//object copy constructor
	public gradebook(gradebook obj)
	{
		this.firstName = obj.firstName;
		this.lastName = obj.lastName;
		//creating a copy for the scores array with for loop
		for(int index = 0; index < obj.scores.length; index++)
			this.scores[index] = obj.scores[index];
	}
	
	//makeCopy constructor
	public void makeCopy(gradebook obj)
	{
		this.firstName = obj.firstName;
		this.lastName = obj.lastName;
		//creating a copy for the scores array with for loop
		for(int index = 0; index < obj.scores.length; index++)
			this.scores[index] = obj.scores[index];
	}
	
	//getCopy constructor
	public gradebook getCopy() throws FileNotFoundException
	{
		gradebook tempObj = new gradebook();
		tempObj.firstName = firstName;
		tempObj.lastName = lastName;
		//creating a copy for the scores array with for loop
		for(int index = 0; index < tempObj.scores.length; index++)
			tempObj.scores[index] = scores[index]; 
		return tempObj;
	}
	
	//isEqual method
	public boolean isEqual(gradebook obj)
	{
		double [] tempArray = new double[scores.length];
		for(int index = 0; index < tempArray.length; index++)
			tempArray[index] = obj.scores[index];
		return firstName.equals(obj.firstName) && lastName.equals(obj.lastName) && tempArray == obj.scores;
	}
	
	//array copy constructor
	public int [] copyArray(int [] array)
	{
		int [] tempArray = new int[array.length];
		for(int index = 0; index < array.length; index++)
			tempArray[index] = array[index];
		return tempArray;
	}
	
	//finding equal arrays
	public boolean findTheSame(int [] one, int [] two)
	{
		if(one.length != two.length)
			return false;
		else
			for(int index = 0; index < one.length; index++)
				if(one[index] != two[index])
					return false;
		return true;
	}
	
	//toString statement
	public String toString()
	{
		String tempArray = "";
		for(int index = 0; index < scores.length; index++)
			tempArray += scores[index] + "\t";
		String fName = String.format("%-7.5s", firstName); //formatting the names
		String lName = String.format("%1s", lastName);
		String avgForm = String.format("%.2f", averageScores); //formatting to two decimal places
		String data = fName + "\t\t" + lName + "\t" + tempArray + avgForm + "\t " + grade; 
		return data;
	}
	
} //end of gradebook class
