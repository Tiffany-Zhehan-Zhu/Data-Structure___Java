package lecture0304;

public class Sorts {
	
	public static void insertionSort(int [] a, int n) {
		
		for (int i=1; i<n; i++) { // a[0] sorted, rest a[1] on not sorted
			int curr = a[i]; // the one we are trying to place
			int j = i-1; // look to the left, j starts at i, look to left j-1
			while ((j>0) && (a[j]>curr)) // if bigger, move it
				                           // j=0 end of line
				a[j+1] = a[j--]; // a[j] <- a[j-1], j <- j-1
			                     // here, move it, move j to left
			a[j+1] = curr; // a[j] is not bigger, insert
			               // found small ones
			               // found proper place
			               // between the small and the big ones		    			
		} // end of for

	} //end of insertionSort
	
	
	public static void insertionSort2(int [] a, int n) {
		
		for (int i=1; i<n; i++) { // a[0] sorted, rest a[1] on not sorted
			int curr = a[i]; // the one we are trying to place
			int j = i; // look to the left, j starts at i, look to left j-1
			while ((j>0) && (a[j-1]>curr)) // if bigger, move it
				                           // j=0 end of line
				a[j] = a[j-- - 1]; // a[j] <- a[j-1], j <- j-1
			    a[j] = curr; // a[j-1] is not bigger, insert
			                 // found small ones
			                 // found proper place
			                 // between the small and the big ones		    			
		} // end of for

	} //end of insertionSort2
	
	public static void bubbleSort(int [] a, int n) {
		
		for (int j=0; j<n-1; j++) // outer loop, passes
			for (int jj=0; jj<n-1; jj++) // can be n-1-j, optimize
				                         // inner loop, compares
				if (a[jj] >= a[jj+1]) { // out of order, swap
										
					int t = a[jj];
					a[jj] = a[jj+1];
					a[jj+1] = t;
					
				} // end of if, swap
		
	} // end of bubbleSort

} // end of class Sorts




