package CoreConcepts;

import java.util.Arrays;

public class SlidingWindow {

	public static void main(String[] args) {
		
		int[] test = {2, 1, 5, 1, 3, 2};
		
		System.out.println(Arrays.toString(test));
		
		int result = findMaxSum(test,3);
		System.out.println("Result: "+result);
		
	}
	private static int findMaxSum(int[] arr, int k) {
		
		int windowSum = 0;
		int maxSum;
		
		for(int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		
		maxSum = windowSum;
		
		for(int i = k; i < arr.length; i++) {
			windowSum += arr[i] - arr[i-k];
			maxSum = Math.max(maxSum, windowSum);
		}
		
		return maxSum;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int windowSum = 0;
		int maxSum = 0;
		
		for(int i = 0; i<k;i++) {
			windowSum += arr[i];
		}
		//[2, 1, 5, 1, 3, 2]
		maxSum = windowSum;
		for(int i = k; i<arr.length;i++) {
			windowSum += arr[i] - arr[i-k];//8 = 8+1-[3-3 = 0 [2]]
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
		*/
	}

}
