package week3_LinkedList_Stack_Queue;

public interface StackInterface<T> extends Iterable<T> {

	public void push(T element);

	public T pop();

	public boolean isEmpty();
	
	public int size();

}