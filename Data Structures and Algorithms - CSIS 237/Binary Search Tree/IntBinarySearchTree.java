package problems123;

/*
 * Brady Lange
 * Program 5
 * 4/11/18
 * This program has methods to manipulate a binary tree and grab information about it.
 */

public class IntBinarySearchTree 
{
	//Variables
	private IntTreeNode root;  //First node of the tree
	private int numItems;      //Number of nodes in the tree
	
	//Constructor
	public IntBinarySearchTree()
	{
		root = null;
		numItems = 0;
	}
	
	//Getters
	public IntTreeNode getRoot() 
	{
		return root;
	}
	public int getNumItems() 
	{
		return numItems;
	}
	
	//Check whether this binary tree is a binary search tree
	public boolean isBST()
	{
		return isBST(root);
	}
	
	//Helper method: recursive check isBST
	private boolean isBST(IntTreeNode root)
	{
		if(root == null)
			return true;
		if(isSubTreeLess(root.leftChild, root.key) &&
		      isSubTreeGreater(root.rightChild, root.key) &&
	          isBST(root.leftChild) &&
	          isBST(root.rightChild))
			return true;
		else
			return false;
	}
	
	//Helper for isBST(IntTreeNode)
	private boolean isSubTreeLess(IntTreeNode subRoot, int value)
	{
		if(subRoot == null)
			return true;
		if(subRoot.key < value && 
				isSubTreeLess(subRoot.leftChild, value) &&
				isSubTreeLess(subRoot.rightChild, value))
			return true;
		else
			return false;
	}
	
	//Helper for isBST(IntTreeNode)
	private boolean isSubTreeGreater(IntTreeNode subRoot, int value)
	{
		if(subRoot == null)
			return true;
		if(subRoot.key >= value && 
				isSubTreeGreater(subRoot.leftChild, value) &&
				isSubTreeGreater(subRoot.rightChild, value))
			return true;
		else
			return false;
	}
	
	//Insert a node into this binary search tree
	public void addBST(int newKey)
	{
		root = addBST(newKey, root);
		numItems++;
	}
	
	//Helper method: recursive insert
	private IntTreeNode addBST(int newKey, IntTreeNode subTreeRoot)
	{
		if(subTreeRoot == null)
		{
			//Create a new node
			subTreeRoot = new IntTreeNode(newKey);
		}
		else if(newKey < subTreeRoot.key)
			subTreeRoot.leftChild = addBST(newKey, subTreeRoot.leftChild);
		else
			subTreeRoot.rightChild = addBST(newKey, subTreeRoot.rightChild);
			
		return subTreeRoot;
	}
	
	//Search a node in this binary search tree
	public IntTreeNode inBST(int searchKey)
	{
		return inBST(searchKey, root);
	}
	
	//Helper method: recursive search
	private IntTreeNode inBST(int searchKey, IntTreeNode subTreeRoot) 
	{
		if(subTreeRoot == null)
		{
			return null;
		}
		else
		{
			if(searchKey == subTreeRoot.key)
				return subTreeRoot;
			else if(searchKey < subTreeRoot.key)
			{
				return inBST(searchKey, subTreeRoot.leftChild);
			}
			else
			{
				return inBST(searchKey, subTreeRoot.rightChild);
			}
		}
	}
	
	//Traverse this binary search tree in different ways
	public void traverse(int traverseType)
	{
		switch(traverseType)
	    {
	       case 1: System.out.print("Preorder traversal: ");
	               preOrder(root);
	               break;
	       case 2: System.out.print("Inorder traversal: ");
	               inOrder(root);
	               break;
	       case 3: System.out.print("Postorder traversal: ");
	               postOrder(root);
	               break;
	    }
		System.out.println();
	}
	
	 //Helper method: recursive pre-order traverse
	 private void preOrder(IntTreeNode subTreeRoot)
	 {
	      if(subTreeRoot != null)
	        {
	    	  subTreeRoot.display();
	    	  preOrder(subTreeRoot.leftChild);
	    	  preOrder(subTreeRoot.rightChild);
	        }
	  }
	
	  //Helper method: recursive in-order traverse
	  private void inOrder(IntTreeNode subTreeRoot)
	  {
	      if(subTreeRoot != null)
	       {
	         inOrder(subTreeRoot.leftChild);
	         subTreeRoot.display();
	         inOrder(subTreeRoot.rightChild);
	       }
	  }
	
	  //Helper method: recursive post-order traverse
	  private void postOrder(IntTreeNode subTreeRoot)
	  {
	      if(subTreeRoot != null)
	       {
	         postOrder(subTreeRoot.leftChild);
	         postOrder(subTreeRoot.rightChild);
	         subTreeRoot.display();
	       }
	  }
	  
	  //Remove a node from this binary search tree
	  public boolean remove(int delKey)
	  {
		  if(root == null)
			  return false;
		  else 
		  {
			  if(delKey == root.key) 
			  {
					IntTreeNode auxRoot = new IntTreeNode(0); //dummy root
					auxRoot.leftChild = root;
					IntTreeNode removedNode = root.remove(delKey, auxRoot);
					root = auxRoot.leftChild;
					if(removedNode != null) 
					{
						removedNode = null;
						numItems--;
						return true;
					}
					else
						return false;
				}
				else 
				{
					IntTreeNode removedNode = root.remove(delKey, null);
					if(removedNode != null) 
					{
						removedNode = null;
						numItems--;
						return true;
					}
					else
						return false;
				}
			}
	 }
  
	//Returns the amount of nodes in the tree
	public int nodeCount()
	{
		return nodeCount(root);
	}
	//Helper method for nodeCount()
	private int nodeCount(IntTreeNode node)
	{
		//Base case
		if(node == null)
	    {
			return 0;
	    }
	    else
	    	return 1 + nodeCount(node.leftChild) + nodeCount(node.rightChild);
	}
	  
	//Returns the amount of leaves in the binary tree
	public int leavesCount()
	{
		return leavesCount(root);
	}
	//Helper method for leavesCount()
	private int leavesCount(IntTreeNode node)
	{
		//Base case
		if(node == null)
		{
			return 0;
		}
		else
			if(node.leftChild == null && node.rightChild == null)
			{
				return 1;
			}
			else
				return leavesCount(node.leftChild) + leavesCount(node.rightChild);
	}
	  
	//Returns the height of the binary tree
	public int heightCount()
	{
		return heightCount(root);
	}
	//Helper method for heightCount()
	private int heightCount(IntTreeNode node)
	{
		if(node == null)
		{
			return 0;
		}
		else
		{
			int leftBranch = heightCount(node.leftChild);
			int rightBranch = heightCount(node.rightChild);
			  
			if(leftBranch > rightBranch)
				return 1 + leftBranch;
			else
				return 1 + rightBranch;
		}
			  
	}
	
}
