package plamichh_006;

public class Card {

	private int denomination;
	private char suit;

	public Card(int denomination, char suit) {

		this.denomination = denomination;
		this.suit = suit;

	}
//if statements to change from number to face card
	public String face() {
		if (denomination == 1) {
			return ("A" + suit);

		} else if (denomination == 11) {
			return ("J" + suit);

		} else if (denomination == 12) {
			return ("Q" + suit);

		} else if (denomination == 13) {
			return ("K" + suit);

		} else {
			return (Integer.toString(denomination) + suit);
		}

	}

}
