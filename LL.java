package Lecture06;

public class LL {
	
	protected Node head;
	protected Node tail;
	protected int SIZE; // How many people
	
	public LL() {
		head = null;
		tail = null;
		SIZE = 0;
	} // end of constructor
	
	public void addFirst(Node newNode) {
		newNode.setNext(head);
		head = newNode;
		SIZE = SIZE + 1;
	} // end of addFirst
	
	public String toString() {
		
		String output = ""; // Null string
		Node nextItem; // Next item we are going to look at.
		nextItem = head;
		
		while (nextItem != null) {
			output = output + " " + nextItem.getElement() + " " + nextItem.getNext();
			nextItem = nextItem.getNext(); // Traverse list - go to the next item 
		} // end of while
		
		output = output + " Done";
		return output;
		
	} // end of class toString
	
	public int getSize() {
		return SIZE;
	}

} // end of class LL
