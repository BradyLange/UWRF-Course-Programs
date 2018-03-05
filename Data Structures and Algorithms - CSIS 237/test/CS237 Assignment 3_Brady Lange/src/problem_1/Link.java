package problem_1;

/*
 * Link class
 * Brady Lange
 * 2/23/18
 * This class has Link properties and methods that allows for the developing of the link list data structure.     
 */

public class Link {
	
	//Variables
	double data;
	int id;
	Link next;
	
	//Constructor
	public Link(int id, double data) 
	{
		this.id = id;
		this.data = data;
	}
	
	//Method that displays the contents of the link
	public void displayLink()
	{
		System.out.println("ID: " + id + " Data: " + data);
	}
	
}
