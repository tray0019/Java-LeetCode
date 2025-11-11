package Algorithm;

import java.util.Arrays;

public class InsertionSort {

	/* insertion sort - afer comparing elements to the left
	 *   				shift elements to the right to make room to insert a value
	 * 
	 * 
	 * 				Quadratic time O(n^2)
	 * 				small data set = decent
	 * 				large data set = BAD
	 * 
	 * 				Less steps than bubble Sort
	 * 		 		Best case is O(n) compared to Selection Sort O(n^2)
	 */
	public static void main(String[] args) {
		
		int array[] = {9,1,8,2,7,3,7,4,6,5};
		
		System.out.println(Arrays.toString(array));
		
		testInsertionSort(array);

		System.out.println(Arrays.toString(array));
	}

	private static void testInsertionSort(int[] array) {
		
		//[9, 1, 8, 2, 7, 3, 7, 4, 6, 5]
		
		for(int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i-1;//same mistake lol
			
			while(j>=0 && array[j] > temp) {
				array[j+1] = array[j];
				j--;
			}
			
			array[j+1] = temp;
			
		}
		
		
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}
	
	private static void insertionSort(int[] array) {
		
		for(int i = 1;i < array.length; i++) {
			int temp = array[i];
			int j = i-1;
			
			while(j >= 0 && array[j] > temp) {
				array[j+1] = array[j];
				j--;
			}

			array[j + 1] = temp;
		}
		
	}
	
	

}
