package NeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		ContainsDuplicate test = new ContainsDuplicate();
		
		int[] arr = {1,2,3,4,2};
		
		test.hasDuplicate(arr);
		System.out.println(test.hasDuplicate(arr));
		
	}
	
	public boolean hasDuplicate(int[] nums) {

		Set<Integer> set = new HashSet();
		
		for(int num: nums) {
			if(!set.add(num)) {
				return true;
			}
		}
		
		return false;

	}
}
