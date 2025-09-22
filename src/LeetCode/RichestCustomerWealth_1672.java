package LeetCode;

public class RichestCustomerWealth_1672 {
	
	public static int maximumWealth(int[][] accounts) {
		
		int maxHealth = 0;
		
		for(int row = 0; row < accounts.length; row++) {
			
			int currentHealth = 0;
				for(int col = 0; col < accounts[row].length; col++) {
					
					currentHealth = currentHealth + accounts[row][col];
					
				}
				
				maxHealth = Math.max(maxHealth, currentHealth);
			
		}
		
		return maxHealth;
	}
	public static void main(String[] args) {
		
		int[][] myNumbers = {{7,8},
							 {3,4},
							 {9,7}
		};
		
		
		System.out.println(maximumWealth(myNumbers));
		
		
	}
	
	

}
