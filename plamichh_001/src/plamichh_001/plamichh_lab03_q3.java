package plamichh_001;

import java.util.Scanner;

public class plamichh_lab03_q3 {

	public static void main(String[] args) {

		//Declare a different type of variable 
		Scanner inputScanner = new Scanner(System.in); 
		
	
	double root1=0, root2=0, Iroot=0, Iroot2=0, d=0, j=0, root0=0, a=0, b=0, c=0, x=0;
		
		//Ask user to input values for a, b and c 
	 
		System.out.println("Enter the a value: ");
		a = inputScanner.nextInt (); 
		
		System.out.println("Enter the b value");
		b = inputScanner.nextInt();		

		System.out.println("Enter the c value: ");
		c = inputScanner.nextInt (); 

		//Calculate discriminant 
		d = (b*b) - (4*a*c);
		
		//Declare i^2
		
		j = Math.sqrt(-1);
				
		//Calculate the roots 
		root1 = ( - b + Math.sqrt(d))/(2*a);
        root2 = (-b - Math.sqrt(d))/(2*a); 
        root0 = -b/(2*a);
        Iroot = Math.sqrt((b*b - 4*a*c)*(-1));

        //Different possibilities of answers
        if (a == 0 && b != 0)
        { 
        	System.out.println ("There is only one root. The root is" + root1);
        }
        else if (a ==0 && b==0 && c==0)
        { 
        	System.out.println ("The solution is trivial.");
        }
        else if (a == 0 && b!= 0 && c!=0)
        {
        	System.out.println ("There is no solution!");
        }
	
		else if (a != 0 && d>=0)	
		{
			System.out.println("The roots are real and unequal");
			System.out.println("Root 1: " + root1);
			System.out.println("Root 2: " + root2);
		}		
		else if (a != 0 && d < 0)
		{	
			System.out.println("The roots are imaginary, so the equation has complex roots.");
			System.out.println("Root1: " + root0 + "+" + Iroot + "i");	
			System.out.println("Root1: " + root0 + "-" + Iroot + "i");
		}
	}

}
