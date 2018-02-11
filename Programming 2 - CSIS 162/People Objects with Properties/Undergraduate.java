
/*
 * Brady Lange
 * Class: CSIS 162 Programming
 * Program #5
 * Due Date: May 9th, 2017
 * This class has undergraduate specific attributes
 * It consists of these classes: Person, partTime, pets, Cat, bird, graduate, undergraduate, and mainClass.
 */

public class undergraduate extends partTime { //considered a part time employee (is-a)

	//states
	private double gpa;
	private String classification;
	
	//default constructor
	public undergraduate()
	{
		super();
		gpa = 0;
		classification = "";
	}
	
	//cat pet alternate constructor
	public undergraduate(double gpa, String classi, String first, String last, String ssn, double rate, double hours, bird one, dog two, Cat three)
	{
		super(first, last, ssn, rate, hours, one, two, three);
		this.gpa = gpa;
		classification = classi;
	}
	
	//copy constructor
	public undergraduate(undergraduate obj)
	{
		this.gpa = obj.gpa;
		this.classification = obj.classification;
	}
	
	//getters
	public double getGPA()
	{
		return gpa;
	}
	
	public String getClassif()
	{
		return classification;
	}
	
	//setters
	public void setGPA(double gpa)
	{
		this.gpa = gpa;
	}
	
	public void setClassif(String classi)
	{
		classification = classi;
	}
	
	//makeCopy method
	public void makeCopy(undergraduate obj)
	{
		this.gpa = obj.gpa;
		this.classification = obj.classification;
	}
	
	//toString method
	public String toString()
	{
		String partTimeData = super.toString();
		String data = firstName + "'s GPA: " + gpa + "\n" + "Classification: " + classification + "\n" + partTimeData + "\n";
		return data;
	}
	

} //end of undergraduate class
