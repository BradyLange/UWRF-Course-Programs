import java.io.*; //importing already coded code

public class driver { //start of driver class
	
	public static void main(String [] args) throws FileNotFoundException
	{ //start of main method
		
		//creating the outFile stream
		PrintWriter outFile = new PrintWriter("outFile.txt");
		outFile.println("First:\t\tLast:\tTest 1:\tTest2:\tTest 3:\tTest 4:\tTest 5:\tAverage: Grade:");
		
		//create array of students
		gradebook [] students = new gradebook[10];
		
		//fill the array
		for(int index = 0; index < students.length; index++)
			students[index] = new gradebook(); 
		
		//printing out the array
		for(int index = 0; index < students.length; index++)
			outFile.println(students[index]);
		
		//printing out the class average of scores
		outFile.println("Class Average of Scores: " + gradebook.classAverage()); //calling method I wrote
		
		//closing the outFile
		outFile.close();
		
	} //end of main method

} //end of driver class
