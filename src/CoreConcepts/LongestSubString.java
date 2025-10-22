package CoreConcepts;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		
		   String s = "abczzabcbadefg";
	       int result = lengthOfLongestSubstring(s);
	       System.out.println("Length of longest substring without repeating characters: " + result);
	    
	}

	private static int lengthOfLongestSubstring(String s) {
		HashSet<Character> windows = new HashSet<>();
		
		int left = 0;
		int maxLength = 0;
		
		for(int right = 0; right<s.length();right++) {
			char c = s.charAt(right);
			System.out.println(right+": "+c);
			
			while(windows.contains(c)) {
				//System.out.println(right+": "+windows.contains(c));
				//System.out.println("remove: "+s.charAt(left));
				System.out.println("remove index "+left+": "+s.charAt(left));
				
				windows.remove(s.charAt(left));
				left++;
								
			}
			
			windows.add(c);
			maxLength = Math.max(maxLength, right-left+1);
			System.out.println(right+": Max Length "+maxLength+" -left:"+left);
			
		}
		
		return maxLength;
		
	}

}
