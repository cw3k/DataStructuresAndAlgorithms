package dataStructureAndAlgorithms.dataStructures.queue;

import java.util.EmptyStackException;

import dataStructureAndAlgorithms.dataStructures.dynamicArray.DynamicArray;

public class DynamicArrayQueue<T> implements QueueADT<T> {
	
	private DynamicArray<T> queueArray = new DynamicArray<>();
	private int headPoint, tailPoint, count;
	
	public DynamicArrayQueue() {
		headPoint = tailPoint = count = 0;
	}
	
	public DynamicArrayQueue(T startNode) {
		queueArray.append(startNode);
		headPoint = tailPoint = 0;
		count = 1;
	}
	
	
	@Override
	public void enqueue(T element) {
		queueArray.append(element);
		tailPoint++;
		count++;
	}

	@Override
	public T dequeue() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		} else {
			T returnElement = queueArray.access(headPoint);
			queueArray.delete(headPoint);
			//headPoint++;
			count--;
			return returnElement;
		}
	}

	@Override
	public T first() {
		if (isEmpty()) {
			return null;
		} else {
			return queueArray.access(headPoint);
		}
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int size() {
		return count;
	}
	
	@Override
	public String toString() {
		return queueArray.toString();
	}

}
