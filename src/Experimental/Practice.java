package Experimental;

import java.util.Scanner;

public class Practice {

	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("[\*-*/]");
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= 2; j++){
                System.out.print("\\*");
            }
            System.out.print("-");
        }
    }

}
