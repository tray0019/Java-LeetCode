/*
 * This was a leetcode question in which I have
 * solve!
 * 
 * Easy level, but i thought it wasn't easy and
 * almost took me 2 hours.
 */
package LeetCode;


class RunningSumof1DArray_1480 {

	public static int[] runningSum(int[] nums) {
		
		int sum = 0;
		for(int i = 0;i<nums.length;i++) {
			sum = nums[i]+sum;
			nums[i] = sum;
		}
		
		return nums;

    }
	
	public static void toStri() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		
		int[] test = {1,2,3,4};
		int[] result = runningSum(test);
		
		for(int res:result) {
			System.out.print(res+" ");
		}
		
		
		
	}
}