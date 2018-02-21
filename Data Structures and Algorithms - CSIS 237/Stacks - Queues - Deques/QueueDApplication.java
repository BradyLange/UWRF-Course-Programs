package problem_2;

/*
 * Brady Lange
 * Program #2
 * 2/13/18
 * This class tests the queues methods
 */

public class QueueDApp {

	public static void main(String[] args) {
		
		//Instantiating the queue
		QueueD queue = new QueueD(4);
		
		//Inserting numbers into the queue
		queue.insert(111);
		queue.insert(113);
		queue.insert(1);
		
		//Removing numbers from the queue, should remove numbers based upon 'FIFO' 
		queue.remove();
		queue.remove();

		//Inserting more numbers to prove the queue can use wrapping
		queue.insert(4);
		queue.insert(67);
		queue.insert(98);
		
		//Removing the rest of the values in the queue after it has shown wrapping
		int size = queue.getSize();
		for(int i = 0; i < size; i++)
		{
			int rm = queue.remove();
			System.out.println("Removed: " + rm);
		}
		
		//Checking if the queue is empty
		boolean empty = queue.isEmpty();
		if(empty == true)
		{
			System.out.println("**************************************************");
			System.out.println("Queue is empty: " + empty);
			System.out.println("**************************************************");
		}
		
		//Checking if the queue is full
		boolean full = queue.isFull();
		if(full == true)
		{
			System.out.println("**************************************************");
			System.out.println("Queue is full: " + full);
			System.out.println("**************************************************");
		}
		
	}

}
