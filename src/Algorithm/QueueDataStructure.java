package Algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDataStructure {

	public static void main(String[] args) {
		
		/*
		 * Queue: First in first out data stucture
		 * Ex: Line up in a fast food
		 */
		
		Queue<String> queue = new LinkedList<String>();
		
		System.out.println(queue.isEmpty());//check if queue is empty
		
		queue.offer("Conan");
		queue.offer("L");
		queue.offer("Light");
		queue.offer("Near");
		queue.offer("Sherlock");
		
		System.out.println(queue.size());//check queue size
		System.out.println(queue.contains("L"));//L in queue??
		
		System.out.println(queue);
		
		System.out.println(queue.peek());//check first 
		
		queue.poll();//dequeued first
		System.out.println(queue);
		
		queue.element();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		System.out.println(queue);

	}

}
