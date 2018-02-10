/*
 * Name: Brady Lange
 * Class: CSIS 162 Prgramming II
 * Program 4
 * Due Date: April 18th, 2017
 * Writes a java program that uses a two-dimensional array to store the highest and lowest temperatures for each month of the year. 
 * It consists of two classes: temperature and driver	 
 */
import java.util.*; //importing already coded code
import java.io.*;

public class temperature { //start of temperature class

	//states
	private static double [][] temperatures = new double [2][12]; //temps for the months

	//class variables
	private static Scanner inFile; //no setter/getter
		//averages
	private static double avgLo; //no setter/getter
	private static double averageLow; //no setter/getter
	private static double averageHigh; //no setter/getter
	private static double avgHi; //no setter/getter
	
	//default constructor
	public temperature() throws FileNotFoundException
	{
		//creating stream to text file	
		inFile = new Scanner(new FileReader("inFile.txt"));
			
			//For loop
			for(int row = 0; row < temperatures.length; row ++)
			{
				for(int column = 0; column < temperatures[row].length; column++)
				{
				temperatures[row][column] = inFile.nextInt(); //read the inFile
				}
			} //end loop
			
		//closing inFile
		inFile.close();
		
	} //end of default constructor

	//alternate constructor
	public temperature(double [][] tempObject)
	{
		for (int row = 0; row < temperatures.length; row ++)
			{
			for (int column = 0; column < temperatures[row].length; column++)
			{
			temperature.temperatures[row][column] = tempObject[row][column];
			}
			}
	} //end of alternate constructor

	//average high temperature for the year method
	public static double avgHighTemp()
	{
	int hiRo = 0;
	for (int column = 0; column < temperatures[hiRo].length; column++)
	averageHigh += temperatures[hiRo][column];
	avgHi = averageHigh / 12.0;
	inFile.close(); //closes the file
	return avgHi;
	} //end of avgHighTemp method
	
	//average low temperature for the year method
	public static double avgLowTemp()
	{
		int lowestRow = 1;
		for(int column = 0; column < temperatures[lowestRow].length; column++)
			averageLow += temperatures[lowestRow][column];	
			avgLo = averageLow / 12;	
				return avgLo;
	} //end of avgLowTemp method
	
	//method that calculates and returns the index of the highest temperatures of the year
	public static double indexHighTemp()
	{
		double hi = temperatures[0][0];
		int track = 0;
		
		for(int row = 0; row < temperatures.length; row++){
			for(int column = 0; column < temperatures[row].length; column++)
			if(temperatures[row][column] > hi) 
			{
		hi = temperatures[row][column];
		track = column;
			}
		}
			return hi;
	}//end of indexHighTemp method

	//method that calculates and returns the index of the lowest temperatures of the year
	public static double indexLowTemp()
	{
		int track = 0;
		double lo = temperatures[0][0];
		
		for (int row = 0; row < temperatures.length; row++)
		{
			for(int column = 0; column < temperatures[row].length; column++)
				if(temperatures[row][column] < lo)
				{
			lo = temperatures[row][column];
			track = row;
				}
		}
		return lo;
	} //end of indexLowTemp method
	
	//setter
	public void setTemps(double tempTemps [] [])
	{
		for(int row = 0; row < temperatures.length; row ++)
			{
			for(int column = 0; column < tempTemps[row].length; column++)
				temperatures[row][column] = tempTemps[row][column];
			}
	} //end of setTemps method
	
	//getter
	public double [][] getTemps()
	{
		double [][] temp = new double [temperatures.length][0];
		for(int row = 0; row < temperatures.length; row++)
			for(int column = 0; column < temperatures[row].length; column++)
					temp[row][column] = temperatures[row][column];
		return temp;
	} //end of getTemps method
	
	//object copy constructor 
	public temperature(temperature obj)
	{
		for(int row = 0; row < obj.temperatures.length; row++)
			for(int column = 0; column < temperatures[row].length; column++)
			temperatures[row][column] = obj.temperatures[row][column];
	}
	
	//makeCopy method
	public void makeCopy(temperature obj)
	{
		for(int row = 0; row < obj.temperatures.length; row++)
			for( int column = 0; column < temperatures[row].length; column++)
				temperatures[row][column] = obj.temperatures[row][column];
	}
	
	//getCopy method
	public temperature getCopy() throws FileNotFoundException
	{
	temperature tempObj = new temperature();

		for(int row = 0; row < tempObj.temperatures.length; row++)
			for(int column = 0; column < temperatures[row].length; column++)
			tempObj.temperatures[row][column] = temperatures[row][column]; 
	return tempObj;
	}
	
	//two dimensional array copy constructor
	public double [][] copy2DArray(double [][] array)
	{
		double [][] tempArray = new double[array.length][];
		for(int row = 0; row < array.length; row++)
			for(int column = 0; column < temperatures[row].length; column++)
				tempArray[row][column] = array[row][column];
		return tempArray;
	}
	
	//equals method
	public boolean isEqual(temperature obj)
	{
		double [][] tempArray = new double[temperatures.length][];
		for(int row = 0; row < tempArray.length; row++)
			for(int column = 0; column < temperatures[row].length; column++)
			tempArray[row][column] = obj.temperatures[row][column];
		return tempArray == obj.temperatures;
	}
	
	//finding equal two dimensional arrays
	public boolean findTheSame(double [][] one, double [][] two)
	{
		if(one.length != two.length)
	
		return false;
	else
		for(int row = 0; row < one.length; row++)
			for(int column = 0; column < temperatures[row].length; column++)
			if(one[row][column] != two[row][column])
				return false;
	return true;
	}

	//toString method
	public String toString()
	{
		String tempArray = ""; 
		String data = "";
		
		for(int row = 0; row < temperatures.length; row++)
		{
			for(int column = 0; column < temperatures[row].length; column++)
			{
		tempArray += temperatures[row][column] + " ";
			}
		data = ("The highest temperatures then lowest temperatures for each month are: " + tempArray);
		}
				return data;
	} //end of toString method

} //end of temperature class
