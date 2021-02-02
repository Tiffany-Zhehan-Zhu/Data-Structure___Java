package lecture09;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int n, y;
		System.out.println("The fibonacci numbers are: ");
		
		for(n=0; n<=50; n++){
			y = fibonacci(n);
			System.out.println("Fibonacci(" + n + ") = " + y);
		}
	}	
	
	
	public static int fibonacci(int n){	
		if(n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n-2) + fibonacci(n-1);		
	} // end of method fibonacci

}
