package Algorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDataStructure {

	public static void main(String[] args) {
		
		Queue<Double> queue = new LinkedList<>();
		
		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);
		
		while(!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("PriorityQueue: ");
		Queue<Double> pQueue = new PriorityQueue<>(Collections.reverseOrder());
		
		pQueue.offer(3.0);
		pQueue.offer(2.5);
		pQueue.offer(4.0);
		pQueue.offer(1.5);
		pQueue.offer(2.0);
		
		while(!pQueue.isEmpty()) {
			System.out.print(pQueue.poll() + " ");
		}
		
		
		Queue<String> pStringQueue = new PriorityQueue<>(Collections.reverseOrder());
		System.out.println("\n");
		System.out.println("String PriorityQueue");
		pStringQueue.offer("B");
		pStringQueue.offer("C");
		pStringQueue.offer("A");
		pStringQueue.offer("F");
		pStringQueue.offer("D");
		
		while(!pStringQueue.isEmpty()) {
			System.out.print(pStringQueue.poll() + " ");
		
		}
		
	}
}
