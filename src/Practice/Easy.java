package Practice;

import java.util.Arrays;
import java.util.HashMap;
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
		int[] nums = {4, 5, 3, 8,6};
		int[] nums2 = {2, 3, 6, 9, 10};
		int[] nums3 = {-8, -3, -12, -5};
		
		System.out.println("containsDuplicate:        "+containsDuplicate(nums));
		System.out.println("hashSetContainsDuplicate: "+hashSetContainsDuplicate(nums));
		System.out.println("countEven:                "+countEven(nums2));
		System.out.println("findLargest:              "+findLargest(nums));
		System.out.println("countOccurrences: 	  "+countOccurrences(nums,target));
		System.out.println("findFirstIndex: 	  "+findFirstIndex(nums2,target));
		System.out.println("reverseString: 		  "+reverseString("CAt"));
		System.out.println("reverseString2: 	  "+reverseString2("hello"));
		System.out.println("isPalindrome: 		  "+isPalindrome("hoh"));
		System.out.println("twoSum: 		  "+Arrays.toString(twoSum(nums,7)) );
		System.out.println("twoSumHashMap: 		  "+Arrays.toString( twoSumHashMap(nums,10)));
		System.out.println("buildFrequencyMap: "+buildFrequencyMap(nums4));

		
	}
	
	public static boolean containsDuplicate(int[] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				
				if(nums[i] == nums[j]) {
					//System.out.println("containsDuplicate: true");
					return true;
				}
			}
		}
		//System.out.println("containsDuplicate: false");
		return false;
	}
	
	public static boolean hashSetContainsDuplicate(int[] nums) {
		

		HashSet<Integer> seen = new HashSet<>();
		
		for (int i = 0; i <nums.length; i++) {
			
			if(seen.contains(nums[i])) {
				//System.out.println("hashetContainDuplicate: true");
				
				return true;
			}
			
			seen.add(nums[i]);
		}
		
		//System.out.println("hashetContainDuplicate: false");
		return false;
	}
	
	public static int countEven(int[] nums) {
		
		int evenNumber = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				//System.out.println(nums[i] % 2 == 0);
				evenNumber = evenNumber+1;
			}
		}
		
		//System.out.println(evenNumber);
		
		return evenNumber;
	}
	
	public static int findLargest(int[] nums) {
		
		int largest = nums[0];
		
		for(int i = 1; i<nums.length; i++) {
			if(nums[i] > largest) {
				largest = nums[i];
				
			}
		}
		
		//System.out.println(largest);
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
					//System.out.println(nums[i]+" + "+nums[j]+" = "+target);
					return new int[] {i,j};
					
				}
			}
		}
		
		return new int[] {};

	}
	
	public static int[] twoSumHashMap(int[] nums, int target) {

	    HashMap<Integer, Integer> seen = new HashMap<>();

	    for (int i = 0; i < nums.length; i++) {

	        int complement = target - nums[i];
	        if (seen.containsKey(complement)) {
	            return new int[] {seen.get(complement), i};
	        }
	        
	        seen.put(nums[i], i);
	    }

	    return new int[] {};
	}
	
	public static HashMap<Integer, Integer> buildFrequencyMap(int[] nums) {
		
		HashMap<Integer,Integer> counts = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(counts.containsKey(nums[i])) {
				counts.put(nums[i], counts.get(nums[i])+1);
			}else {
				counts.put(nums[i],1);
				System.out.println(counts);
			}
		}
		
		
		return counts;

		
	}
	
	

}
