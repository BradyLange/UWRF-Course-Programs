package problems123;

/*
 * Brady Lange
 * Program 5
 * 4/11/18
 * This program tests the classes IntBinarySearchTree to make sure it is working properly.
 */

public class TestBinarySearchTree 
{

	public static void main(String[] args) 
	{
		//Instantiating the object
		IntBinarySearchTree myBST = new IntBinarySearchTree();
		
		//Test insert method
		myBST.addBST(35);
		myBST.addBST(18);
		myBST.addBST(9);
		myBST.addBST(24);
		myBST.addBST(20);
		myBST.addBST(64);
		myBST.addBST(86);
		myBST.addBST(41);
		myBST.addBST(30);
		
		//Test traverse method
		myBST.traverse(2);
		
		//Test search method
		int key1 = 30;
		System.out.println("\nSearching the tree for " + key1 + "...");
		System.out.print("Found: ");
		myBST.inBST(key1).display();
		System.out.println();
		
		//Test node count method
		int nodeCount = myBST.nodeCount();
		System.out.println("\nTotal nodes: " + nodeCount);
		
		//Test height of the tree
		int height = myBST.heightCount();
		System.out.println("\nHeight of the tree: " + height);
		
		//Test how many leaves the tree has
		int leaves = myBST.leavesCount();
		System.out.println("\nTotal leaves of the tree: " + leaves + "\n");
		
		//Test remove method
		int key2 = 18;
		System.out.print("Removing the key " + key2 + " from the tree...\n");
		if(myBST.remove(key2))
		{
			System.out.println("New in-order traverse of the tree: ");
			myBST.traverse(2);
		}
		else
		{
			System.out.println("Cannot find the key!");
		}
		
	}

}
