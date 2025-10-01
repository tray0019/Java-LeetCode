package HackerRank;

import java.util.Scanner;

/*
 * Its asking for static but still sovle
 */
public class JavaStaticInitializerBlock {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        int B = sc.nextInt();
	        int H = sc.nextInt();
	        
	        if(B>0&&H>0){
	        	int result = B*H;
	            System.out.println(result);
	        }else{
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	        }
	}

}
