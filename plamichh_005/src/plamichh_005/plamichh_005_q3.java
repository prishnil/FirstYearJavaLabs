package plamichh_005;

import java.util.Scanner;

public class plamichh_005_q3 {

	public static void main(String[] args) {

		boolean exit = false;

		// user input
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter integer for x1");
		double a = inputScanner.nextDouble();
		System.out.println("Enter integer for x2");
		double b = inputScanner.nextDouble();
		System.out.println("Enter integer for y1");
		double c = inputScanner.nextDouble();
		System.out.println("Enter integer for y2");
		double d = inputScanner.nextDouble();

		// new rectangle
		Rectangle r = new Rectangle(a, b, c, d);

		do {
			// main menu
			System.out.printf("%n");
			System.out.println("1. Scale");
			System.out.println("2. Print");
			System.out.println("3. Exit");
			int choice = inputScanner.nextInt();

			// switch statement
			switch (choice) {
			// scale
			case 1:

				// user input
				System.out.println("Please enter a scaler:");
				double Scale = inputScanner.nextDouble();
				// scaling
				r.scaler(Scale);
				exit = true;
				break;
			// print
			case 2:
				r.print();
				exit = true;
				break;
			// exit condition
			case 3:
				exit = false;
				break;
			}

		} while (exit == true);

	}

}
