package lecture11;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] unsorted = {32, 43, 10, 1, 53, 56, 23, 6, 76};	
		System.out.println("Unsorted: " + Arrays.toString(unsorted));
		
		int[] sorted = quickSort(unsorted, 0, unsorted.length-1);
		System.out.println("Using quickSort \nSorted: " + Arrays.toString(sorted));
	} 
	
	
	/* quickSort: sort v[0]...v[n-1] into increasing order. */
	public static int[] quickSort(int[] v, int left, int right) {		

		// do nothing if arrays contain fewer than two elements
		if (left >= right) 
			return v;
		
		// move partition element to v[0]
		swap(v, left, (left + right)/2);
		int last = left;
		
		// partition
		for (int i = left + 1; i <= right; i++) {
			if ( v[i] < v[left] )
				swap(v, ++last, i);
		}
		
		// restore partition element
		swap(v, left, last);
		quickSort(v, left, last - 1);
		quickSort(v, left + 1, right);	
		
		return v;
		
	} // end of quickSort
	
	
	/* swap: interchange x[a] and x[b] */
	public static int[] swap(int[] x, int a, int b) {		
		int temp;		
		temp = x[a];
		x[a] = x[b];
		x[b] = temp;		
		return x;
	} // end of swap

}
