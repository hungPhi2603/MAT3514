package week3_LinkedList_Stack_Queue;

import java.util.Iterator;

public class LinkedListStack<T> implements StackInterface<T> {

	class Node {
		T element;
		Node next;
	}

	Node stack = null;

	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		Node node= new Node();
		node.element= element;
		node.next = null;
		
		node.next= stack;
		stack= node;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		
		T data= stack.element;
		stack= stack.next;
		
		return data;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return  stack== null;
	}
	
	public void printStack() {
		// TODO Auto-generated method stub
		Node p= stack;
		while (p != null) {
			System.out.print(p.element+"->");
			p= p.next;
		}
		System.out.println("NULL");
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new StackIterator();
	}

	class StackIterator implements Iterator<T> {

		private Node currentNode = stack;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return currentNode != null;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			T data = currentNode.element;
			currentNode = currentNode.next;
			return data;
		}
		
	}
	
	public int size() {
		Node p= stack;
		int count= 0;
		while(p != null) {
			count++;
			p= p.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		/*LinkedListStack<String> ls= new LinkedListStack<>();
		ls.push("A");
		ls.push("B");
		ls.push("C");
		ls.push("D");
		ls.printStack();*/
		
		StackInterface<String> ls1= new LinkedListStack<>();
		ls1.push("A");
		ls1.push("B");
		ls1.push("C");
		ls1.push("D");
		
		for (String string : ls1) {
			System.out.println(string);
		}
		 
		String top= ls1.pop();
		ls1.pop();
		ls1.pop();
		///ls1.pop();
		System.out.println("Top element= "+ top);
		
		for (String string : ls1) {
			System.out.println(string);
		}
		
		System.out.println("so phan tu: "+ls1.size());
	}

}

