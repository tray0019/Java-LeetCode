package CoreConcepts;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		
		   String s = "abzzabcccbadefg";
	       int result = lengthOfLongestSubstring(s);
	       System.out.println("Length of longest substring without \nrepeating characters: " + result);
	    
	}

	private static int lengthOfLongestSubstring(String s) {
		//abczzabcbadefg
		
		System.out.println("Step 1: "+s.length());
		HashSet<Character> windows = new HashSet<>();
		int left = 0;
		int maxLength = 0;
		
		for(int right = 0; right<s.length();right++) {
			char c = s.charAt(right);

			System.out.println("Step "+right+": " +c);
			
			while(windows.contains(c)) {
				System.out.println(right+": "+c+" | "+windows.contains(c));
				System.out.println("remove: "+windows.remove(s.charAt(left)));
				windows.remove(s.charAt(left));
				
				left++;
			}
			
			windows.add(c);
			maxLength = Math.max(maxLength, right-left+1);
			
		}
		System.out.println(windows.toString());
		return maxLength;
		
		
		
		
		
		/*
		HashSet<Character> windows = new HashSet<>();
		
		int left = 0;
		int maxLength = 0;
		for(int right = 0; right<s.length();right++) {
			char c = s.charAt(right);
			while(windows.contains(c)) {
				windows.remove(s.charAt(left));
				left++;
								
			}
			windows.add(c);
			maxLength = Math.max(maxLength, right-left+1);
		}//System.out.println(windows.toString());
		return maxLength;
		*/
	}

}
