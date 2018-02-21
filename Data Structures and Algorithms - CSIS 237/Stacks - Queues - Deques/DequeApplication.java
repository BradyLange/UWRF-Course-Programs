package problem_1;

/* Brady Lange
 * Program #2
 * 2/13/18
 * This class is the driver class and tests the deque class.
 */

public class DequeApp {

	public static void main(String[] args) {
		
		//Instantiating the deque
		Deque deque = new Deque(6);
	
		//Inserting from the left
		deque.insertLeft(4);
		deque.insertLeft(10);
		deque.insertLeft(7);
		
		//Removing from the left
		int l1 = deque.removeLeft();
		int l2 = deque.removeLeft();
		int l3 = deque.removeLeft();
		
		//Testing the remove left method
		System.out.println("Removing from the left: " + l1 + ", " + l2 + ", " + l3);
		System.out.println("**************************************************");
		
		//Inserting from the right
		deque.insertRight(3);
		deque.insertRight(4);
		deque.insertRight(5);
		
		//Removing from the right 
		int r1 = deque.removeRight();
		int r2 = deque.removeRight();
		int r3 = deque.removeRight();
		
		//Testing the remove right method
		System.out.println("Removing from the right: " + r1 + ", " + r2 + ", " + r3);
		System.out.println("**************************************************");
		
		//Inserting from the left showing the wrap around queue
		deque.insertLeft(1);
		deque.insertLeft(107);
		deque.insertLeft(6);
		deque.insertLeft(4);
		deque.insertLeft(100);
		deque.insertLeft(7);


		//Peeking into the deque from the left
		int pk1 = deque.peekLeft();
		System.out.println("Peeking from the left: " + pk1);
		System.out.println("**************************************************");
		
		//Peeking into the deque from the right
		int pk2 = deque.peekRight();
		System.out.println("Peeking from the right: " + pk2);
		//Formatting
		if(deque.isFull() == false && deque.isEmpty() == false)
			System.out.println("**************************************************");
		
		//Testing if the deque is full
		boolean full = deque.isFull();
		if(full == true)
		{
			System.out.println("**************************************************");
			System.out.println("The deque is full: " + full);
			System.out.println("**************************************************");
		}
		
		//Testing if the deque is empty
		boolean empty = deque.isEmpty();
		if(empty == true)
		{
			System.out.println("**************************************************");
			System.out.println("The deque is empty: " + empty);
			System.out.println("**************************************************");
		}
	
	} //end of main method
 
} //end of DequeApp class
