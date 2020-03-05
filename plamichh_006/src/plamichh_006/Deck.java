package plamichh_006;

public class Deck {

	public Card cards[] = new Card[52];

	private char suits[] = new char[4];
	private int denominations = 13;
//set the suits 
	public Deck() {
		int suit = 0;
		suits[0] = 'S';
		suits[1] = 'C';
		suits[2] = 'H';
		suits[3] = 'D';

		for (int i = 0; i < suits.length; i++) {
			for (int j = 1; j <= denominations; j++, suit++) {

				cards[suit] = new Card (j, suits[i]);

			}

		}

	}
//print the cards
	public void printCards() {
		int counter = 0;

		for (int i = 0; i < cards.length; i++, counter++) {

			if (counter % 13 == 0) {

				System.out.print("\n\n");

			}

			System.out.print(cards[i].face());
			System.out.print(" ");

		}

	}
}