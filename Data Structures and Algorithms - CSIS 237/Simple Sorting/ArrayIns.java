package problem_3;

/*
* Problem 3
* This class was altered to show the amount of copies and comparisons the insertion sort makes
* Brady Lange
* 2/3/18
* Comparisons: 31
* Copies: 40
*/

class ArrayIns
{
	private long[] a;                 // ref to array a
	private int nElems;               // number of data items
	//--------------------------------------------------------------
	public ArrayIns(int max)          // constructor
	   {
	   a = new long[max];                 // create the array
	   nElems = 0;                        // no items yet
	   }
	//--------------------------------------------------------------
	public void insert(long value)    // put element into array
	   {
	   a[nElems] = value;             // insert it
	   nElems++;                      // increment size
	   }
	//--------------------------------------------------------------
	public void display()             // displays array contents
	   {
	   for(int j = 0; j<nElems; j++)       // for each element,
	      System.out.print(a[j] + " ");  // display it
	   System.out.println("");
	   }
	//--------------------------------------------------------------
	public void insertionSort()
	   {
	   int in, out;
	   int copy = 0; 
	   int compare = 0;
	
	   for(out = 1; out < nElems; out++)     // out is dividing line
	      {
	      long temp = a[out];            // remove marked item
	      in = out;                      // start shifts at out
	      while(true) // until one is smaller, if its true the while loop will execute
		      {
		          if(!(in > 0 && a[in - 1] >= temp))
		          {
		        	  break;  
		          }
		          compare++;
		          a[in] = a[in-1];            // shift item to right
		          copy++;
		          --in;                       // go left one position
		      }		
	         
	        
	      a[in] = temp;   				// insert marked item
	      copy++;						//After swap is made, increase copy count
	    
	         
	      }  // end for
	   
	   //Displays the number of comparisons
	   System.out.println("Number of total comparisons: " + compare);
	   
	   //Displays the number of copies
	   System.out.println("Number of total copies: " + copy);
	   }  // end insertionSort()
//--------------------------------------------------------------
}  // end class ArrayIns
