package book;

public class Book { 
	
	//instance variables
	private String name;
	private Author author;
	private double price;
	
	//alternate constructor
	public Book(String name, Author author, double price)
	{
		this.name = name;
		this.author = author;
		this.price = price;
	} //end of alternate constructor
	
	//getters
	public String getName()
	{
		return name;
	} //end of getName method
	
	public Author getAuthor()
	{
		return author;
	} //end of getAuthor method
	
	public double getPrice()
	{
		return price;
	} //end of getPrice method
	
	//setter
	public void setPrice(double price)
	{
		this.price = price;
	} //end of setPrice method
	
	//toString method
	public String toString()
	{
		return "Book name: " + name + "\nBy: " + author;
	} //end of toString method
	

} //end of Book class
