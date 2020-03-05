package plamichh_002;

import java.util.Scanner;

public class plamichh_lab02_q1 {

	public static void main(String[] args) {

		System.out.println("********************************");
		System.out.println("********Value Conversions*******");
		System.out.println("   *1. Celcius -> Farenheit *");
		System.out.println("   *2.  Centimeter -> Inch  *");
		System.out.println("   *3.  Meters -> Feet      *");
		System.out.println("   *4.  Km/h -> MPH         *");
		System.out.println("   *5.  Exit                *");
		System.out.println("********************************");

		double celcius = 0, farenheit = 0, centimeter = 0, inch = 0, meter = 0, feet = 0, kmh = 0, mph = 0;
		int conversion = 0;

		// New kind of variable
		Scanner inputScanner = new Scanner(System.in);

		do {
		
		System.out.println("Please enter an option between 1 and 5");
		conversion = inputScanner.nextInt();

	

			switch (conversion) {
			// Options for conversion
			case 1:

				System.out.println("Please enter the value for celcius.");

				celcius = inputScanner.nextDouble();
				if (celcius < 0) // If below 0
				{
					System.out.println("Ice may be possible, please be careful!");
				} else // Anything above 0
				{
					farenheit = (9 / 5) * celcius + 32;
					System.out.println("The conversion is " + farenheit + "degrees.");
				}
				break;

			case 2:
				System.out.print("Please enter the value for centimeters.");
				centimeter = inputScanner.nextDouble();
				while (centimeter < 0) {
					System.out.println("Please enter a positive integer.");
					centimeter = inputScanner.nextDouble();
				}
				inch = 0.39 * centimeter;
				System.out.println("The conversion is " + inch + "inches.");
				break;

			case 3:
				System.out.print("Please enter the value for meters.");

				meter = inputScanner.nextDouble();
				while (meter < 0) {
					System.out.println("Please enter a positive integer."); // Can't
					// calculate
					// negative
					meter = inputScanner.nextDouble();

				}
				feet = 3.28 * meter;
				System.out.println("The conversion is " + feet + "feet.");
				break;

			case 4:
				System.out.print("Please enter the value for km/h.");

				kmh = inputScanner.nextDouble();
				while (kmh < 0 || kmh > 160) {
					System.out.println("Please enter a positive integer between 0 and 160."); // Can't
																								// calculate
					// negative
					kmh = inputScanner.nextDouble();

				}
				mph = kmh / 1.609;
				System.out.println("The conversion is " + mph + "mph.");
				break;

			case 5:
				System.out.println("Goodbye!");
				break;
			
				
			}

		}while (conversion < 5 && conversion > 0);
	
	}
}


