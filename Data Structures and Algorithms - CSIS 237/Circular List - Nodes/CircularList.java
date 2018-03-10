package problem_1;

/*
 * CircularList class
 * Brady Lange
 * 2/23/18
 * This class constructs a circular list derived from the list class. 
 * Several methods included are insertion, deletion, searching, peeking, and finding if a list is empty.
 */

public class CircularList {
	
	//Variables
	Link current; //points to the position in the list
	//first and last variables used for list queues (more powerful)
	Link last; //points to the last link placed into the list
	Link first; //points to the first link placed into the list
	int listSize; //size of the linked list
	
	
	//Constructor
	public CircularList()
	{
		listSize = 0;
		current = null;
	}
	
	//Insert method that inserts after the current link
	public void insert(int id, double data)
	{
	      Link newLink = new Link(id, data);
	      if(isEmpty())
	      {
	    	  first = newLink;
	    	  last = newLink;
	    	  current = newLink;
	    	  newLink.next = current.next;
	    	  current.next = newLink;
	    	  listSize++;
	      }
	      else
	      {
	    	  current = first;
			  newLink.next = current.next;
			  current.next = newLink;
			  last = newLink;
		      listSize++;
	      }
	}
	
	//Delete method that deletes one link after the current link
	public Link delete()
	{
		if(isEmpty())
			return null;
		
		//If the size is 1 first and last will deleted 
		else if (listSize == 1)
		{     Link temp = current;
		      current = first = last = null;
		      listSize = 0;
		      return temp;
		}   
		
		else
		{
                     //Changing the first and last links if they are being deleted
                     if(current.next == first)
                           first = current;
                     if(current.next == last)
                           last = last.next;
                     Link deletedLink = current.next;
                     current.next = current.next.next;
                     //Decreasing the list size as a link was deleted
                     listSize--;
                     return deletedLink;
		}
		//Changing the first and last links if they are being deleted
		if(current.next == first)
			first = current;
		if(current.next == last)
			last = last.next;
		Link deletedLink = current.next;
		current.next = current.next.next;
		//Decreasing the list size as a link was deleted
		listSize--;
		return deletedLink;
	}
	
	//Delete method that deletes a link with a given key
	public Link deleteKey(int key)
	{
		//Checking if the list empty
		if(isEmpty())
			return null;
		
		//Storing the deleted link in a variable to display it was deleted
		Link returnDeletedLink;
		//Keeping track of the previous link in the list
		Link previous = current;
		int listBound = 0;
		
		while(current.id != key && listBound <= listSize)
		{
			//Keeping track of the link before moving onto the next link
			previous = current;
			//Moving through the linked list
			current = current.next;
			listBound++;
		}
		
		//Changing the first and last links if they are being deleted
		if(current.id == first.id && current.id == key)
			first = previous;
		
		if(current.id == last.id && current.id == key)
			last = last.next;
		
		if(current.id == key)
		{
			//Link that is being deleted
			returnDeletedLink = current;
			
			//Linking the previous link to the current links next link
			previous.next = current.next;
			
			//Stepping to the next link in the list since the current link is being deleted
			current = previous.next;
			
			//Decreasing list size as a link was deleted
			listSize--;
			
			return returnDeletedLink;
		}
		
		else
		{
			System.out.println("Link is not in the list. It cannot be removed.");
			return null;
		}
	}
	
	//Search method that finds data in a linked list
	public Link find(int key)
	{
		if(isEmpty())
			return null;
		
		int listBound = 0;
		//Searching for the link with a specific key
		while(current.id != key && listBound <= listSize)
		{
			current = current.next; //Go to the next link
			listBound++;
		}
		
		if(current.id == key)
			return current; //Found the link
		
		else
		{
			System.out.println("The link with the key of " + key + " is not in the list.");
			return null;
		}
	}
	
	//Displays the list method
	public void displayList()
	{
		for(int i = 0; i < listSize; i++)
		{
			//Print data
			current.displayLink();
			//Move the current to the next link
			current = current.next; 
		}
	}

	//Step method that moves from current link to the next
	public void step()
	{
		if(isEmpty())
			System.out.println("Null");
		else 
		{	
			current = current.next;
		}
	}
	
	//Peek method that returns the current link
	public void peek()
	{
		if(isEmpty())
			System.out.print("Null");
		if(current == first)
			current.next.displayLink();
		else
			current.displayLink();
	}
	
	//isEmpty checks if the linked list is empty
	public boolean isEmpty()
	{
		if(listSize == 0)
			return true;
		else
			return false;
	}
	
} //end of class
