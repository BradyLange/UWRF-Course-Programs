package problem_1;

/*
 * CircularListApp class
 * Brady Lange
 * 2/23/18
 * This class tests the Circular Lists methods.
 */

public class CircularListApp {

	public static void main(String[] args) {
		
		//Declaring a circular link list
		CircularList list = new CircularList();
		
		//Inserting links into the list
		list.insert(1, 59);
		list.insert(2, 65);
		list.insert(3, 2);
		list.insert(4, 90.5);
		 
		//Displaying the links in the list
		System.out.println("**************************************");
		System.out.println("Links inserted: (First (bottom) | Last (top))");
		list.displayList();
		System.out.println("**************************************");
		 
		//Finding a link in the list
		int findKey = 3;
		Link findLink = list.find(findKey);
		if(findLink != null)
		{
			System.out.print("Link " + findKey + " was found: ");
			findLink.displayLink();
		}
		System.out.println("**************************************");
		
		//Peeking into the list
		System.out.print("Peeking into the list: ");
		list.peek();
		System.out.println("**************************************");

		//Going to the next link in the list
		list.step();
		
		//Checking to see if the step method worked with peek method
		System.out.print("Peeking into the list to show stepping over method: ");
		list.peek();
		System.out.println("**************************************");
		
		//Deleting links using a key to find the exact one
		int key = 3;
		Link deleteKeyLink = list.deleteKey(key);
		if(deleteKeyLink != null)
		{
			System.out.print("Deleted link with the key " + key + ": ");
			deleteKeyLink.displayLink();
		}
		System.out.println("**************************************");
		
		//Deleting links from the list with no key
		while(list.listSize != 0)
		{
			Link deletedLink = list.delete();
			System.out.print("Deleted: ");
			deletedLink.displayLink();
		}
		
		System.out.println("**************************************");
		//Checking if the list is empty
		boolean empty = list.isEmpty();
		System.out.println("Is the list empty: " + empty);
		System.out.println("**************************************");
		
		//Displaying the list to prove it is empty
		System.out.print("Empty list: ");
		list.displayList();

	} //end of main method

} //end of class
