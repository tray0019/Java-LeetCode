package Algorithm;

import java.util.ArrayList;

public class ArrayStructures {
	
	//Array with 50 data
	private int[] theArray = new int[50];
	//Array size of 10
	private int arraySize = 10;
	
	//A method to generate number of array fro 10 to 19
	public void generateRandomArray() {
		for(int i = 0; i < arraySize; i++) {
			theArray[i] = (int)(Math.random()*10)+10;
			
		}
	}
	
	public void printArray() {
		
			System.out.println("---------");
			for(int i = 0; i < arraySize; i++ ) {
			System.out.println("| "+i+" | "+theArray[i]+" |");
			System.out.println("---------");
		}
	}
	
	/*
	 * Get value by index
	 */
	public int getValueAtIndex(int index) {
		
		if(index < arraySize) {
			return theArray[index];
		} return 0;
		
	}
	
	public boolean doesArrayContainValue(int searchValue) {
		
		boolean valueInArray = false;
		for(int i = 0; i < arraySize;i++) {
			if(searchValue == theArray[i]) {
				return true;
			}	
		}
		return valueInArray;	
	}
	
	public void deleteIndex(int index) {
		if(index < arraySize) {
			for(int i = index; i < (arraySize - 1); i++) {
				theArray[i] = theArray[i+1];
			}
			
			arraySize--;
		}
	}
	
	public void inserValue(int value) {
		
		if(arraySize < 50) {
			theArray[arraySize] = value;
			arraySize++;
		}
		
	}
	
	/*
	 * Search if a value is within the array index
	 */
	public String linearSearchForValue(int value) {
		boolean valueInArray = false;
		String indexWithValue ="";
		
		System.out.println("The value was found in the Following:");
		
		for(int i = 0; i < arraySize; i++) {
			if(theArray[i] == value) {
				valueInArray = true;
				System.out.println(i+" ");
				//indexWithValue = indexWithValue+i+ " ";
			}
		}
		if(!valueInArray) {
			indexWithValue = "None";
			System.out.print(indexWithValue);
		}
		System.out.println();
		return indexWithValue;
	}
	
	
	public static void main(String[] args) {
		
		ArrayStructures newArray = new ArrayStructures();
		
		newArray.generateRandomArray();
		newArray.printArray();
		System.out.println("Index: 5 is "+newArray.getValueAtIndex(5));
		System.out.println("Does it have value? "+newArray.doesArrayContainValue(15));
		newArray.deleteIndex(5);
		newArray.printArray();
		newArray.inserValue(500);
		newArray.inserValue(501);
		newArray.inserValue(11);
		newArray.printArray();
		newArray.linearSearchForValue(11);
		
		
	}
}
