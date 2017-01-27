
public class Deck {

	private final static String[] rank = {
		"2", "3", "4", "5", "6", "7", "8", "9",
		"10", "Jack", "Queen", "King", "Ace"
	}; 

	private final static String[] suit = {
		"Clubs", "Diamonds", "Hearts", "Spades"
	};


	private String[] deck;

	// Create the deck array and initialise it
	// with cards
	public Deck() {
		// Create an instance of the String array, large
		// enough to hold the total number of cards in the deck.
		// Assign it to the deck variable.
		//
		  deck =new String[rank.length* suit.length] ; 
		
		// Fill out the deck array with cards where
		// each card is a string of the form "<rank> of <suit>".
		// For example, "2 of Diamonds".
		// 
		// Use two nested loops going over the suits in the
		// outer loop, and ranks in the inner one.
		//
		 for (int i = 0;i<suit.length;i++ ){ 
				for (int j = 0; j<rank.length;j++){ 
		          deck[rank.length *i+j] = suit[i] +" of "+rank[j];
				}
				}
	}

	// Return the array of strings representing
	// the cards in the deck
	public String[] getCards() {
		return deck;

	}
  
	// Shuffle the deck of cards in place so that the 
	// the permutation is accumulated at the front
	// portion of the array (i.e., from deck[0] onwards)
	public void shuffle() {
		// Iterate over the deck array.
		// At each iteration i:
		// 		- pick a random card from deck[i] through deck[Nâˆ’1], with each card equally likely;
		//      - exchange it with deck[i]
		int N= deck.length ;
		for(int i=0; i<N;i++){
			int r=(int)(Math.random()*(N-i));
			String t = deck[r];
			deck[r]= deck[N-i-1];
			deck[N-i-1]=t;
		}
	}

	public static void main(String[] args) {
		// Testing code for the Deck class
		
		Deck deck = new Deck();

		String[] cards = deck.getCards();
		for (int i = 0; i < cards.length; i++)
			System.out.println(cards[i]);

		System.out.println();
		System.out.println("Deck after shuffle:");
		deck.shuffle();
		cards = deck.getCards();
		for (int i = 0; i < cards.length; i++)
			System.out.println(cards[i]);

	}
}
