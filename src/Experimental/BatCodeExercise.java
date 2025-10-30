package Experimental;

public class BatCodeExercise {

	public static void main(String[] args) {
		
		
		
		System.out.println(parrotTrouble(false,6));

	}

	private static boolean parrotTrouble(boolean talking, int hour) {
		
		if(talking = true && hour < 7 || hour > 20) {
			return true;
		}
		
		return false;
		
		
	}

}
