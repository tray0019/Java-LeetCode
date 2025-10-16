package HackerRank;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        String A="maam";
	        /* Enter your code here. Print output to STDOUT. */
	        int left = 0;
	        int right = A.length()-1;
	        if(A.length() <= 1) {
	        		System.out.println("No");
	                 
	        	}
	        
	        while(left < right){
	        	
	        	
	        	
	             if(A.charAt(left) != A.charAt(right) || A.length() <= 1){
	                 System.out.println("No");
	                 break;
	             }else{
	                 left++;
	                 right--;
	                 if(left >= right){
	                     System.out.println("Yes");
	                 }
	                 
	             }
	        }
	}

}
