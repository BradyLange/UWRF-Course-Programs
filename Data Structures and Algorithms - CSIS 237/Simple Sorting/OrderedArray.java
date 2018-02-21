package problem_2;

/*
 * Problem 2
 * OrderedArray class has algorithms for merging 2 arrays together, deleting, and finding elements in an array.
 * Brady Lange
 * Date: 2/3/18
 */

class OrderedArray
{
	private long[] a;                 // ref to array a
	private int nElems;               // number of data items
//-----------------------------------------------------------
	public OrderedArray(int max)          // constructor
	   {
	   a = new long[max];             // create array
	   nElems = 0;
	   }
//-----------------------------------------------------------
	public int size()
	   { return nElems; }
//-----------------------------------------------------------
	public int find(long searchKey)
	   {
	   int lowerBound = 0;
	   int upperBound = nElems-1;
	   int curIn;
	
	   while(true)
	      {
	      curIn = (lowerBound + upperBound ) / 2;
	      if(a[curIn]==searchKey)
	         return curIn;              // found it
	      else if(lowerBound > upperBound)
	         return nElems;             // can't find it
	      else                          // divide range
	         {
	         if(a[curIn] < searchKey)
	            lowerBound = curIn + 1; // it's in upper half
	         else
	            upperBound = curIn - 1; // it's in lower half
	         }  // end else divide range
	      }  // end while
	   }  // end find()
//-----------------------------------------------------------
	public void insert(long value)    // put element into array
	   {
	   int j;
	   for(j=0; j<nElems; j++)        // find where it goes
	      if(a[j] > value)            // (linear search)
	         break;
	   for(int k=nElems; k>j; k--)    // move bigger ones up
	      a[k] = a[k-1];
	   a[j] = value;                  // insert it
	   nElems++;                      // increment size
	   }  // end insert()
//-----------------------------------------------------------
	public boolean delete(long value)
	   {
	   int j = find(value);
	   if(j==nElems)                  // can't find it
	      return false;
	   else                           // found it
	      {
	      for(int k=j; k<nElems; k++) // move bigger ones down
	         a[k] = a[k+1];
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
	public OrderedArray merge(OrderedArray src1, OrderedArray src2)
		{
		
		long[] src1Arr = src1.a;
		long[] src2Arr = src2.a;
		long[] destinArr = new long[src1.nElems + src2.nElems];
		int i = 0, j= 0, k = 0;
		
		while(i < src1.nElems && j < src2.nElems) //both arrays have elements
			{
				if(src1Arr[i] <= src2Arr[j]) 
					{
						destinArr[k] = src1Arr[i];
						i++;
					}
				else
					{
						destinArr[k] = src2Arr[j];
						j++;
					}
				k++;
			}
		//when src1 ran out of the elements
		if(i >= src1.nElems )
			{
		//copy all remaining elements from src2 to dest
			while(j < src2.nElems)
				{
					destinArr[k] = src2Arr[j];
					j++;
					k++;
				}
			}
		//when src2 ran out of the elements
		if(j > src2.nElems)
			{
			while(i < src1.nElems) //copy all remaining elements to destination
				{
					destinArr[k] = src1Arr[i];
					i++;
					k++;
				}
			}

		//copy all remaining elements from src1 to dest
		OrderedArray destination = new OrderedArray(destinArr.length);
		
		destination.nElems = src1.nElems + src2.nElems;         //Have to initialize to create, otherwise would not print because the nElems is zero in the driver class
		for(int d = 0; d < destination.nElems; d++) 
		{   
			destination.a[d] = destinArr[d];
		}
		
		return destination;
		}
//-----------------------------------------------------------
	
}  // end class OrdArray
