package Algorithm;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		//binary search == Search algorithh that finds the position
		//					of a target value within a sorted array.
		//					Half of the array is eliminated during each "step"
		
		int array[] = new int[9];
		int target = 7;
		
		for(int i = 0; i<array.length; i++) {
			array[i] = i;
			System.out.println(i+": "+array[i]);
		}
		
		// int index = Arrays.binarySearch(array, target);
		
		int index = binarySearch(array, target);
		
		if(index == -1) {
			System.out.println(target+ " not found");
		}else {
			System.out.println("Element found at: "+ index);
		}
		
	}

	private static int binarySearch(int[] array, int target) {
			
		
		int low = 0;
		int high = array.length-1;
		
		
		
		
		while(low < high) {
			int middle = (low+high)/2;
			int value = array[middle];
			
			if( value > target) {
				high = middle -1;
			}else if(value < target) {
				low = middle + 1;
			}else {
				return middle;
			}
		}
		
		return -1;
		
	}	
		
		
	
	
	
	/*
	private static int binarySearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length-1;
		
		while(low <= high) {
			int middle = (high+low)/2;
			int test = array[middle];
			
			if(test > target) {
				high = middle - 1;
			}else if(test < target) {
				low = middle +1;
			}else {
				return middle;
			}
			
		}
		
		return -1;
		
	}
	

	
	
	
	
	
	
	
	
	
	
	

	/*
	private static int binarySearch(int[] array, int target) {
		
			int low = 0;
			int high = array.length -1;
			System.out.println(high);
			
			while(low <= high) {
				int middle = low + (high-low)/2;
				int value = array[middle];
				
				System.out.println("middle "+ middle);
				if(value < target) {
					System.out.println("low was "+low);
					low = middle + 1;
					System.out.println("low is "+low);
				}else if(value > target) {
					high = middle -1;
				}else {
					return middle;
				}
			}
		
		return -1;
	}
	*/

}
