package plamichh_006;

import java.util.Scanner;

public class plamichh_006_q2 {

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);

		int numOfAssign = 0;
//ask for user input
		System.out.println("Please enter the number of assignments.");

		numOfAssign = inputScanner.nextInt();
//declaring variables 
		int grade[] = new int[numOfAssign];
		double weight[] = new double[numOfAssign];
//use array for the grade
		for (int i = 0; i < numOfAssign; i++) {
			System.out.println("Please enter the integer grade you received on assignment " + i + " (1-100):");
			grade[i] = inputScanner.nextInt();

			while (grade[i] > 100 || grade[i] < 0) {
				System.out.println("Please ensure the grade is an integer value between 0 and 100");
				grade[i] = inputScanner.nextInt();
			}
		}

		double sum = 0;
//use arrays for the weight
		for (int j = 0; j < numOfAssign; j++) {
			System.out.println("Please enter the the weight of assignment " + j + " (0.0-1.0):");
			weight[j] = inputScanner.nextDouble();
			
			while (weight[j] > 1 || weight[j] < 0) {
				System.out.println("Please ensure the weight is a double value between 0 and 1.");
				weight[j] = inputScanner.nextDouble();
			
			sum = sum + weight[j];
			}
		}
		System.out.println("The sum of the weights is " + sum); 
	//ensure that the sum of the weights is 1 	
		while (sum != 1) {
			sum = 0;
			for (int j = 0; j < numOfAssign; j++) {
				System.out.println("Please enter the the weight of assignment " + j + " (0.0-1.0):");
				weight[j] = inputScanner.nextDouble();
				sum = sum + weight[j];
			}
			System.out.println("The sum of the weights is " + sum); 
		}
		//calculate the weighted average
		double total = 0;
		double weightedAverage = 0;
		for (int w = 0; w < numOfAssign; w++) {
			weightedAverage = grade[w] * weight[w];
			total = total + weightedAverage;
		}
		System.out.println("The weighted average is " + total);
	}

}
