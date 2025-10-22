package NeetCode;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		
		ValidAnagram test = new ValidAnagram();
		
		
		System.out.println(test.isAnagram("racecar","carrace"));

	}
	
	public boolean isAnagram(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		
		System.out.println(tArray);
		
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		System.out.println(tArray);
		System.out.println(sArray);
	
		return Arrays.equals(sArray, tArray);
		
	}
	
	

}
