package Algorithm;

import java.util.Stack;

public class StackDataStructure {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.empty());
		
		stack.push("Sherlock Holmes");
		stack.push("L");
		stack.push("Near");
		stack.push("Conan");
		stack.push("Light");
		
		System.out.println(stack);
		String det = stack.pop(); //delete from stack and store in det variable
		
		System.out.println(stack);
		System.out.println(det);
		
		System.out.println(stack.peek()); //check the top of the stack
		System.out.println(stack.search("L")); //Check index
		
		for(int i = 0;i < 1000000000; i++) {
			stack.push("L");
		}
		
		/*
		 * Use of stack 
		 * Redo and Undo example
		 */
		
	}

}
