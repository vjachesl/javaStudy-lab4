package lab4;

import lab4.MyLinkedList.Node;


public class MyQueueRunner  {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
	for (int i=0;i<10;i++){
		Node node = queue.new Node(i);
		System.out.println(node.getElement());
		queue.offer(node);
	}
	System.out.println(queue.peek());
	System.out.println(queue);
	System.out.println(queue.pull());
	System.out.println(queue.pull());
	System.out.println(queue.pull());
	System.out.println(queue.pull());
	System.out.println(queue.pull());
	System.out.println(queue.pull());
	System.out.println(queue.pull());
	System.out.println(queue.pull());
	System.out.println(queue.pull());
	System.out.println(queue.pull());
	System.out.println(queue.pull());
	System.out.println(queue.pull()); // trying to check absence element in queue.
	
	System.out.println(queue);
	}
}
