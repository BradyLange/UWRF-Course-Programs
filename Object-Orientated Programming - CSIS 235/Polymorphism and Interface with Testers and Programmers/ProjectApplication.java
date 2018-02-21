import java.util.Random;

public class Tester implements AbleToWork {
	
	//Instance variables
	private int linesOfCodeTestedPerDay;
	private String fName;
	private String lName;
	private String testerID;
	
	//Default constructor
	public Tester()
	{
		linesOfCodeTestedPerDay = 0;
		fName = "";
		lName = "";
		testerID = "";
	}
	
	//Alternate constructor
	public Tester(int code, String f, String l, String ID)
	{
		this.linesOfCodeTestedPerDay = code;
		this.fName = f;
		this.lName = l;
		this.testerID = ID;
	}
	
	public int getLinesOfCodeTestedPerDay() {
		return linesOfCodeTestedPerDay;
	}

	public void setLinesOfCodeTestedPerDay(int linesOfCodeTestedPerDay) {
		this.linesOfCodeTestedPerDay = linesOfCodeTestedPerDay;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getTesterID() {
		return testerID;
	}

	public void setTesterID(String testerID) {
		this.testerID = testerID;
	}

	//Work Method
	public int work()
	{
		Random randGen = new Random();
		
		int codeTested = (int) (linesOfCodeTestedPerDay * 0.75) + (int) (randGen.nextInt(linesOfCodeTestedPerDay) * 0.5);
		
		return codeTested;
	}
	
	public String toString()
	{
		return "Lines of code tested per day: " + linesOfCodeTestedPerDay + "\nTesters first name: " + fName + "\nTesters last name: "
			   + lName + "\nTesters ID: " + testerID;		
	}

}
