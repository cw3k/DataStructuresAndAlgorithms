package dataStructureAndAlgorithms.dataStructures.queue;

import java.util.EmptyStackException;

public interface QueueADT<T> {
	
	/**
	 * Adds element to the rear of the queue
	 * 
	 * @param element the element to be added to rear of queue
	 */
	public void enqueue(T element);
	
	public T dequeue() throws EmptyStackException;
	
	public T first();
	
	public boolean isEmpty();
	
	public int size();
	
	public String toString();
	
}
