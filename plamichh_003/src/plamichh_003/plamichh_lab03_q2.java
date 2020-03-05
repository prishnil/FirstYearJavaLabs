package plamichh_003;

import java.util.Scanner;

public class plamichh_lab03_q2 {

	// n to the m power calculator
	public static void main(String[] args) {

		double base = 0;
		char userDecision;

		Scanner inputScanner = new Scanner(System.in);

		do {

			do {

				System.out.println("Enter a value to compute the inverse tnagent (-1 to 1): ");
				base = inputScanner.nextDouble();

				if (base < -1 || base > 1) {
					System.out.println("Please enter a value between -1 and 1.");
				}

			} while (base < -1 || base > 1);

			System.out.println("The result of the inverse tangent is " + inverseTan(base));

			do {

				System.out.println("Would you like to contibue (y = yes/ n = no)?");
				userDecision = inputScanner.next().charAt(0);

				if (userDecision == 'n') {
					System.out.println("Goodbye!");
				}

				else if (userDecision == 'y') {
					System.out.println("");
				}

				else {
					System.out.println("Please enter only y or n!");
				}

			} while (userDecision != 'y' && userDecision != 'n');

		} while (userDecision == 'y');

		inputScanner.close();

	}

	public static double inverseTan(double p) {

		int n = 5, r = 0, count = 0;
		double result = 0;

		for (int i = 0; i <= n; i++) {

			count = n - (n - r);
			result += ((computePower((-1), count) * computePower(p, (2 * count) + 1)) / ((2 * count) + 1));

			r++;
		}

		return result;

	}

	public static double computePower(double base, int exponent) {

		double power = 1;
		// For power being 0
		if (exponent == 0) {
			power = base / base;
		}

		// For power being positive
		if (exponent > 0) {
			for (int i = 0; i < exponent; ++i) {

				power = power * base;

			}
		}

		// For power being negative
		if (exponent < 0) {

			for (int i = 0; exponent < i; --i) {

				power = power / base;

			}

		}

		return power;
	}
}
