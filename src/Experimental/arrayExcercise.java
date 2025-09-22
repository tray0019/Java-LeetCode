package Experimental;

public class arrayExcercise {

	public static void main(String[] args) {
		
		
		int[] test = {1,3,2,4,5,3,4};
		int sum = 0;
		boolean check = true;
		for(int i = 0; i<test.length;i++) {
			
			//System.out.println(test[i]);
			
			for(int j = 0; j < test.length; j++) {
				if(test[i] > test[j]) {
					sum = test[i];
				}
					
			}
			
			System.out.println(sum);
			//System.out.println(sum);
			
			
			
			
			
			

	}

}}
