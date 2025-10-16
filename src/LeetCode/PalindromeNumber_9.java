package LeetCode;

public class PalindromeNumber_9 {

	public static void main(String[] args) {
		
		PalindromeNumber_9 pal = new PalindromeNumber_9();
		
		pal.isPalindrome(121);

	}

	
	public boolean isPalindrome(int x) {
        
		String pal = Integer.toString(x);
		System.out.println(pal);
        int left = 0;
        int right = pal.length()-1;
        System.out.println(right);
        boolean statement = false;
        
        while(left<right) {
        	System.out.println("pass while?");
        	System.out.println("left: "+pal.charAt(left)+" right: "+pal.charAt(right) );
        	if(pal.charAt(left) != pal.charAt(right)) {
        		
        		System.out.println("pass if?");
        		statement = false;
        		break;
        	}else {
        		System.out.println("pass else?");
        		left++;
        		right--;
        		
        		if(left == right) {
        			statement = true;
        			break;
        		}
        		System.out.println("pass??");
        		statement = true;
        		
        	}
        }
        System.out.println(statement);
		return statement;
        

    }
}
