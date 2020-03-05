package plamichh_004;
import java.util.Scanner;

class WordGame {
	
	public WordGame() {
	
	Scanner inputScanner = new Scanner(System.in);
	
	//Declaring the variable for the word
	String w;
	
	//Getting the word from player 1
	System.out.println("Player 1 Enter a word:");
	w = inputScanner.next();
	
	//string builder
	StringBuilder word = new StringBuilder(w);
	StringBuilder HiddenWord = new StringBuilder(w); 
	
	//Using * to hide the characters
	for (int i =0; i < HiddenWord.length(); i++) {
	  HiddenWord.setCharAt(i, '*');
	}
	  
	//Putting a space
	System.out.println("");
	System.out.println(HiddenWord);
	
	
	//Stating the game loop
	
	int tries = 0;
	while (tries < 10) //tries count
	{
		
	//Asking player 2 if they wish to guess the word
	System.out.println( "would you like to guess the word (y/n):");
	char input;
	input =inputScanner.next().charAt(0);
	
	//Validation
	while (input != 'y' && input !='n')
	{
		System.out.println("Please input a valid character");
		input =inputScanner.next().charAt(0);
	}
    
	//If they do not want to guess the word
	if (input == 'n') 
	{
		System.out.println("Input a letter to guess");
		char guess =inputScanner.next().charAt(0);
		
		for(int i =0; i < word.length(); i++) {
			
			if (guess == word.charAt(i)){
				HiddenWord.setCharAt(i, guess);
			}
		}
		
		System.out.println("\n" +HiddenWord);
		
	}
	//If they wish to guess the word
	else if (input == 'y')
	{
		System.out.print("Enter your guess: ");
		w = inputScanner.next(); //enter guess

		
		tries++; //add tries
		
		if (word.toString().equals(w)) { 
			System.out.println("\n" + word + "\nYou win with " + (10 - tries) + " turn(s) remaining");
			break;
		}
		
		else 
			System.out.println("Incorrect");
		
	}
	}
	
	//If they run out of tries
	if(tries == 10)
	{
		System.out.println("No more attempts. The solution was " + word);
	inputScanner.close(); 
	}
	
	
	}
}

	
