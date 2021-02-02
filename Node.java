package Lecture06;

public class Node {
	
	private String elt; // elt: element
	private Node next; // next: link for next
	
	public Node (String s, Node n) {
		elt = s;
		next = n;
	} // end of constructor
	
	// "Getter"
	public String getElement() {
		return elt;
	}
	
	public Node getNext() {
		return next;
	}
	
	// "Setters"
	public void setElement (String newElt) {
		elt = newElt;
	}
	
	public void setNext (Node newNext) {
		next = newNext;
	}


} // end of class Node
