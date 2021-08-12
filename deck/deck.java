class Deck {
	Card d1[][] = new Card[13][4];
	Deck() {
	for(int i = 0; i < 13; i++) {
		for(int j = 0; j < 4; j++) {
			switch(i) {
				case 0:	d1[i][j].rank = "ace";break;
				case 1: d1[i][j].rank = "two";break;
				case 2: d1[i][j].rank = "three";break;
				case 3: d1[i][j].rank = "four";break;
				case 4: d1[i][j].rank = "five";break;
				case 5: d1[i][j].rank = "six";break;
				case 6: d1[i][j].rank = "seven";break;
				case 7: d1[i][j].rank = "eight";break;
				case 8: d1[i][j].rank = "nine";break;
				case 9: d1[i][j].rank = "ten";break;
				case 10: d1[i][j].rank = "jack";break;
				case 11: d1[i][j].rank = "queen";break;
				case 12: d1[i][j].rank = "king";break;
			}
			switch(j) {
				case 0: d1[i][j].suit = "club";break;
				case 1: d1[i][j].suit = "spade";break;
				case 2: d1[i][j].suit = "diamond";break;
				case 3: d1[i][j].suit = "hearts";break;
			}
		}
	}
	}
}

class DeckDemo {
	public static void main(String[] args) {
		Deck dec1 = new Deck();
		for(int i = 0; i < 13; i++) {
			for(int j = 0; j < 4; j++) {
				 System.out.println("a "+dec1.d1[i][j].rank+" of "+dec1.d1[i][j].suit);
			}
		}
	}
}
