package lecture13;

import java.util.Scanner;

public class TestStack {
	
	public static void main(String args[]) {
		
		Stack m = new Stack();
		Scanner input = new Scanner( System.in ); 
		System.out.println("Enter command - i/d/p/l/q : "
				         + "\n( i(insert), d(delete), p(print physical), "
				         + "l(print logical), q(quit) )"); 
		char x = input.next().charAt(0);
		
		while (x != 'q' && x != 'Q') {
			switch (x) {
			   case 'i':
			   case 'I':
			        m.push();
			        break;
			   case 'd':
			   case 'D':
				   m.pop();
				   break;
			   case 'l':
			   case 'L':
				   m.printStackLogical();
				   break;
			   case 'p':
			   case 'P':
				   m.printStackPhysical();
				   break;
			   default:
				   System.out.println("Incorrect input!");
				   break;  		
			} 
			
			System.out.println("\nEnter command - i/d/p/l/q :");
			x = input.next().charAt(0);
		} 
		
		input.close();
		System.out.println("\nDone!");
	}
}