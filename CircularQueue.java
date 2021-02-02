package lecture0304;

import java.util.Scanner;

public class CircularQueue {
		
	private int head,tail;
	private static final int SIZE = 5;
	/* static: one for whole class.
	 * final: no changes. The variable is a constant. */
	private String[] q = new String [SIZE];
	private String name;
	Scanner input = new Scanner( System.in );  // System.in: read the input from keyboard.
	
	
// Special method - Constructor 
	public CircularQueue () { // The constructor name should be exactly the same as the class name.
		/* No data type: no int. 
		 * No return type: no void.*/
		head = -1;
		tail = -1;		
	} // end constructor
	
	
	public void insertQueue() { // Method's name should start with lower-case and then upper-case as variable's name.
		if (isQueueFull())
			System.out.println("Full"); // and exit
		
		else {
			name = getName();
			if (isQueueEmpty())
				head = head +1;
			
			if (tail == SIZE -1) // the wrap
				tail = -1; // bumped below 
			q[++tail] = name; // ++tail: tail = tail + 1, before tail is used. 
			
		} //end of else		
	} // end of insertQueue
	
	
	public void deleteQueue() {
		String X; // to display name
		if (isQueueEmpty())
			System.out.println("Underflow"); // and exit
		
		else { // outer else
			X = q[head];
			System.out.println("Servicing" + X);
			if (head == tail) {  // Just emptied. Reset head and tail. And exit.
				head = -1;
				tail = -1;
			} // end of if
			
			else { // inner else
				head++; // head = head + 1, after head is used. 
				if (head == SIZE) //wrap
					head = 0;
			}// end of inner else
			
		} // end of outer else	
	} // end of deleteQueue
	
	
	public void printQueueLogical() {
		int next; // to traverse logical queue
		if (isQueueEmpty())
			System.out.println("Empty"); // and exit
		
		else {
			next = head;
		    System.out.println("q["+ next +"]=" + q[next]);
                               /* +:concatenation.
                                * next: subscript index.
                                * [next]:the value of that index. */
		    
		    while (next != tail) {
		    	next++; // bump next
		    	if (next == SIZE) // wrapped
		    		next = 0; // go to front
		    	System.out.println("q["+ next +"]=" + q[next]);	
		    } // end of while
		    
		} // end of else	
	} // end of printQueueLogical 
	
	
	public void printQueuePhysical() {
		for (int j=0; j < SIZE; j++) 
			System.out.println("q["+ j +"]=" + q[j]);	
		/* j should be in lower-case. 
		 * Because first word of a variable¡¯s name is written using all lower-case letters, 
		 * Each subsequent word is capitalized. */
	} // end of printQueuePhysical
	
	
	private String getName() {		
		System.out.println("Enter name: ");
		return input.nextLine(); // input: variable, which is a scanner.			
	} // end of getName
	
	
	public boolean isQueueEmpty () {
		return (head == -1);
	} // end of isQueueEmpty
	
	
	public boolean isQueueFull () {
		return ((tail - head + 1 == 0) || (tail - head +1 == SIZE)); 
	} // end of isQueueFull
	
	
} // end of class CircularQueue


