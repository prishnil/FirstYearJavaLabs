package plamichh_003;

import java.util.Scanner;

public class plamichh_lab03_q1 {

	public static double result = 1;

	public static double computePower(double base, int power)

	{

		// For power being 0
		if (power == 0) {
			result = base / base;
		}

		// For power being positive
		if (power > 0) {
			for (int i = 0; i < power; ++i) {

				result = result * base;

			}
		}

		// For power being negative
		if (power < 0) {

			for (int i = 0; power < i; --i) {

				result = result / base;

			}

		}

		return result;

	}

	public static void main(String[] args) {

		double result;

		Scanner inputScanner = new Scanner(System.in);

		// Get values from user
		System.out.println("Please enter a real number for the base: ");
		double base = inputScanner.nextDouble();

		System.out.println("Please enter an integer value for the power: ");
		int power = inputScanner.nextInt();
		result = computePower(base, power);

		System.out.println("The result is: " + result);

		inputScanner.close();
	}

}
