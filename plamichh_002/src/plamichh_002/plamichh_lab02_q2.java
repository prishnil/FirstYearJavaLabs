package plamichh_002;

import java.util.Scanner;

public class plamichh_lab02_q2 {

	public static void main(String[] args) {

		int inputNumber = 0; // One of the integers input by the user.
		int sum = 0; // The sum of the positive integers.
		int countEven = 0, countOdd = 0, count = 0; // The number of positive
													// integers.
		double average; // The average of the positive integers.
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE; // The max and min values

		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Enter your first positive integer: ");
		inputNumber = inputScanner.nextInt();

		while (inputNumber != 0) {
			sum += inputNumber; // Add inputNumber to running sum.
			count++; // Count the number of input by adding 1 to count
			if ((inputNumber % 2) == 0) {
				countEven++; // Count the even input by adding 1 to count.
			} else if ((inputNumber % 2) != 0) {
				countOdd++; // Count the odd input by adding 1 to count.
			}
			if (inputNumber > max)
				max = inputNumber; // Find the max value

			if (inputNumber < min)
				min = inputNumber; // Find the min value

			System.out.println("Enter your next positive integer, or 0 to end: ");
			inputNumber = inputScanner.nextInt();
		}

		average = ((double) sum) / count; // Average formula
		System.out.println("Their average is " + average + ".");
		System.out.println("There were " + countEven + " even integers.");
		System.out.println("There were " + countOdd + " odd integers.");
		System.out.println("The maximum value is " + max + ".");
		System.out.println("The minimum value is " + min + ".");

	}

}
