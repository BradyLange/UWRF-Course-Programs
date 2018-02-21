package book;

public class Author {
	
	private String name;
	private String email;
	private char gender;
	
	public Author()
	{
		name = "";
		email = "";
		gender = 0;
	}
	public Author (String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public Author(Author obj)
	{
		this.name = obj.name;
		this.email = obj.email;
		this.gender = obj.gender;
	}
	public String getName() 
	{
		return name;
	}
	
	public String getNameFormatted() //adding a different getName method to format the name without altering the getName method above
	{
			return ("-" + name + "\n"); //using the line break so the format of the authors looks more organized
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail (String newEmail)
	{
		email = newEmail;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public String toString()
	{
		return name + " (" + gender + ")" + " at " + email;
	}

}
