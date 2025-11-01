package Algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		
		/*
		 * bubble sort - pairs of adjacent elements are compared, and the elements
		 * 				 swapped if they are not in order.
		 * 
		 * 				 Quadratic time 0(n^2)
		 * 	 			 small data set = okay.ish
		 * 				 large data set = bad
		 */
		
		int array[] = {9,1,8,2,7,3,6,4,5};
		
//		/int array[] = {9,1,5};
		
		for(int i: array) {
			System.out.print(i);
		}
		
		System.out.println();
		testbubbleSort(array);
		for(int i: array) {
			System.out.print(i);
		}
		
	}

	private static void testbubbleSort(int array[]) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		/*
		for(int i = 0; i<array.length;i++ ) {
			for(int j = 0; j<array.length-i-1;j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				}
				
			}
		}*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void bubbleSort(int array[]) {
		for(int i = 0;i<array.length-1;i++) {
			System.out.println(i+": ");
			for(int j = 0;j<array.length-i-1;j++) {
				//System.out.print(array.length-i-1);
				System.out.println(j+":");
				if(array[j] > array[j+1]) {
					int temp = array[j];
					System.out.println("temp: "+temp);
					array[j] = array[j+1];
					System.out.println("array[j]: "+array[j]);
					array[j+1] = temp;
					System.out.println("array[j+1]: "+array[j+1]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
