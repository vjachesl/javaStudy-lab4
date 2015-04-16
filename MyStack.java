package lab4;
//3. На основе связанного списка используя композицию реализовать класс MyStack - стек с набором
//следующих методов
//push(Element e) - поместить элемент в стек
//Element pop() - взять элемент из стека
public class MyStack extends MyLinkedList{
	private MyLinkedList stack;
	
	// Constructor
	public MyStack(){
		stack = new MyLinkedList();
	}
	// adding element to Stack
	public void push(Node e){
		stack.add(e.getElement());
	}
	// removing element from Stack
	public Node pop(){
		Node toReturn = stack.new Node(stack.getLast());
		stack.removeLast();
		return toReturn;
	}
	
	// additional method for printing
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		for (int i=0; i<stack.size; i++){
		str.append("["+stack.get(i)+"] ");
	 }
		return str.toString();
		}
	
}
