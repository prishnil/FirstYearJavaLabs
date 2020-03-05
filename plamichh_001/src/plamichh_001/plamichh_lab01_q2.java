package plamichh_001;

import java.util.Scanner;

public class plamichh_lab01_q2 {

	public static void main(String[] args) {

Scanner scnr = new Scanner(System.in);
	String userinput;
	char let0;
	
	//Ask user for a single letter
	
	System.out.println("Enter a lowercase charater: ");
	userinput = scnr.next();
	let0 = userinput.charAt(0);
	
	//Change to uppercase
	let0 = Character.toUpperCase(let0);
	
	//Output the uppercase letter 
	
	
	System.out.println("The uppercase character is: " + let0);
			
		

	}

}
