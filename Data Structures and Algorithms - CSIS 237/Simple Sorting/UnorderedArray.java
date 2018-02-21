package problem_1;

/*
 * Problem 1
 * UnorderedArray class defines the algorithms of getting the max and min number in an array.
 * Brady Lange
 * Date: 2/3/18
 */

class UnorderedArray
{
	private long[] a;                 // ref to array a
	private int nElems;               // number of data items
//-----------------------------------------------------------
	public UnorderedArray(int max)         // constructor
	   {
	   a = new long[max];                 // create the array
	   nElems = 0;                        // no items yet
	   }
//-----------------------------------------------------------
	public boolean find(long searchKey)
	   {                              // find specified value
	   int j;
	   for(j=0; j<nElems; j++)            // for each element,
	      if(a[j] == searchKey)           // found item?
	         break;                       // exit loop before end
	   if(j == nElems)                    // gone to end?
	      return false;                   // yes, can't find it
	   else
	      return true;                    // no, found it
	   }  // end find()
//-----------------------------------------------------------
	public void insert(long value)    // put element into array
	   {
	   a[nElems] = value;             // insert it
	   nElems++;                      // increment size
	   }
//-----------------------------------------------------------
	public boolean delete(long value)
	   {
	   int j;
	   for(j=0; j<nElems; j++)        // look for it
	      if( value == a[j] )
	         break;
	   if(j==nElems)                  // can't find it
	      return false;
	   else                           // found it
	      {
	      /* Choice 1: move elements forward */
		   for(int k=j; k<nElems; k++) // move higher ones down
	         a[k] = a[k+1];
	      
		   /* Choice 2: put the last element to the gap */
		  // a[j] = a[nElems-1];
	      
		   nElems--;                   // decrement size
	      return true;
	      }
	   }  // end delete()
//-----------------------------------------------------------
	public void display()             // displays array contents
	   {
	   for(int j=0; j<nElems; j++)       // for each element,
	      System.out.print(a[j] + " ");  // display it
	   System.out.println("");
	   }
//-----------------------------------------------------------

	public long getMax()			  //Returns the largest number in the array
	{
		long max = a[0];
		for(int i = 1; i < nElems; i++)
		{
			if(a[i] > max)
				max = a[i];
		}
			
		if(nElems > 0)
			return max;
		else
			return -1;
	}
//-----------------------------------------------------------
	public long getMin()		      //Returns the smallest number in the array
	{
		long min = a[0];
		for(int i = 1; i < nElems; i++)
		{
			if(a[i] < min)
				min = a[i];
		}
			
		if(nElems > 0)
			return min;
		else 
			return -1;
	}
//-----------------------------------------------------------
}  // end class UnorderedArray
