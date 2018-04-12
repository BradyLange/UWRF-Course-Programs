package problems123;

/*
 * Brady Lange
 * Program 5
 * 4/11/18
 * This program has methods and data about a single node that would be in a tree.
 */

public class IntTreeNode 
{
	//Variables
	int key; //Store this node's key value
	IntTreeNode leftChild; //Store the reference to this node's left child
	IntTreeNode rightChild; //Store the reference to this node's right child

	//Constructor
	public IntTreeNode(int key)
	{
		this.key = key;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	//Constructor
	public IntTreeNode(int key, IntTreeNode left, IntTreeNode right)
	{
		this.key = key;
		this.leftChild = left;
		this.rightChild = right;
	}
	
	//Display itself
	public void display()
	{
		System.out.print("(" + key + ")");
	}
	
	//Remove a node from the subtree
	public IntTreeNode remove(int delKey, IntTreeNode parent)
	{
		if(delKey < this.key)
		{
			if(leftChild != null)
				return leftChild.remove(delKey, this);
			else
				return null;
		}
		else if(delKey > this.key) 
		{
			
			if(rightChild != null)
				return rightChild.remove(delKey, this);
			else
				return null;
		}
		else 
		{   //Find the node	
		
			if (leftChild != null && rightChild != null) 
			{
			
				    IntTreeNode min = rightChild.minRightSubTree();
					this.key = min.key;
					return rightChild.remove(this.key, this);
				
			}
			else if(this == parent.leftChild) 
			{
				parent.leftChild = (leftChild != null) ? leftChild : rightChild;
				return this;
			}
			else if(this == parent.rightChild) 
			{
				parent.rightChild = (leftChild != null) ? leftChild : rightChild;
				return this;
			}
		}
		
		return null;
		
	}
	
	//Find a minimum value in the right subtree
	public IntTreeNode minRightSubTree()
	{
		if (this.leftChild == null)
			return this;
		else
			return leftChild.minRightSubTree();
	}
	
}
