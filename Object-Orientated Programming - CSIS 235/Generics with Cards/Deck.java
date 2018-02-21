import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Deck {
	
	//Instance variables
	private List<ICard> cards;
	
	//Default constructor
	public Deck() {
		
		//Creating a new Array List with the generics ICard interface
		cards = new ArrayList<ICard>();
		
		//Adding cards suit and rank using this nested for loop
		for(ICard.Rank rk: ICard.Rank.values()) {
			for(ICard.Suit st: ICard.Suit.values()) {
				Card card = new Card(st, rk);
					cards.add(card);
			}
		}
		
		//Shuffling the cards after they have been added by the nested for loop above
		Collections.shuffle(cards);
	}
	
	//Method that sorts the cards in the deck
	public void sort() {
			Collections.sort(cards);
	}
	
	//Method that prints all the cards in the deck
	public void print() {
		for(ICard obj: cards)
			System.out.println(obj);
	}

}
