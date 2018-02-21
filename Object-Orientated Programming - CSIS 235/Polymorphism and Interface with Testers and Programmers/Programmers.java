import java.util.Random;

public class Programmer implements AbleToWork {

	//Instance variables
	private int linesOfCodeWrittenPerDay;
	private String fName;
	private String lName;
	private String programmerID;
	
	//Default constructor
	public Programmer()
	{
		linesOfCodeWrittenPerDay = 0;
		fName = "";
		lName = "";
		programmerID = "";
	}
	
	//Alternate constructor
	public Programmer(int code, String f, String l, String ID)
	{
		this.linesOfCodeWrittenPerDay = code;
		this.fName = f;
		this.lName = l;
		this.programmerID = ID;
	}
	
	public int getLinesOfCodeWrittenPerDay() {
		return linesOfCodeWrittenPerDay;
	}

	public void setLinesOfCodeWrittenPerDay(int linesOfCodeWrittenPerDay) {
		this.linesOfCodeWrittenPerDay = linesOfCodeWrittenPerDay;
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

	public String getProgrammerID() {
		return programmerID;
	}

	public void setProgrammerID(String programmerID) {
		this.programmerID = programmerID;
	}

	//Work Method
	public int work()
	{
		Random randGen = new Random();

		int codeWritten = (int)(linesOfCodeWrittenPerDay * 0.5) + randGen.nextInt(linesOfCodeWrittenPerDay);
		
		return codeWritten;
	}

	public String toString()
	{
		return "Lines of code written per day: " + linesOfCodeWrittenPerDay + "\nProgrammers first name: " + fName + "\nProgrammers last name: "
			   + lName + "\nProgrammers ID: " + programmerID;		
	}
	
}
