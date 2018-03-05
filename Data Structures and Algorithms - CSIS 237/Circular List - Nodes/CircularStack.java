package problem_2;

import problem_1.CircularList;
import problem_1.Link;

/*
 * CircularStack class
 * Brady Lange
 * 2/23/18
 * This class uses the Circular List class to develop a stack data structure.
 */

public class CircularStack {
	
	//Variables
	CircularList list;
	int stackCap;
	int stackSize;
	
	//Constructor
	public CircularStack(int cap)
	{
		list = new CircularList();
		stackCap = cap;
		stackSize = 0;
	}

	//Delete method (popping in stack)
	public Link pop()
	{
		if(isEmpty())
			return null;
		else
		{
			stackSize--;
			return list.delete();
		}
	}
	
	//Insert method (pushing in stack)
	public void push(int id, double data)
	{
		if(isFull())
			System.out.println("Stack is full. Cannot enter more links.");
		else
		{
			list.insert(id, data);
			stackSize++;
		}
	}
	
	//Checking to see if the stack is empty
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	//Checking if the stack is full
	public boolean isFull()
	{
		if(list.isEmpty())
			return false;
		else 
			if(stackSize == stackCap)
				return true;
			else
				return false;
	}
	
	//Peeking into the stack
	public void peek()
	{
		list.peek();
	}
	
} //end of class
