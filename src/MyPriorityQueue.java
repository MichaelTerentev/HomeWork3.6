import java.util.List;

public class MyQueue<E> {
	Comparator<E> com;
	private List<E> elements;
	
	public MyQueue(Comparator<E> com) {
		this.elements = new LinkedList<>();
		this.com = com;
	}
	private void sorted() {
		for(int i = 0; i < elements.size(); i++) {
			for(int j = 0; j < elements.size(); j++) {
				if(com.compare(elements.get(i), elements.get(j)) > 0) {
					E temp = elements.get(i);
					elements.set(i, elements.get(j));
					elements.set(j, temp);
				}
			}
		}
	}
	public void enqueue(E element) {
		if(size() > 1) {
			elements.add(element);
		}
		else {
			elements.add(element);
			sorted();
		}
	}
	public void dequeue() {
		if(elements.size() > 0) {
			elements.remove(0);
			sorted();
		}
	}
	public E get(int index) {
		return elements.get(index);
	}
	public int size() {
		return elements.size();
	}
}
