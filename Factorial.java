package Lecture05;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
	// Get data
	Scanner in = new Scanner(System.in);
	int x = 0, y; // x is a number, and y is the factorial of x.
	System.out.println("Enter a numer for factorial:");
	
	if (in.hasNextInt())
		x = in.nextInt();
	y = factorial (x);
	System.out.println("Factorial of " + x + " is " + y);
	
	} // end of main
	
	
	public static int factorial (int n) {
		
		if (n==0 || n==1) // Stop condition, no recursive calls. 
			return 1;
		else
			return n*factorial(n-1);
	} // end of factorial
	

} // end of class factorial 
