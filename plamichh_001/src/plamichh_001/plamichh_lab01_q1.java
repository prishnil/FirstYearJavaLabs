package plamichh_001;

import java.util.Scanner;

public class plamichh_lab01_q1 {

	public static void main(String[] args) {

		//Declaring variables 
		double weight1 = 0, weight2 = 0, weight3 = 0, weight4 = 0, FinalGrade = 0; 
		int grade1 = 0, grade2 = 0, grade3 = 0, grade4 =0;
			
	//Declare a different type of variable 
				Scanner inputScanner = new Scanner(System.in);
		
				//Quiz 1 numbers 
				System.out.println("Enter the grade on the first quiz: ");
		
				grade1 = inputScanner.nextInt (); 
				
				System.out.println("Enter the weight of the first quiz");
				weight1 = inputScanner.nextDouble();
				
				//Quiz 2 numbers 
				
				System.out.println("Enter the grade of the second quiz: ");
				grade2 = inputScanner.nextInt (); 
				
				System.out.println("Enter the weight of the second quiz");
				weight2 = inputScanner.nextDouble();
				
				//Quiz 3 numbers 
				
				System.out.println("Enter the grade of the third quiz: ");
				grade3 = inputScanner.nextInt (); 
				
				System.out.println("Enter the weight of the third quiz");
				weight3 = inputScanner.nextDouble();
				
				//Quiz 4 numbers 
				
				System.out.println("Enter the grade of the fourth quiz: ");
				grade4 = inputScanner.nextInt (); 
				
				System.out.println("Enter the weight of the fourth quiz");
				weight4 = inputScanner.nextDouble();

		//Stating the calculation for weightest average
		
				FinalGrade = (grade1*(weight1) + grade2*(weight2) + grade3*(weight3) + grade4*(weight4));
				
		//Output the result to the user
				System.out.println("The weighted average for the 4 quizzes is: " + Double.toString(FinalGrade));

	}

}
