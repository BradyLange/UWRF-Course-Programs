
/*
 * Brady Lange
 * Class: CSIS 162 Programming
 * Program #5
 * Due Date: May 9th, 2017
 * This class is the parent class to the animal classes
 * It consists of these classes: Person, partTime, pets, Cat, bird, graduate, undergraduate, and mainClass.
 */

public class pets {

	private String breed; 
	protected String petName; //so I can use petName in the animal classes
	private String dateOfBirth;
	
	//default constructor
	public pets()
	{
		breed = "N/A";
		petName = "N/A";
		dateOfBirth = "N/A";
	}
	
	//alternate constructor
	public pets(String breed, String petName, String dateOfBirth)
	{
		this.breed = breed;
		this.petName = petName;
		this.dateOfBirth = dateOfBirth;
	}
	
	//copy constructor
	public pets(pets obj)
	{
		this.breed = obj.breed;
		this.petName = obj.petName;
		this.dateOfBirth = obj.dateOfBirth;	
	}
	
	//setters
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public void setPetName(String petName)
	{
		this.petName = petName;
	}
	
	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	//getters
	public String getBreed()
	{
		return breed;
	}
	
	public String getPetName()
	{
		return petName;
	}
	
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	//makeCopy method
    	public void makeCopy(pets obj)
	{
    		this.breed = obj.breed;
    		this.petName = obj.petName;
    		this.dateOfBirth = obj.dateOfBirth;
    	}
	
	//toString method
	public String toString()
	{
		String data = "Breed: " + breed + "\n" + "Pet Name: " + petName + "\n" + "Date of Birth: " + dateOfBirth + "\n";
		return data;
	}	
	
} //end of pets class
