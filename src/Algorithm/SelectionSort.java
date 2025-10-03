package Algorithm;

import java.util.Arrays;

public class SelectionSort {
	
	/*  selection sort - search through an array and keep track of the minimum value during
	 *  each iteration. At the end of each iteration, we swap variables.
	 *  
	 *  
	 *  	Quadratic time 0(n^2)
	 *  	small data set - okay
	 *  	large data set - bad
	 */

	public static void main(String[] args) {
		
		int[] array = {9,5,4,6,3,7,8,2,1};
		
		System.out.println(Arrays.toString(array));
		
		selectionSort(array);
		
	}

	private static void selectionSort(int[] array) {
		
		for(int i =0; i<array.length -1;i++) {
			int min = i;
			for(int j = i+1; j<array.length; j++) {
				if(array[min] > array[j]) {
					min=j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
	}
	
	

}
