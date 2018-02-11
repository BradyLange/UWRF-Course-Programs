
/*
 * Brady Lange
 * Class: CSIS 162 Programming II
 * Program 5
 * Due Date: May 9th, 2017
 * This class is the parent class and hold people attributes
 * It consists of these classes: Person, partTime, pets, Cat, bird, graduate, undergraduate, and mainClass.
 */

public class Person  
{
    protected String firstName; //store the first name //can use this String in its inherited classes
    private String lastName;  //store the last name
    private String ssn;
     
     
     
  public void calc(){
	  System.out.println(firstName);
  }
 //Default constructor
    public Person()
    {
        firstName = "";
        lastName = "";
        ssn="";

    } //end of person
    public Person (String fName){
    	firstName = fName;
    }
  
    
    
public void out(){
	System.out.println("I am in the parent out method");
}
//Constructor with parameters: Alternate
      
 

    public Person(String first, String last)
    {
    	firstName = first;
        lastName = last;
    }//end of person
    
    public Person(String first, String last, String ssN)
    {
    	firstName = first;
        lastName = last;
        ssn=ssN;
    }//end of person
    
    
    //copy constructor
    public Person(Person obj){
    	this.firstName=obj.firstName;
    	this.lastName= obj.lastName;
    	this.ssn = obj.ssn;
    }//end of Person
    
    //makeCopy
    public void makeCopy(Person obj){
    	this.firstName=obj.firstName;
    	this.lastName= obj.lastName;
    	this.ssn = obj.ssn;
    }//end of makeCopy

       //toString
    public String toString()
    {
        return ("First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Social #: " 
                + ssn + "\n");
    } //end of toString

       //set name
    public void setName(String first, String last)
    {
    	firstName = first;
        lastName = last;
    }
    
    //set SSN
    public void setSSN(String ssn)
    {
    	this.ssn = ssn;
    }

 //Method to return firstName.
       
    public String getFirstName()
    {
        return firstName;
    }//end of getFirstName

        //Method to return lastName.
    public String getLastName()
    {
        return lastName;
    }//end of getLastName
    
    //get SSN
    public String getSSN()
    {
    	return ssn;
    }
    
}//end of class Person
