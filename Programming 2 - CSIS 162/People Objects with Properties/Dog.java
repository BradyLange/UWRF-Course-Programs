
/*
 * Brady Lange
 * Class: CSIS 162 Programming II
 * Program 5
 * Due Date: May 9th, 2017
 * This class has dog specific attributes
 * It consists of these classes: Person, partTime, pets, Cat, bird, graduate, undergraduate, and mainClass.
 */


public class dog extends pets { //is-a pet 

	//states
	private String size;
	private boolean kidFriendly;
	private boolean huntingDog;
	
	//default constructor 
	public dog()
	{
		super();
		size = "N/A";
		kidFriendly = false;
		huntingDog = false;
	}
	
	//alternate constructor
	public dog(String size, boolean kidF, boolean hDog, String breed, String petName, String dateOfBirth)
	{
		super(breed, petName, dateOfBirth);
		this.size = size;
		kidFriendly = kidF;
		huntingDog = hDog;

	}
	
	//copy constructor
	public dog(dog obj)
	{
		super(obj);
		this.size = obj.size;
		this.kidFriendly = obj.kidFriendly;
		this.huntingDog = obj.huntingDog;
	}
	
	//setters
	public void setSize(String size)
	{
		this.size = size;
	}
	
	public void setKFriendly(boolean kFriend)
	{
		this.kidFriendly = kFriend;
	}
	
	public void setHDog(boolean hDog)
	{
		this.huntingDog = hDog;
	}
	
	//getters
	public String getSize()
	{
		return size;
	}
	
	public boolean getKFriendly()
	{
		return kidFriendly;
	}
	
	public boolean getHDog()
	{
		return huntingDog;
	}
	   
	
	//makeCopy method
	public void makeCopy(dog obj)
	{
		this.size = obj.size;
		this.kidFriendly = obj.kidFriendly;
		this.huntingDog = obj.huntingDog;
	}
	
	//toString
	public String toString()
	{
		String petsData = super.toString();
		String data = "DOG: " + "\n" + petName + "'s size: " + size +"\n" + "Is " + petName + " kid friendly: " + kidFriendly + "\n" + "Is " + petName + " a hunting dog: " + huntingDog + "\n" + petsData;
				return data;
	}
	
	
	
	
} //end of dog class
