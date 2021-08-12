class Card {
	String rank;
	String suit;
	Card(String rank, String suit) {
		System.out.println("A "+rank+" of "+suit+" is generated");
		rank = rank;
		suit = suit;
	}
}

class CardDemo {
	public static void main(String[] args) {
		Card c1 = new Card("King", "Spade");
	}
}

