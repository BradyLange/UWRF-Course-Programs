package book;

public class TestBook {

	public static void main(String[] args) {

		//creating author information
		Author author1 = new Author("William Collins", "collinsw@lafayette.edu", 'M');
		//creating book information
		Book book1 = new Book("Data Structures and the Java Collections Framework", author1, 112.89);
		//printing out the author and book
		System.out.println(book1);
	   //changing the authors email
		book1.getAuthor().setEmail("collinsw@cs.lafayette.edu");
		//printing out the new information
		System.out.println("\n" + book1);

	} //end of main method

} //end of TestBook class
