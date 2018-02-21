package book;

public class BookV2 {
	
	//instance variables
	private Author [] manyAuthors;
	private String name;
	private double price;
	
	//alternate constructor
	public BookV2(String name, double price, Author [] manyAuthors)
	{
		this.name = name;
		this.price = price;
		
		this.manyAuthors = new Author[manyAuthors.length];
		for(int i = 0; i < manyAuthors.length; i++)
		{
			this.manyAuthors[i] = manyAuthors[i];
			
		} //end of for loop
		
	} //end of alternate constructor
	
	//toString method
	public String toString()
	{
		int n = 0;
		for(int i = 0; i < manyAuthors.length; i++)
		{
			n += i;
		} //end of for loop
		return "Book name: " + name + "\nPrice: " + price + "\nBy: " + n + " authors";
	}
	
	//print the authors names method
	public void printAuthors()
	{
		String authorName = "";
		for(int i = 0; i < manyAuthors.length; i++)
		{
			authorName += manyAuthors[i].getNameFormatted();
			
		}
		System.out.println(authorName);
	}
	
	

} //end of BookV2 class
