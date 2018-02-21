import java.util.ArrayList;
import java.util.List;

public class Project {
	
	//Instance variables
	private int linesOfCode; //prediction of the lines of code that a project will require
	private int linesOfCodeWritten; //number of lines of code the programmer has written
	private int linesOfCodeTested; //number of lines of code the tester has tested
	private int duration; //number of days the manager has given for completion of the project
	private List<AbleToWork> employees;
	
	//Alternate constructor
	public Project(int linesOfCode, int duration)
	{
		this.linesOfCode = linesOfCode;
		this.duration = duration;
		this.linesOfCodeTested = 0;
		this.linesOfCodeWritten = 0;
		this.employees = new ArrayList<AbleToWork>();
	}
	
	//Method that adds an employee to the project 
	public void addEmployee(AbleToWork employee)
	{
		employees.add(employee);
	}
	
	//Method that calculates the number of days a project took
	public int doProject()
	{
		int day = 0;
		do {
			
			for(AbleToWork emp: employees)
			{
				if(emp instanceof Programmer) {
					if(linesOfCodeWritten >= linesOfCode) {
						linesOfCodeWritten = linesOfCode;
						continue;
					}
					else
						linesOfCodeWritten += emp.work();
				}
					
				if(emp instanceof Tester) {
					if(linesOfCodeWritten <= linesOfCodeTested)
						continue;
		
						linesOfCodeTested += emp.work();
						
					if(linesOfCodeTested > linesOfCodeWritten)
						linesOfCodeTested = linesOfCodeWritten;
				}
			}
			
			day++;
			
		} while(this.linesOfCodeTested < linesOfCode || this.linesOfCodeWritten < linesOfCode);
		
		return day;
		
	}
	
	public int getLinesOfCode() {
		return linesOfCode;
	}

	public void setLinesOfCode(int linesOfCode) {
		this.linesOfCode = linesOfCode;
	}

	public int getLinesOfCodeWritten() {
		return linesOfCodeWritten;
	}

	public void setLinesOfCodeWritten(int linesOfCodeWritten) {
		this.linesOfCodeWritten = linesOfCodeWritten;
	}

	public int getLinesOfCodeTested() {
		return linesOfCodeTested;
	}

	public void setLinesOfCodeTested(int linesOfCodeTested) {
		this.linesOfCodeTested = linesOfCodeTested;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<AbleToWork> getEmployees() {
		return employees;
	}

	public void setEmployees(List<AbleToWork> employees) {
		this.employees = employees;
	}

	//toString method
	public String toString()
	{
		return "Lines of code the project requires: " + linesOfCode + "\nLines of code the programmer has wrote: " + linesOfCodeWritten
				+ "\nLines of code tested by the tester: " + linesOfCodeTested + "\nTime given to complete the project: " + duration 
				+ "\nList of the employees for the project: " + employees;
	}

}
