package Practice;

import java.util.HashSet;

public class Easy {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int target = 6;
		
		int[] nums4 = {4, 4, 2, 4, 7};
		int[] nums0 = {};
		int[] nums = {2, 5, 2, 7, 2};
		int[] nums2 = {2, 3, 6, 9, 10};
		int[] nums3 = {-8, -3, -12, -5};
		
		containsDuplicate(nums);
		hashSetContainsDuplicate(nums);
		countEven(nums2);
		findLargest(nums);

System.out.println("countOccurrences: "+countOccurrences(nums,target));
System.out.println("findFirstIndex: "+findFirstIndex(nums2,target));
System.out.println("reverseString: "+reverseString("CAt"));
System.out.println("reverseString2: "+reverseString2("hello"));
System.out.println("isPalindrome: "+isPalindrome("hoh"));
System.out.println("twoSum: "+twoSum(nums,7));



		

	}
	
	public static boolean containsDuplicate(int[] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				
				if(nums[i] == nums[j]) {
					System.out.println("containsDuplicate: true");
					return true;
				}
			}
		}
		System.out.println("containsDuplicate: false");
		return false;
	}
	
	public static boolean hashSetContainsDuplicate(int[] nums) {
		

		HashSet<Integer> seen = new HashSet<>();
		
		for (int i = 0; i <nums.length; i++) {
			
			if(seen.contains(nums[i])) {
				System.out.println("hashetContainDuplicate: true");
				
				return true;
			}
			
			seen.add(nums[i]);
		}
		
		System.out.println("hashetContainDuplicate: false");
		return false;
	}
	
	public static int countEven(int[] nums) {
		
		int evenNumber = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				System.out.println(nums[i] % 2 == 0);
				evenNumber = evenNumber+1;
			}
		}
		
		System.out.println(evenNumber);
		
		return evenNumber;
	}
	
	public static int findLargest(int[] nums) {
		
		int largest = nums[0];
		
		for(int i = 1; i<nums.length; i++) {
			if(nums[i] > largest) {
				largest = nums[i];
				
			}
		}
		
		System.out.println(largest);
		return largest;
	}
	
	public static int countOccurrences(int[] nums, int target) {
		int count = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(target == nums[i]) {
				count++;
			}
		}
		
		return count;

	}
	
	public static int findFirstIndex(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == target) {
				return i;
			}
		}
		
		return -1;

	}
	
	public static String reverseString(String text) {
		
		String reversed = "";
		
		for(int i = text.length()-1; i>=0; i--) {
			reversed = reversed + text.charAt(i);
		}
		
		return reversed;

	}
	
	public static String reverseString2(String text) {
		StringBuilder reverse = new StringBuilder();
		
		for(int i = text.length()-1;i>=0;i--) {
			reverse.append(text.charAt(i));
		}
		
		return reverse.toString();
	}
	
	public static boolean isPalindrome(String text) {

		int left = 0;
		int right = text.length()-1;
		
		while(left<right) {
			if(text.charAt(left)!= text.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;

	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i]+nums[j] == target) {
					System.out.println(nums[i]+" + "+nums[j]+" = "+target);
					return new int[] {i,j};
					
				}
			}
		}
		
		return new int[] {};
		
		

	}

}
