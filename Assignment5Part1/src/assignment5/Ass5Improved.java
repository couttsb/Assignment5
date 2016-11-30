package assignment5;

public class Ass5Improved {
	
	public int calculateIndexedFibonacciNumber (int fibIndex) {
		// This method will calculate the Fibonacci number from a given index. 
		// Note that indices begin from 1 as it is a number rather than a java index.  
		
		// Variables are initialized in one location for easy alteration.
		int fibNumber = 1;
		int fibNumberLess1;
		int fibNumberLess2;

		// Returns 0 if invalid input (index less than 1) is provided. 
		if (fibIndex <= 0) {
				return 0;
		}
		
		// By convention first two indices have a fibNumber of 1. 
		if (fibIndex <= 2) {
		    		return fibNumber;
		}

		// A loop is performed using the Fibonacci algorithm to determine the fibNumber of the desired index. 
		// The next Fibonacci number is calculated by the sum of the previous two Fibonacci numbers.
		fibNumberLess2 = 1;
		for (int i = 3; i < fibIndex; i++) {
		  		fibNumberLess1 = fibNumber;
		   		fibNumber = fibNumber + fibNumberLess2;
		    		fibNumberLess2 = fibNumberLess1;
		}

		// The fibNumber in the fibIndex of interest is returned.
		return fibNumber;
	}

}