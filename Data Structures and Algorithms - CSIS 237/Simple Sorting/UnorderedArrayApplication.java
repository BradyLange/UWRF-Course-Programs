package problem_1;

/*
 * Problem 1
 * UnorderedArrayApp class tests the algoriths of the UnorderedArray class.
 * Brady Lange
 * Date: 2/3/18
 */

class UnorderedArrayApp
{
public static void main(String[] args)
   {
   int maxSize = 100;            // array size
   UnorderedArray arr;                // reference to array
   arr = new UnorderedArray(maxSize); // create the array

   arr.insert(77);               // insert 10 items
   arr.insert(99);
   arr.insert(44);
   arr.insert(55);
   arr.insert(22);
   arr.insert(88);
   arr.insert(11);
   arr.insert(00);
   arr.insert(66);
   arr.insert(33);

   arr.display();                // display items

   int searchKey = 35;           // search for item
   if( arr.find(searchKey) )
      System.out.println("Found " + searchKey);
   else
      System.out.println("Can't find " + searchKey);

   arr.delete(00);               // delete 3 items
   arr.delete(55);
   arr.delete(99);

   arr.display();                // display items again
   
   //Testing the getMax method
   long max = arr.getMax();
   System.out.println("The largest number is: " + max);
   //Testing the getMin method
   long min = arr.getMin();
   System.out.println("The smallest number is: " + min);
   //Testing if the array is empty results (should return -1)
   UnorderedArray array2 = new UnorderedArray(maxSize);
   long emp = array2.getMax();
   System.out.println(emp);
   long emp2 = array2.getMin();
   System.out.println(emp2);
   }  // end main()
}  // end class UnorderedArrayApp
