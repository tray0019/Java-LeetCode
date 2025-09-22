package LeetCode;

import java.util.Arrays;

/*
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and 
 * you may not use the same element twice. You can return the answer in any order.
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {

		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] { i,j };
				}
			}
		}
		return new int[] {};

	}
	
	public static void main(String[] args) {
		
		TwoSum ts = new TwoSum();
		
		int[] nums = {1,2,3}; //target 3
		int[] result = ts.twoSum(nums,3);
		System.out.println(Arrays.toString(result));
		
	}
}
