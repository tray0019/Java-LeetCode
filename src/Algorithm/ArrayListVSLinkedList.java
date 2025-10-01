package Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>(); 
		ArrayList<Integer> arrayList = new ArrayList<>(); 
		
		long startTime;
		long endTime;
		long elapseTime;
		
		for(int i=0; i<1000000; i++) {
			linkedList.add(i);
			arrayList.add(i);
		}
		
		startTime = System.nanoTime();
		
		linkedList.get(0);
		
		endTime = System.nanoTime();
		
		elapseTime = endTime - startTime;
		
		System.out.println("LinkedList:\t "+elapseTime+" ns");
	}

}
