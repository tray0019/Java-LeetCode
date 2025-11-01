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
		int maxSum = 0;
		
		for(int i = 0; i<k;i++) {
			windowSum += arr[i];
			System.out.println(i+": "+windowSum);
			System.out.println();
		}
		
		maxSum = windowSum;
		System.out.println("Max Sum: "+maxSum);
		//System.out.println("Window Sum: "+windowSum);
		for(int i = k; i<arr.length;i++) {
			// 8 = 8 + 1 - 0 
			System.out.println(arr[i] +" | "+arr[i-k]+ " "+ i + " | "+ arr[k]);
			windowSum += arr[i] - arr[i-k];
			System.out.println(i+": "+windowSum);
			maxSum = Math.max(maxSum, windowSum);
			System.out.println(maxSum);
		}
		return maxSum;
		
	}
	
	

}
