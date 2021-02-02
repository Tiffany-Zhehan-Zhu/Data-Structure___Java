package lectrue08;

public class TestBinSearch {

	public static void main(String[] args) {		
		int [] a = { 5, 6, 19, 22, 25, 30, 36, 40};
		
		int x = 5; // For testing "Find"
		int y = 7; // For testing "No find"
		
		// Testing "Find"
		int result = BinSearch.binSearch(a, x); 
		if (result == -1)
			System.out.println("Not found " + x);
		else
			System.out.println("Found at " + result + ", value " + x);
		
		// Testing "No find"
		result = BinSearch.binSearch(a, y); 
			if (result == -1)
				System.out.println("Not found " + y);
			else
				System.out.println("Found at " + result + ", value " + y);
		 
	} // end of main

} // end of class TestBinSearch


