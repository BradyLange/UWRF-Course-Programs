
/*
 * Brady Lange
 * Class: CSIS 162 Programming II
 * Program 5
 * Due Date: May 9th, 2017
 * This class has graduate specific attributes
 * It consists of these classes: Person, partTime, pets, Cat, bird, graduate, undergraduate, and mainClass.
 */

public class graduate extends partTime { //considered a part time employee (is-a)
	
	//states
	private String BS;
	private String AS;
	private double monthSal;
	
	//default constructor
	public graduate()
	{
		super();
		BS = "";
		AS = "";
		monthSal = 0;
	}
	
	//alternate constructor
	public graduate(String BS, String AS, double monthSal, String first, String last, String ssn, double rate, double hours, bird one, dog two, Cat three)
	{
		super(first, last, ssn, rate, hours, one, two, three);
		this.BS = BS;
		this.AS = AS;
		this.monthSal = monthSal;
	}
	
	//copy constructor
	public graduate(graduate obj)
	{
		this.BS = obj.BS;
		this.AS = obj.AS;
		this.monthSal = obj.monthSal;
	}
	
	//getters
	public String setBS()
	{
		return BS;
	}
	
	public String setAS()
	{
		return AS;
	}
	
	public double setMonthSal()
	{
		return monthSal;
	}
	
	//setters
	public void setBS(String BS)
	{
		this.BS = BS;
	}
	
	public void setAS(String AS)
	{
		this.AS = AS;
	}
	
	public void setMonthSal(double monthSal)
	{
		this.monthSal = monthSal;
	}
	
	//makeCopy method
	public void makeCopy(graduate obj)
	{
		this.BS = obj.BS;
		this.AS = obj.AS;
		this.monthSal = obj.monthSal;
	}
	
	//getCopy method
	
	
	//toString method
	public String toString()
	{
		String partTimeData = super.toString();
		String data = firstName + "'s BS Degree: " + BS + "\n" + firstName + "'s AS Degree: "  + AS + "\n"  + partTimeData;
		return data;
	}
	
	

} //end of graduate class
