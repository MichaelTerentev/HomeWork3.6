import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		MyQueue<String> queue = new MyQueue<>(Comparator.comparing(String::length));
		queue.enqueue("long");
		queue.enqueue("the longest");
		queue.enqueue("longer");
		queue.dequeue();
		
		for(int i = 0; i < queue.size(); i++) {
			System.out.println(queue.get(i));
		}
	}
}
