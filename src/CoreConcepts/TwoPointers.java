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
		
		int arr[] = {1,2,2,4,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		int length = removeDuplicate(arr);
		System.out.println(length);
		
		System.out.print("[");
		for(int i= 0; i< length;i++) {
			System.out.print(arr[i]);
			if(i < length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
		System.out.println();
		int[] nums = {1,2,3,4,5,6,7,8};
		findPairs(nums,9);
		
		 
			
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
	 * Only works on sorted array*
	 */
	public static int removeDuplicate(int[] nums) {
		if(nums.length == 0) {
			return 0;
		}
		
		int i = 0;
		
		for(int j=1; j < nums.length;j++) {
			if(nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		} return i+1;
	}
	
	public static void findPairs(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		
		System.out.println("Pairs with sum "+target+":");
		
		while (left < right) {
			int sum = nums[left] + nums[right];
			
			if(sum == target) {
				System.out.println("("+nums[left] + ","+nums[right]+")");
				left++;
				right--;
			}else if(sum < target) {
				left++;
			}else {
				right--;
			}
		}
	}
	
	

}
