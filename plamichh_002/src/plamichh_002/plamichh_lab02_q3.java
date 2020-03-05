package plamichh_002;

import java.util.Scanner;

public class plamichh_lab02_q3 {

	public static void main(String[] args) {

		int factorial = 1;
		int number = 0;

		// New kind of variable
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Please enter an integer");
		number = inputScanner.nextInt();

		while (number <= 0) {

			System.out.println("Enter a postive integer");
			number = inputScanner.nextInt();
		}

		int i = 1;
		while (i <= number)
		{

			factorial *= i;
			i++;
		}

		System.out.println("Factorial of number " + number + " is " + factorial);

	}
}