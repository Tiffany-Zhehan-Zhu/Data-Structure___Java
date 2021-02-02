package lecture0304;

import java.util.Scanner;

public class TestCircularQueue2 {

	public static void main(String[] args) {
		CircularQueue m = new CircularQueue( );
		Scanner in = new Scanner( System.in );
		
		String response;
		char x;
		System.out.println("Enter command - i/d/p/l/q"); // "i/d/p/l/q" is the menu
		response = in.next();
		x = response.charAt(0);
		x = Character.toLowerCase(x);
		while (x != 'q' && x != 'Q') { /*   "&&" can't be "||", 
		                                    because (x != 'q' || x != 'Q') is always true 
		                                    no matter we input q or Q, 
		                                    and the loop will never end.  */
			switch (x) {
			   case 'i':
			        m.insertQueue();
			        break;
			   case 'd':
			   case 'D':
				   m.deleteQueue();
				   break;
			   case 'l':
				   m.printQueueLogical();
				   break;
			   case 'p':
				   m.printQueuePhysical();
				   break;
			   default:
				   System.out.println("Incorrect + input + i/d/p/l/q");
				   break;  		
			} // end switch
		
		System.out.println("Enter command - i/d/p/l/q");
		response = in.next();
		x = response.charAt(0);
		x = Character.toLowerCase(x);						
		} // end of while	
		
		System.out.println("\nDone");

	} // end of main

} // end of TestCircularQueue2


