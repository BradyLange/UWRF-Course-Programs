package campus;

public class Person {
	
	private String id;
	private String lastName;
	private String firstName;
	
	//Alternate constructor
	public Person(String id, String last, String first)
	{
		this.id = id;
		this.lastName = last;
		this.firstName = first;
	}
	
	//Default constructor
	public Person()
	{
		id = "";
		lastName = "";
		firstName = "";
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getId() {
		return id;
	}
	
	public String toString()
	{
		return id + ": " + firstName + " " + lastName;
	}

} //end of Person class
