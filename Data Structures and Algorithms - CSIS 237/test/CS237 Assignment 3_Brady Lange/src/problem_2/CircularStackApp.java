package problem_2;

/*
 * CircularStackApp class
 * Brady Lange
 * 2/23/18
 * This class tests the Circular Stack classes methods to validate it operates like the stack data structure.
 */

public class CircularStackApp {
	
	public static void main(String [] args)
	{
		//Creating the stack
		CircularStack stack = new CircularStack(4);
		
		//Pushing elements into the stack
		stack.push(5, 6);
		stack.push(6, 20);
		stack.push(7, 200);
		stack.push(8, 570);
		
		//Displaying the stack with pushed links 
		System.out.println("**************************************");
		System.out.print("Last link entered into the stack: ");
		stack.peek();
		
		//Removing elements from the stack (LIFO)
		stack.pop();
		stack.pop();
		
		//Displaying the stack with a popped link
		System.out.println("**************************************");
		System.out.print("New last link entered into the stack after two have been removed: ");
		stack.peek();
		
		//Checking to see if more links can be added to the stack
		System.out.println("**************************************");
		stack.push(9, 200);
		stack.push(9, 656);
		//Will not push this link into the stack
		stack.push(9, 454); 
		
		//Checking if the stack is empty
		System.out.println("**************************************");
		if(stack.isEmpty())
			System.out.println("The stack is empty.");
		else
			System.out.println("The stack is not empty.");
		
		
	} //end of the main method

} //end of the class
