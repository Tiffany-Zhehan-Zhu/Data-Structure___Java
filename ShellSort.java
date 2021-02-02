package lecture11;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] unsorted = {32, 43, 10, 1, 53, 56, 23, 6, 76};
		System.out.println("Unsorted: " + Arrays.toString(unsorted));
		
		int[] sorted = shellSort(unsorted);
		System.out.println("Using shellSort \nSorted: " + Arrays.toString(sorted));


	}
	
	// shellSort: sort v[0]...v[n-1] into increasing order.
	public static int[] shellSort(int[] v) {
		int gap, i, j, temp;
		int n = v.length;
		
		for (gap = n/2; gap >0; gap /= 2) {
			for (i = gap; i < n; i++) {
				for(j = i-gap; j >= 0 && v[j] > v[j+gap]; j -= gap) {
					temp = v[j];
					v[j] = v[j+gap];
					v[j+gap] = temp; 
				}				
			}			
		}
		return v;
	} // end of method shellSort

}
