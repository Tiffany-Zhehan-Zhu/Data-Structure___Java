package Lecture07;

public class TestDate {
	
	public static void main(String[] args) {
		
		Date m = new Date(1, 1, 2016);
		Date n = new Date(1, 1, 2016);
		Date p = new Date(1, 1, 2017);
		Date q = m;
		
		System.out.println("m is " + m + "\nn is " + n + "\np is " + p +"\nq is " + q);
		
		// Test m and n
		if (m == n) {
			System.out.print("m == n, true\t");
		} else {
			System.out.print("m == n, false\t");
		}
		
		if (m.equals(n)) {
			System.out.println("m equals n, true");
		} else {
			System.out.println("m equals n, false");
		}

		// Test m and p
		if (m == p) {
			System.out.print("m == p, true\t");
		} else {
			System.out.print("m == p, false\t");
		}
		
		if (m.equals(p)) {
			System.out.println("m equals p, true");
		} else {
			System.out.println("m equals p, false");
		}

		// Test m and q
		if (m == q) {
			System.out.print("m == q, true\t");
		} else {
			System.out.print("m == q, false\t");
		}
		
		if (m.equals(q)) {
			System.out.println("m equals q, true");
		} else {
			System.out.println("m equals q, false");
		}

	} // end of main

} // end of class TestDate


