package Algorithm;

import java.util.LinkedList;

public class LinkedListsDataStructure{

	public static void main(String[] args) {
		
		/*
		 * Best for adding and deleting elements
		 */
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		
		System.out.println("F to A");
		System.out.println(linkedList);
		
		linkedList.pop();
		System.out.println(linkedList+"\n");
		
		
		LinkedList<String> linkedListOffer = new LinkedList<>();
		/*
		 * A to F
		 */
		linkedListOffer.offer("A");
		linkedListOffer.offer("B");
		linkedListOffer.offer("C");
		linkedListOffer.offer("D");
		linkedListOffer.offer("F");
		System.out.println("A to F");
		System.out.println(linkedListOffer);
		
		linkedListOffer.poll();
		System.out.println(linkedListOffer+"\n");
		
		linkedListOffer.add(4, "E");
		System.out.println(linkedListOffer);
		linkedListOffer.remove("E");
		System.out.println(linkedListOffer);
		
		System.out.println(linkedListOffer.indexOf("F"));
		System.out.println(linkedListOffer.peekFirst());
		System.out.println(linkedListOffer.peekLast());
		
		linkedListOffer.addFirst("0");
		linkedListOffer.addLast("Z");
		System.out.println(linkedListOffer);
		
		String first = linkedListOffer.removeFirst();
		String last = linkedListOffer.removeLast();
		System.out.println(first+" and "+last);
		System.out.println(linkedListOffer);
	}
}
