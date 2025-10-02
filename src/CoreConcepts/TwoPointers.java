package CoreConcepts;

import java.util.Arrays;

public class TwoPointers {
	
	/*
	 * Using two indices (left,right) to scan both ends 
	 */

	public static void main(String[] args) {
		
		boolean test1 = isPalindrome("end");
		boolean test2 = isPalindrome("mom");
		
		System.out.println("isPalindrome method practice");
		System.out.println("Is end a palindrome? "+test1);
		System.out.println("Is mom a palindrome? "+test2);
		System.out.println("-----------------------------");
		
		int arr[] = {1,2,3,2,5};
		System.out.print("[");
		for(int i=0; i< arr.length;i++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
			
		
		
		System.out.println(Arrays.toString(arr)); //second option
			
	}
		
	/*
	 * Reads if word are same forwards and backwards
	 */
	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}else {
				left++;
				right--;
			}
		}
		return true;	
	}
	
	/*
	 * Remove duplicate using two pointers
	 */
	public static int removeDuplicate(int[] nums) {
		if(nums.length == 0) {
			return 0;
		}
		
		int i = 0;
		
		for(int j=1; j <nums.length;j++) {
			if(nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		} return i+1;
	}
	
	

}
