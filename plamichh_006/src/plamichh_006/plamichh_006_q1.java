package plamichh_006;

import java.util.Scanner;

public class plamichh_006_q1 {

	static class ConsoleInput {

		public static int getValidatedInteger(int minValue, int maxValue)

		{
			int x = 0;
			boolean done = false;
			while (!done) {
				//try catch loop for if the integer is incorrect
				try {
					Scanner inputScanner = new Scanner(System.in);
					System.out.println(
							"Please input an integer between " + minValue + " and " + maxValue + " inclusive.");

					x = inputScanner.nextInt();

					while (x > maxValue || x < minValue) {
						System.out.println("Please input a valid number");
						x = inputScanner.nextInt();
					}
					done = true;
				} catch (Exception e) {
					done = false;
					System.out.println("Error!");
				}
			}
			return x;
		}

		public static double getValidatedDouble(double minValue, double maxValue) 
		{
			double x = 0;
			boolean done = false;

			while (!done)
			{
				//try catch loop for if the double is incorrect
				try {
					Scanner inputScanner = new Scanner(System.in);
					System.out
							.println("Please input a double between " + minValue + " and " + maxValue + " inclusive.");

					x = inputScanner.nextDouble();

					while (x > maxValue || x < minValue) {
						System.out.println("Please input a valid number");
						x = inputScanner.nextInt();
					}
					done = true;
				}
				catch (Exception e) {
					done = false;
					System.out.println("Error!");
				}
			}
			return x;
		}

		public static char getValidatedChar(char minChar, char maxChar) {
			char x = 'a';
			boolean done = false;

			while (!done)
			{
				try {
					//try catch loop for is the character is incorrect
					Scanner inputScanner = new Scanner(System.in);
					System.out.println("Please input a character between " + minChar + " and " + maxChar + " inclusive.");

					x = inputScanner.next().charAt(0);

					while (x > maxChar || x < minChar) {
						System.out.println("Please input a valid character");
						x = inputScanner.next().charAt(0);
					}
					done = true;
				}
				catch (Exception e) {
					done = false;
					System.out.println("Error!");
				}
			}
			return x;
		}
		

	public static void main(String[] args) {
		ConsoleInput.getValidatedInteger(4, 19);
		ConsoleInput.getValidatedDouble(-34.6, 85.1);
		ConsoleInput.getValidatedChar('a', 'f');
		System.out.println("Thank you, Goodbye!");
	}
}
}
