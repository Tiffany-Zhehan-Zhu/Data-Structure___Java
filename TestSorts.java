package lecture0304;

import java.util.Arrays;

public class TestSorts {

	public static void main(String[] args) {
		
		int [] a = {5,4,3,8,1};
		
		System.out.println("Unsorted: " + Arrays.toString(a));
		System.out.println("Using insertion");
		Sorts.insertionSort2(a, a.length); 
		System.out.println("Sorted: " + Arrays.toString(a) + "\n");
		
		int [] b = {7,5,2,8,1};
		
		System.out.println("Unsorted: " + Arrays.toString(b));
		System.out.println("Using bubbleSort");
		Sorts.bubbleSort(b, b.length);
		System.out.println("Sorted: " + Arrays.toString(b));

	} // end main

} // end class TestSorts




