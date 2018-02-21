
public class Card implements ICard {
	
	//Instance variables
	private Suit suit;
	private Rank rank;
	
	//Default constructor
	public Card() {
		suit = null;
		rank = null;
	}
	
	//Alternate constructor
	public Card(Suit suit, Rank rank) {
		this.suit  = suit;
		this.rank = rank;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	//Comparable interface method
	@Override
	public int compareTo(ICard obj) {
		if(obj.getRank().equals(this.rank))
			return this.suit.compareTo(obj.getSuit());
		else if(this.rank.compareTo(obj.getRank()) > 0)
			return 1;
		else if(this.rank.compareTo(obj.getRank()) < 0)
			return -1;
		else
			return 0;
	}

	//ICard interface method
	@Override
	public Suit getSuit() {

		return suit;
	}

	//ICard interface method
	@Override
	public Rank getRank() {

		return rank;
	}
	
	public String toString() {
		return rank + " OF " + suit;
	}

}
