package HackerRank;

public class JavaAnagrams {

	public static void main(String[] args) {
		
		isAnagram("ana", "naa");

	}
	
	 public static boolean isAnagram(String a, String b) {
	        // Complete the function
	        boolean statement = true;
	        int temp;
	        
	        if(a.length() == b.length()){
	            for(int i = 0; i < a.length(); i++) {
	            	for(int j = 0; j < a.length(); j++) {
	            		if(a.charAt(i)==b.charAt(j)) {
	            			
	            		}
	            	}
	            }
	        }else{
	            statement = false;
	        }
	        return statement;
	    }

}
