
/*
 * Brady Lange
 * Class: CSIS 162 Programming II
 * Program 5
 * Due Date: May 9th, 2017
 * This class has bird specific attributes
 * It consists of these classes: Person, partTime, pets, Cat, bird, graduate, undergraduate, and mainClass.
 */

public class bird extends pets { //is-a pet

	//states
	private String featherColor;
	private int beakLength;
	
	//default constructor
	public bird()
	{
		super();
		featherColor = "N/A";
		beakLength = 0;
	}
	
	public bird(String fCol, int bLen)
	{
	featherColor = fCol;
	beakLength = bLen;
	}
	
	//alternate constructor
	public bird(String featherColor, int beakLength, String breed, String petName, String dateOfBirth)
	{
		super(breed, petName, dateOfBirth);
		this.featherColor = featherColor;
		this.beakLength = beakLength;
	}
	
	//copy constructor
	public bird(bird obj)
	{
		super(obj);
		this.featherColor = obj.featherColor;
		this.beakLength = obj.beakLength;
	}
	
	//setters
	public void setFeatherColor(String color)
	{
		this.featherColor = color;
	}
	
	public void setBeakLength(int length)
	{
		this.beakLength = length;
	}
	
	//getters
	public String getFeatherColor()
	{
		return featherColor;
	}
	
	public int getBeakLength()
	{
		return beakLength;
	}
	
	//makeCopy method
	public void makeCopy(bird obj)
	{
		this.featherColor = obj.featherColor;
		this.beakLength = obj.beakLength;
	}
	
	//toString method
	public String toString()
	{
		String petsData = super.toString();
		String data = "BIRD: " + "\n" + petName + "'s feather color: " + featherColor + "\n" + petName + "'s beak length: " + beakLength + " inches" + "\n" + petsData + "\n";
		return data;
	}
	
	
} //end of bird class
