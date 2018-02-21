
public class TestDeck {

	public static void main(String[] args) {
		
		//Instantiating the deck
		Deck one = new Deck();
		
		//Printing out the contents of the deck unsorted
		one.print();
		System.out.println();
		
		//Sorting the deck in order
		one.sort();
		
		//Printing out the contents of the sorted deck
		one.print();
		

	}

}
