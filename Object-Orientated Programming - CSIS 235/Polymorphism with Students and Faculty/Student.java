package campus;

public class Student extends Person { //Student is-a Person
	//Instance variables
	private String major;
	private int level; //freshmen=1, sophomore=2, junior=3, senior=4, post bachelor=5

	//Alternate constructor
	public Student(String id, String lastName, String firstName, String major, int level)
	{
		super(id, lastName, firstName); //Person constructor (parent class)
		this.major = major;
		this.level = level;
	}
	
	public Student()
	{
		super();
		major = "";
		level = 0;
	}
	
	public Student(Student obj)
	{
		super(obj.getId(), obj.getLastName(), obj.getFirstName());
		this.major = obj.major;
		this.level = obj.level;
	}
	
	//Getters
	public String getMajor()
	{
		return major;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	//Setters
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	public void setLevel(int level)
	{
		this.level = level;
	}
	
	//toString Method overriding the parent class (Person)
	@Override //overriding the Person class toString method
	public String toString()
	{
		return String.format("%-25s %-25s %-25s %-25s", super.getId(), super.getFirstName() + " " + super.getLastName(), major, level);
	}
} //end of Student class
