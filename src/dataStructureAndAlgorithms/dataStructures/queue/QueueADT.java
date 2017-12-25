package dataStructureAndAlgorithms.dataStructures.queue;

import java.util.EmptyStackException;

public interface QueueADT<T> {
	
	/**
	 * Adds element to the rear of the queue
	 * 
	 * @param element the element to be added to rear of queue
	 */
	public void enqueue(T element);
	
	/**
	 * Removes first element from queue, FIFO order
	 * 
	 * @return T element returned front of queue
	 * 
	 * @throws EmptyStackException if queue is empty
	 */
	public T dequeue() throws EmptyStackException;
	
	/**
	 * Returns without removing the first element on the list
	 * 
	 * @return T first element in queue
	 */
	public T first();
	
	/**
	 * Returns true if size of queue is 0
	 * 
	 * @return boolean value of true if the queue is empty
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the size of queue
	 * 
	 * @return int value for size of queue
	 */
	public int size();
	
	/**
	 * String representation of queue
	 * 
	 * @return String representation of queue
	 */
	public String toString();
	
}
