package HackerRank;

import java.util.Scanner;

public class JavaIntToString {

	public static void main(String[] args) {
		


		  try {
		   Scanner in = new Scanner(System.in);
		   int n = in .nextInt();
		   in.close();
		   //String s=???; Complete this line below
		    String s = Integer.toString(n);
		   //Write your code her

		   
		   if (n == Integer.parseInt(s)) {
		    System.out.println("Good job");
		   } else {
		    System.out.println("Wrong answer.");
		   }
		  } catch (Exception e) {
		   System.out.println("Unsuccessful Termination!!");
		  }
		
	}
	

}


