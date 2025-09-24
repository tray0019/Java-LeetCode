package HackerRank;

import java.util.Scanner;
/*
 * Solve - Easy
 */
public class IfElseHackerRamk {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
        int N = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N%2 == 1){
            System.out.println("Weird");
        }else if(N > 20){
            System.out.println("Not Weird");
        }else if(N > 6){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }

        sc.close();
    }
	
}
