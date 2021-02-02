package lecture10;
import java.util.Scanner;

public class Fibloop {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = 0; // The n for Fibonacci number Fn
		int y; // value of Fn
		int[] a = new int[101];	
		System.out.println("Enter n for Fn: ");

		if (in.hasNextInt())
			x = in.nextInt();

		y = fibonacci(x, a);
		System.out.println("Fibonacci " + x + " is: " + y);

	} // end of main


	public static int fibonacci(int n, int[] b) {	

		int returnValue;
		b[0] = 0;
		b[1] = 1;

		for (int j=2; j<=n; j++) { // Fill in the rest of numbers
			b[j] = b[j-1] + b[j-2];
		}
		returnValue = b[n];
		return returnValue;

	} // end of fibonacci

}
