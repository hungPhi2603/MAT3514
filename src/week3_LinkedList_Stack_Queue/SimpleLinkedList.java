package week3_LinkedList_Stack_Queue;
import java.util.Iterator;
@SuppressWarnings({"unchecked", "deprecation"})
public class SimpleLinkedList<T> implements ListInterface<T> {
	class Node {
		T data;
		Node next;
	}
	private Node top = null;
	private Node bot = null;
	
	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (top == null) {
			top = node;
			bot = node;
		}
		else {
			bot.next = node;
			bot = node;
		}
	}
	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		Node node = top;
		int j = 0;
		while (j!=i) {
			node = node.next;
			j++;
		}
		
		return node.data;
	}
	@Override
	public void set(int i, T data) {
		// TODO Auto-generated method stub
		Node node = top;
		int j = 0;
		while (j!=i) {
			node = node.next;
			j++;
		}
		node.data = data;
	}
	@Override
	public void remove(int i) {
		// TODO Auto-generated method stub
		if (i==0) {
			top = top.next; 
		}
		Node node = top;
		Node pre = new Node();
		int j = 0;
		while (j!=i) {
			pre = node;
			node = node.next;
			j++;
		}
		Node next = node.next;
		pre.next = next;
		node = pre;
	}
	@Override
	public boolean isContain(T data) {
		// TODO Auto-generated method stub
		return indexOf(data) != -1;
	}
	@Override
	public int indexOf(T data) {
		// TODO Auto-generated method stubNode  p = top;
		Node node = top;
		int i = 0;
		while (node != null) {
			if (node.data.equals(data))
				return i;
			i++;
			node = node.next;
		}
		return -1;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		Node node = top;
		int n=0;
		while (node != null) {
			n++;
			node = node.next;
		}
		return n;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == null;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new LinkedListIterator();
	}
	
	class LinkedListIterator implements Iterator<T>{
	
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
		
			return null;
		}
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Node node = top;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

}