package plamichh;

import java.util.Scanner;

public class plamichh_lab00_q3 {

	public static void main(String[] args) {
	
		//Declaring the value of variables of the points on a cartesian plane
		double  side1 = 0, side2 = 0, distance = 0, perimeter = 0;
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0; 
	
		//A new type of variable 
		Scanner inputScanner = new Scanner(System.in);
		
		//Ask the user for the values of the variables 
		System.out.println("Enter the x coordinate for the first point: ");
		x1 = inputScanner.nextInt ();
		
		System.out.println("Enter the y coordinate for the first point: ");
		y1 = inputScanner.nextInt ();
		
		System.out.println("Enter the x coordinate for the second point: ");
		x2 = inputScanner.nextInt ();
		
		System.out.println("Enter the y coordinate for the second point: ");
		y2 = inputScanner.nextInt ();
		
		//Stating the calculations for each side
		side1 = x2 - x1;
		side2 = y2-y1;
		
		//Stating the calculations for the hypotneuse
		distance = Math.sqrt(side1*side1 + Math.pow(side2, 2.0));
		
		//Stating the perimeter of the triangle 
		perimeter = side1 + side2 + distance;
		
		//Presenting the distance and perimeter of the triangle to the user 
			System.out.println("The hypotneuse of the triangle is " + Double.toString(distance));
			System.out.println("The perimeter of the triangle is " + Double.toString(perimeter));
			
			
	}

}
