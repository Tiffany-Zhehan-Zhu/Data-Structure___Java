package lectrue08;

public class BinSearch {
	
	public static int binSearch (int [] a, int x) {		
		int low = 0;
		int high = a.length - 1;
		int mid;
		
		while (low <= high) {
			
			mid = (low + high)/2;
			
			if (x > a[mid])  // Query greater, go to bottom.			
				low = mid + 1;
			else if (x < a[mid]) // Query smaller, go to front.
				high = mid -1;
			else
				System.out.println("Found at " + mid);
			    return mid;

		} // end of while
		
	return -1;
	
	} // end of binSearch
} // end of class BinSearch



