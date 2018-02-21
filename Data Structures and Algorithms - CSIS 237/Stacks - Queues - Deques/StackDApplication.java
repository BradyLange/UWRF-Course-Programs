package problem_3;

/*
 * Brady Lange
 * Program #2
 * 2/13/18
 * This class tests the stacks methods
 */

public class StackDApp {

	public static void main(String[] args) {

		//Instantiating the stack class
		StackD stack = new StackD(15);
		
		//Pushing numbers into the stack
		stack.push(20);
		stack.push(3);
		stack.push(24);
		
		//Peeking top of the stack
		System.out.println("Peeking the top of the stack: " + stack.peek());
		System.out.println("**************************************************");
		
		//Getting the size of the stack
		int size = stack.getSize();
		
		for(int i = 0; i < size; i++)
		{
			int pop = stack.pop();
			System.out.println("Removed (Popped): " + pop);
		}
		
		//Testing if the stack is empty
		boolean empty = stack.isEmpty();
		if(empty == true)
		{
			System.out.println("**************************************************");
			System.out.println("Stack is empty: " + empty);
			System.out.println("**************************************************");
		}
		
		//Testing if the stack is full
		boolean full = stack.isFull();
		if(full == true)
		{
			System.out.println("**************************************************");
			System.out.println("Stack is full: " + full);
			System.out.println("**************************************************");
		}
		

	}

}
