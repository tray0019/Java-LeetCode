package Algorithm;

public class Interpolation {

	public static void main(String[] args) {
		/* Interpolation search = improvement over binary search best use for "uniformly" distributed data
		 * 						   "guesses" where a value might be based on calculated probe results
		 * 						   if probe is incorrect, search area is narrowed, and a new probe is calculated
		 * 
		 * 							average case: 0(log(log(n)))
		 *  						worst case: 0(n) [values increase exponentially]
		 */
		
		int array[] = {1,2,4,8,26,32,64,128,256,512,1054};
		int index = interpolationSearch(array,128);
		
		if(index != -1) {
			System.out.println("Element found index: "+ index);
		}else {
			System.out.println("Element not found");
		}
		

	}

	private static int interpolationSearch(int[] array, int value) {
		
		int high = array.length - 1;
		int low = 0;
		
		while(value >= array[low] && value <= array[high] && low <= high) {
			int probe = low + (high - low)*(value - array[low]) / 
					     (array[high] - array[low]);
		
			System.out.println("probe: "+probe);
			if(array[probe] == value) {
				return probe;
			}else if(array[probe] < value) {
				low = probe + 1;
			}else {
				high = probe -1;
			}
		}
		
		return -1;
	}

}
