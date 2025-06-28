package Experimental;
import java.util.Random;
import java.util.Scanner;
public class forLoopExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int[] test = new int[ran.nextInt(4)+2];
		int sum = 0;
		int[] last = new int[test.length];
		int i;
		for(i = 0; i<test.length;i++) {
			
			test[i] = sc.nextInt();
			
			sum = test[i] + sum;
			last[i] = sum;
			
			
			System.out.print(last[i]+" ");
		}
		
		

	}

}
