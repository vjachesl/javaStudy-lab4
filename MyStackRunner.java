package lab4;

import lab4.MyLinkedList.Node;

public class MyStackRunner {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
	for (int i=0;i<10;i++){
		Node node = stack.new Node(i);
		stack.push(node);
	}
	System.out.println(stack);
	System.out.println(stack.pop());
	System.out.println(stack);
	stack.push(stack.new Node(99));
	System.out.println(stack);	
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop()); // trying to get 11-th element from stack with 10 elements....
	
	System.out.println(stack);
	}
}
