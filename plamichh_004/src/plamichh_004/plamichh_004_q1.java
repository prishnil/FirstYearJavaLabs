package plamichh_004;

import java.util.Scanner;

public class plamichh_004_q1 {


	public static void main(String[] args) 
	{
	
		Scanner inputScanner = new Scanner(System.in);
		
		int choice = 0;
		//Menu Display
		System.out.println ("*****************************");
		System.out.println("1.Power Function");
		System.out.println("2.Sine Function");
		System.out.println("3.Inverse Tangent Function");
		System.out.println("4.Exponential Function");
		System.out.println("5.Factorial Function");
		System.out.println("6.Exit");
		System.out.println ("*****************************");
		
		choice = inputScanner.nextInt (); 
		
		if (choice == 6)
		{ 
			System.out.println("Goodbye!");
		}
		//main loop
        while (choice != 6)
        {
        	//Power
        	if(choice == 1)
        	{
        		
        		System.out.println("Please enter a base value.");
        		double base, result;
        		int exponent;
        		
        		base = inputScanner.nextDouble();
        		System.out.println("Please enter an integer exponent.");
       
        		exponent = inputScanner.nextInt();
        		
        		result = Calculator.power(base, exponent);
        		System.out.println("The result is: " + result + ".");
        	}
        	//Sine
        	if(choice == 2)
        	{
        		System.out.println("Please enter a number in radians.");
        		double radians, result;
        		int iterations;
        		
        		radians = inputScanner.nextDouble();
        		System.out.println("Please enter the number of iterations.");
       
        		iterations = inputScanner.nextInt();
        		
        		result = Calculator.sine(radians, iterations);
        		System.out.println("The result is: " + result + ".");
        	
        		
        	}
        	//Inverse Tangent
        	if(choice == 3)
        	{
        		System.out.println("Please enter a number in radians (-1, 1).");
        		double radians, result;
        		int iterations;
        		
        		radians = inputScanner.nextDouble();
        		
        		//Validation loop
        		while ( radians > 1 || radians < -1) {
        			System.out.println("Please enter a valid number.");
        			radians = inputScanner.nextDouble();
        		}
        		
        		System.out.println("Please enter the number of iterations.");
       
        		iterations = inputScanner.nextInt();
        		
        		result = Calculator.inverseTangent(radians, iterations);
        		System.out.println("The result is: " + result + ".");
        	}
        	//Exponential
        	if(choice == 4)
        	{
        		System.out.println("Please enter a number to calculate the exponential value of.");
        		double exp, result;
        		int iterations;
        		
        		exp = inputScanner.nextDouble();
        		System.out.println("Please enter the number of iterations.");
       
        		iterations = inputScanner.nextInt();
        		
        		result = Calculator.exponential(exp, iterations);
        		System.out.println("The result is: " + result + ".");
        	}
        	//Factorial
        	if(choice == 5)
        	{
        		
        		System.out.println("Please input a positive integer.");
        		double result;
        		int N;
        		
        		N = inputScanner.nextInt();
                while (N < 0) {
                	System.out.println("Please make sure to input a positive integer.");
                	N = inputScanner.nextInt();
                }
        		
        		result = Calculator.factorial(N);
        		System.out.println("The result is: " + result + ".");
        	}
        	
 
           	System.out.println ("*****************************");
        	System.out.println("1.Power Function");
    		System.out.println("2.Sine Function");
    		System.out.println("3.Inverse Tangent Function");
    		System.out.println("4.Exponential Function");
    		System.out.println("5.Factorial Function");
    		System.out.println("6.Exit");
    		System.out.println ("*****************************");
    		
    		choice = inputScanner.nextInt (); 
    		
        	
     
    		
      
        }
	}

}

