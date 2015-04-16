package lab4;

public class MyLinkedListRunner {
	public static void main(String[] args) {
		MyLinkedList llist = new MyLinkedList();
		System.out.println("Initial List size");
		System.out.println(llist.size);
		
//		System.out.println(llist.getFirst()); - trying to get element from empty list
		for (int i=10; i<20; i++) {
			llist.add((Integer)i); }
		
		llist.print();
        llist.addFirst(4); // adding first "4"
    	llist.print(); 
		llist.add(10); //adding at last position "10"
		llist.set(0, 15); // changing element with index 0 with "15" value
		llist.print();
		llist.removeFirst(); // removing first element
		llist.removeLast();  // removing last element
		llist.print();
		llist.remove(3);// removing element on '3' position
		System.out.println(llist.remove(2));	// removing element on '2' position	
		llist.print();
		
		System.out.println(llist.indexOf(16)); //finding position with '16' value.
		System.out.println(llist.indexOf(136)); //finding position with '136' value.
		System.out.println(llist.getLast());
		
	}
}
