package plamichh_005;

import java.util.Scanner;

class Rectangle {

	// scaler
	public void scaler(double Scale) {
		side1 = Scale * side1;
		side2 = Scale * side2;
	}

	// member variables
	private double side1;
	private double side2;

	public double setSide1(double a, double b) {
		double side = a - b;
		return Math.abs(side);
	}

	public double setSide2(double c, double d) {
		double side = c - d;
		return Math.abs(side);
	}

	public Rectangle(double X1, double X2, double Y1, double Y2) {
		side1 = setSide1(X1, X2);
		side2 = setSide2(Y1, Y2);

	}

	public void print() {

		int s1 = (int) this.side1;
		int s2 = (int) this.side2;

		// Top margin
		for (int i = 0; i < s1; i++) {
			System.out.print("*");
		}

		// side margins
		for (int j = 0; j < (s2 - 2); j++) {
			System.out.printf("%n");

			System.out.print("*");

			if (side1 >= 2 || side2 >= 2) {
				for (int i = 0; i < (s1 - 2); i++) {
					System.out.print(" ");
				}
			}

			System.out.print("*");
		}
		System.out.printf("%n");

		// bottom margin
		if (s1 != 1) {
			for (int i = 0; i < s1; i++) {
				System.out.print("*");
			}
		}

	}
}
