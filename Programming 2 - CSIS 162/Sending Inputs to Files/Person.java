
/* Name: Brady Lange
 * Class: CSIS 162 Programming II
 * Program 2
 * Due Date: March 7th, 2017
 * Class Name: Person
 * States: first name, last name, age, GPA, address, mobile number, GPA average, and sum.
 * This class creates a person object that outputs first name, last name, age, GPA, address, mobile number, and GPA average on an output file.
 */
import java.util.*;
import java.io.*;

public class Person { //start of Person class 
    
	//states
	private String firstName; //to store the first name of person object
    private String lastName;  //to store the last name of person object
    private int age;          //age of person object
    private double GPA; //store grade point average
    private String address; //store address
    private String mobNumber; //store mobile phone number
    private double gpaAvg; //store the average GPA
    private double sum; //store the GPA sum
       
 //List of constructors
    
    //Default constructor   
    public Person() throws FileNotFoundException
    {
        firstName = "";
        lastName = "";
        age = 0;
        GPA = 0;
        address = "";
        mobNumber = "";
        gpaAvg = 0;
        sum = 0;
        
		//create an input stream
		Scanner inFile = new Scanner(new FileReader("inFile.txt"));
		
		//create an output stream
		PrintWriter outFile = new PrintWriter("outData.txt");
		
		outFile.println("First\t\tLast\t\tAge\tGPA\tMobile Number\tAddress"); //output file //using tab to format the file to line up its data
		outFile.println("********************************************************************************************");
		
		while(inFile.hasNext()) //hasNext reads to input file (boolean statement)
		{
			//get student first name
			firstName = fName(inFile);
			outFile.printf("%-8s", firstName);
			
			lastName = lName(inFile);
			outFile.printf("%14s", lastName);
			
			age = age(inFile);
			outFile.printf("\t\t" + age);
			
			GPA = GPA(inFile);
			outFile.printf("\t" + GPA);
			sum = sum + GPA; //calculate this after GPA receives input that way it will loop and add up all six scores for calculation of the average
			
			mobNumber = mobileNumber(inFile);
			outFile.printf("\t" + mobNumber);
			
			address = address(inFile);
			outFile.printf("\t" + address);
			outFile.println(); //generates a different line for each person
					
	
		} //end of while loop
		
		outFile.println("*********************************************************************************************");
		
		//find the GPA average
		gpaAvg = sum / 6.0;
		String cAvgGPA = String.format("%.2f", gpaAvg); //formatting gpa average to two decimal spots
		outFile.println("There are 6 students in the class and the average GPA for those students is " + cAvgGPA);
		
		inFile.close(); //closing the files
		outFile.close();
		 
    } //end of Person
    
    //input first name method
    public static String fName(Scanner inFile) throws FileNotFoundException
    {
    	String name = "";
    	name = inFile.next();
    	return name;
    } //end of getFirstName method
    
    //input last name method
    public static String lName(Scanner inFile) throws FileNotFoundException
    {
    	String name = "";
    	name = inFile.next();
    	return name;
    }
    
    //input age method
    public static int age(Scanner inFile) throws FileNotFoundException
    {
    	int age = 0;
    	age = inFile.nextInt();
    	return age;
    }
    
    //input GPA method
    public static double GPA(Scanner inFile) throws FileNotFoundException
    {
    	double GPA = 0;
    	GPA = inFile.nextDouble();
    	return GPA;
    }
    
    //input mobile number method
    public static String mobileNumber(Scanner inFile) throws FileNotFoundException
    {
    	String mobNumber = "";
    	mobNumber = inFile.next();
    	return mobNumber;
    }
    
    //input address method
    public static String address(Scanner inFile) throws FileNotFoundException
    {
    	String address = "";
    	address = inFile.nextLine(); //nextLine to capture the full string
    	return address;
    }


 //List of setters
    
    //setter: sets person last name
    public void setLastName(String lname){
    	lastName= lname;
    }//end of setLastName
    
    //setter: sets person first name
    public void setFirstName(String fName){
    	firstName = fName;
    }//end of setFirstName
    
    //setter: sets person age
    public void setAge(int myAge){
    	age=myAge;
    }//end of setAge
   
    //setter: sets persons GPA
    public void setGPA(double GPA)
    {
    	this.GPA = GPA;
    }
    //setter: sets persons address
    public void setAddress(String address)
    {
    	this.address = address;
    }
    
    //setter: sets persons phone number
    public void setMobNumber(String mobNumber)
    {
    	this.mobNumber = mobNumber;
    }


//list of getters
    
    //getter: returns person first name
    public String getFirstName()
    {
        return firstName;
    }//end of getfirstName

        
    //Getter: returns person lastName.   
    public String getLastName()
    {
        return lastName;
    } //end of getlastName
    
    //Getter: returns person age
    public int getAge(){
    	return age;
    }//end of getAge
    
    //Getter: returns GPA
    public double getGPA()
    {
    	return GPA;
    }
    
    //Getter: returns address
    public String getAddress()
    {
    	return address;
    }
    
    //Getter: returns phone number
    public String getMobNumber()
    {
    	return mobNumber;
    }

    //toString: prints the states of the object person
   public String toString()
    {
      String data = "First name: " + firstName + " Last name: " + lastName + " Age: " + age
    		  + " GPA: " + GPA + " Address: " + address + " Mobile number: " + mobNumber + " GPA Average: " + gpaAvg + " Sum: " + sum;
      return data;
    } //end of toString

} //end of class person

