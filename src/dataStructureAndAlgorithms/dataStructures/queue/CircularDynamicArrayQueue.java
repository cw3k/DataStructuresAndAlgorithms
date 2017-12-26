package dataStructureAndAlgorithms.dataStructures.queue;

import java.util.EmptyStackException;

import dataStructureAndAlgorithms.dataStructures.dynamicArray.DynamicArray;

public class CircularDynamicArrayQueue<T> implements QueueADT<T> {
	
	private DynamicArray<T> queueArray = new DynamicArray<>();
	private int headPoint, tailPoint, count;
	
	public CircularDynamicArrayQueue() {
		headPoint = tailPoint = count = 0;
	}
	
	public CircularDynamicArrayQueue(T startNode) {
		queueArray.append(startNode);
		headPoint = tailPoint = 0;
		count = 1;
	}
	
	
	@Override
	public void enqueue(T element) {
		if(isEmpty()) {
			headPoint = tailPoint = 0;
			queueArray.insert(element, tailPoint);
		} else if(tailPoint == count) {
			tailPoint = (headPoint % count -1);
			queueArray.setValue(tailPoint, element);
		} else {
			if(count < queueArray.getSize()) {
				queueArray.setValue(tailPoint + 1, element);
			} else {
				queueArray.insert(element, tailPoint + 1);
			}
			tailPoint++;
		}
		count++;		
	}

	@Override
	public T dequeue() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		} else {
			T returnElement = queueArray.access(headPoint);
			queueArray.setValue(headPoint, null);
			if((headPoint != 0) && ((headPoint + 1)% queueArray.getSize()) == 0) {
				headPoint = 0;
			} else {
				headPoint++;
			}
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
	
	//TODO: Considering modifying toString to omit printing null values
	@Override
	public String toString() {
		return queueArray.toString();
	}

}
