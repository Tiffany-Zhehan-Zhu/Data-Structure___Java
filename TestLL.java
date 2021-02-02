package Lecture06;

public class TestLL {

	public static void main(String[] args) {
				
		LL myList = new LL ();
		
		System.out.println(myList);
		System.out.println("SIZE= " + myList.getSize());
		
		Node m = new Node("Ed", null);
		Node n = new Node("Mary", null);
		Node p = new Node("Anne", null);
		
		myList.addFirst(m);
		myList.addFirst(n);
		myList.addFirst(p);
		
		System.out.println(myList);
		System.out.println("SIZE= " + myList.getSize());
		
	} // end of main

} // end of TestLL
