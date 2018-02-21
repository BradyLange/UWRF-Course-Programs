package problem_3;

/*
 * Brady Lange
 * Program #2
 * 2/13/18
 * This class has stack properties
 */

import problem_1.Deque;

public class StackD {
	
	//Has-a relationship to take queue properties from deque class
	private Deque stack;
	private int maxSize;
	
	//Alternate constructor
	public StackD(int size) 
	{
		maxSize = size;
		stack = new Deque(maxSize);
	}
	
	//Insert method: Inserts numbers in a stack manner, can only insert from one end of the stack
	public void push(int input)
	{
		stack.insertRight(input);
	}
	
	//Remove method: Removes numbers in a stack manner, 'LIFO'
	public int pop()
	{
		return stack.removeRight();
	}
	
	//Peeking method that allows the user see the top number of the stack
	public int peek()
	{
		return stack.peekRight();
	}
	
	//Method that checks if the stack is empty
	public boolean isEmpty()
	{
		return stack.isEmpty();
	}
	
	//Method that checks if the stack is full
	public boolean isFull()
	{
		return stack.isFull();
	}
	
	//Method that gets the size of the stack
	public int getSize()
	{
		return stack.getSize();
	}

}
