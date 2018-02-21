package book;

public class TestBookV2 {
	
	public static void main(String [] args)
	{
		//instantiating information for the 3 authors
		Author author1 = new Author("Brett McLaughlin", "brett@oreilly.com", 'M');
		Author author2 = new Author("Gary Police", "gpolice@cs.wpi.edu", 'M');
		Author author3 = new Author("David West", "dwest@ivarjacobson.com", 'M');
		
		//declaring how many authors are in the array
		Author [] multipleAuthors = new Author[3];
		
		//creating a for loop to populate the array
		for(int i = 0; i < multipleAuthors.length; i++)
		{
			multipleAuthors[i] = new Author(author1); //prints out the first author in the slot 0
			
			if(i == 1) //prints out the second author in the slot 1
			{
				multipleAuthors[i] = new Author(author2);
			}
			else if(i == 2) //prints out the third author in the slot 2
			{
				multipleAuthors[i] = new Author(author3);
			}
			else 
				continue; //continues with the loop
		} //end of for loop
		
		//creating a version 2 of the book that allows for multiple authors
		BookV2 book1 = new BookV2("Head First Object-Orientated Analysis & Design", 59.99, multipleAuthors);
		
		//printing out the name of the book, price of it, and number of authors associated with the book
		System.out.println(book1);
		
		//printing out the authors names
		book1.printAuthors();
		
	} //end of main method

} //end of TestBookV2 class
