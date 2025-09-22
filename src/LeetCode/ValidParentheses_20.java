package LeetCode;

public class ValidParentheses_20 {
	
	 public static boolean isValid(String s) {
	     
		 boolean valid = true;
		 String[] sArray = new String[s.length()];
		 
		 if(s.length() % 2 == 0 ) {
			 
			 for(int i = 0; i < sArray.length; i++) {
				 if(sArray[i].equalsIgnoreCase(sArray[i+1])) {
					 valid = true;
				 } else {
					 valid = false;
				 }
			 }
			 
			 
		 } else {	 
			 valid = false;
		 } 
		 return valid;
		 
		
		 
		 
	    }
	 
	 public static void main(String[] args) {
		 
		 String s = "{}";
		
		 System.out.println(isValid(s));
	 }

}
