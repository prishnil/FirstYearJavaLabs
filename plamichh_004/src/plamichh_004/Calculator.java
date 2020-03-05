package plamichh_004;

public class Calculator {

	// Power Function

	
	
	public static double power(double base, int exponent)
	{
	
		double result = 1;
	
		// For power being 0
		if (exponent == 0) {
			result = 1;
		}

		// For power being positive
		if (exponent > 0) {
			for (double i = 0; i < exponent; ++i) {

				result = result * base;

			}
		}

		// For power being negative
		if (exponent < 0) {

			for (double i = 0; exponent < i; --i) {

				result = result / base;

			}

		}

		return result;
	}

		// inverse Tangent calculator
	
		public static double inverseTangent(double radians, int iterations) 
		
		{
			double result = 0;
			int r = 0, count = 0;

			for (int i = 0; i <= iterations; i++) {
				
				count = iterations - (iterations - r);
				
			result = result
					+ ((Calculator.power((-1), count) * Calculator.power(radians, (2 * count) + 1)) / ((2 * count) + 1));;
			
			r++;
			
			}
		return result;
		
		}
		
		//Sine Calculator 

		public static double sine(double radians, int iterations) 
		
		{
		
				double result = 0;

				for (int i = 0; i <= iterations; i++) {
					result = result + Calculator.power(-1, i)
					* (Calculator.power(radians, 2 * i + 1) / Calculator.factorial(2 * i + 1));
		}

		return result;
		}
		
		//Exponential Calculator 
		
		public static double exponential(double exp, int iterations)
		
		{
			double result = 0;
			int r = 0, count = 0;
			for (int i = 1; i <= iterations; i++) {

				count = iterations - (iterations - r);
				
			result = result + ((Calculator.power(exp, count)) / (Calculator.factorial(count)));
			r++;
		}
		
			return result;
	}
	
		//Factorial
		public static double factorial ( int N)
		
		{
			double factorial = 1;
			for (int i =1; i  <= N; i++) {
				
			factorial = factorial * i;
		}
			
		return factorial;

		
	} 
	
}


