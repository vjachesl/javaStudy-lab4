package lab4;

//2. На основе связанного списка используя композицию реализовать класс MyQueue - очередь с
//набором следующих методов
//offer(Element e) - добавить в конец очереди
//Element peek() - взять без удаления, элемент из очереди
//Element poll() - взять и удалить элемент из очереди
public class MyQueue extends MyLinkedList  {
	private MyLinkedList queue;
	
	// Constructor
	public MyQueue (){
		queue = new MyLinkedList();
	}
	// adding element to Queue
	public void offer (Node e){
		queue.add(e.getElement());
	}
	// getting element from Queue without deleting	
	public Node peek(){
	return queue.getFirstNode();
	}
	// getting element from Queue with deleting	
	public Node pull(){
	return queue.removeFirstNode();
		
	}
	// additional method for printing
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		for (int i=0; i<queue.size; i++){
		str.append("["+queue.get(i)+"] ");
	 }
		return str.toString();
		}
	
}