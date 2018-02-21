package problem_2;

/*
 * Brady Lange
 * Program #2
 * 2/13/18
 * This class has queue properties
 */

import problem_1.Deque;

public class QueueD {
	
	//Has-a relationship to take queue properties from deque class
	private Deque queue;
	private int maxSize;
	
	//Alternate constructor
	public QueueD(int size)
	{
		maxSize = size;
		queue = new Deque(maxSize);
	}
	
	//Method that inserts from one side of the queue
	public void insert(int input)
	{
		queue.insertLeft(input);
	}
	
	//Method that removes from the opposite side of where it is being inserted using 'FIFO'
	public int remove()
	{
		return queue.removeRight();
	}
	
	//Method that allows the user to see the front number
	public int peekFront()
	{
		return queue.peekRight();
	}
	
	//Method that checks if the queue is empty
	public boolean isEmpty()
	{
		return queue.isEmpty();
	}
	
	//Method that checks if the queue is full
	public boolean isFull()
	{
		return queue.isFull();
	}
	
	//Method that returns the size of the queue
	public int getSize()
	{
		return queue.getSize();
	}

}
