package Algorithm;

public class LinearSearch {

	public static void main(String[] args) {
		
		// linear search = Iterate through a collection one element at a time
		// runtime complexity: 0(n)
		// Disadvantages:
		// Slow for large data sets
		
		// Advantages:
		// Fast for searches of small to medium data sets
		// Does not need to sorted
		// Useful for data structures that do not have random access (Linked List)
		
		int[] array = {1,3,9,5,7,9,3,4,8,23};
		
		int index = linearSearch(array,9);
		
		if(index != -1){
			System.out.println("Element found at index: "+ index);
		}else {
			System.out.println("Element not found");
		}

	}
	
	private static int linearSearch(int[] array, int value) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}			
		}
		return -1;
	}
}
