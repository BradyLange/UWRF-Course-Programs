package problem_1;

/*
 * Brady Lange
 * Program #2
 * 2/13/18
 * This class holds deque properties of inserting (left/right), removing (left/right), peeking, checking if its empty, and checking if its full.
 */

public class Deque {
	
	//Variables
	private int left, right, numOfElems, CAPACITY, center;
	private int [] array;

	//Alternate constructor
	public Deque(int cap)
	{
		left = center + 1;
		right = center;
		numOfElems = 0;
		CAPACITY = cap;
		center = CAPACITY / 2 - 1; //Always use this algorithm for deques, used for the insert left and insert right methods
		array = new int[CAPACITY];
	}
	
	//Inserting an item from the left method
	public void insertLeft(int lNum)
	{	
		if(isFull())
		{
			System.out.println("The deque is full. You cannot insert from the left.");
		}
		else 
			if(left == 0) //checking the array to see if it needs to be wrapped
			{
				left = CAPACITY;
				left--;
				array[left] = lNum; //place the new item into the array
				numOfElems++; //increase the size of the array
			}	
		else 
		{
			left--;
			array[left] = lNum;
			numOfElems++;
		}
	}
	
	//Inserting an item from the right method
	public void insertRight(int rNum)
	{
		if(isFull())
		{
			System.out.println("The deque is full. You cannot insert from the left.");
		}
		else 
			if(right == CAPACITY - 1)
			{
				right = 0;
				array[right] = rNum; //placing the parameter into the specific spot in the array
				numOfElems++; //added an item so increase the number of elements	
			}
		else 
		{
			right++;
			array[right] = rNum;
			numOfElems++;
		}
		
	}
	
	//Removing an item from the left method
	public int removeLeft()
	{
		if(isEmpty())
		{
			System.out.println("The deque is empty. You cannot remove from the left.");
			System.exit(-1);
			return -1;
		}
		else
		{
			int temp = array[left];
			left++;
			//Wrap-around processed after
			if(left > CAPACITY - 1)
			{
				left = 0;
			}
			numOfElems--;
			return temp;
		}
	}
	
	//Removing an item from the right method
	public int removeRight()
	{
		if(isEmpty())
		{
			System.out.println("The deque is empty. You cannot remove from the right.");
			System.exit(-1);
			return -1;
		}
		else
		{
			int temp = array[right];
			right--;
			//Wrap-around processed after
			if(right < 0)
			{
				right = CAPACITY - 1;
			}
			numOfElems--;
			return temp;
		}
	}
	
	//Peeking into the deque from the right method
	public int peekRight()
	{
		if(!isEmpty())
			return array[right];
		else
		{
			System.out.println("Deque is empty you cannot peek from the right.");
			System.exit(-1);
			return -1;
		}
	}
	
	//Peeking into the deque from the left method
	public int peekLeft()
	{
		if(!isEmpty())
			return array[left];
		else
		{
			System.out.println("Deque is empty you cannot peek from the left.");
			System.exit(-1);
			return -1;
		}
	}
	
	//Checking if the deque is empty method
	public boolean isEmpty()
	{
		if(numOfElems == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Checking if the deque is full method
	public boolean isFull()
	{
		if(numOfElems == CAPACITY)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Getting the number of elements
	public int getSize()
	{
		return numOfElems;
	}
	
	
} //end of Deque class
