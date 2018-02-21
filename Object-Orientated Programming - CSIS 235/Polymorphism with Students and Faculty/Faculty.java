package campus;

public class Faculty extends Person { //Faculty is-a Person

	//Instance variables
	private String dept;
	private String rank;
	
	//Default constructor
	public Faculty()
	{
		dept = "";
		rank = "";
	}
	
	//Alternate constructor
	public Faculty(String id, String lastName, String firstName, String dept, String rank)
	{
		super(id, lastName, firstName);
		this.dept = dept;
		this.rank = rank;
	}
	
	//Getters
	public String getDept()
	{
		return dept;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	//Setters
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	
	//toString Method overriding the Person class
	@Override
	public String toString()
	{
	return super.getFirstName() + " " + super.getLastName() + " " + dept;
	}
} //end of Faculty class
