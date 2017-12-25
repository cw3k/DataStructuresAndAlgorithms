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
		System.out.println("Before Enque:");
		System.out.println("Size of Array: " + queueArray.getSize());
		System.out.println("Size of Queue: " + count);
		System.out.println("Head Pointer: " + headPoint);
		System.out.println("Tail Pointer: " + tailPoint);
		System.out.println("Head: " + first());
		System.out.println("Tail: " + last());
		System.out.println("IsEmpty?: " + isEmpty());
		//System.out.println("Condition: " + ((headPoint == 0) && (!isEmpty())));
		if(isEmpty()) {
			headPoint = tailPoint = 0;
			queueArray.insert(element, tailPoint);
		} else if(tailPoint == count) {
			tailPoint = (headPoint % count -1);
			queueArray.setValue(tailPoint, element);
		} else {
			if(count < queueArray.getSize()) {
				queueArray.setValue(tailPoint + 1, element);
				tailPoint++;
			} else {
				queueArray.insert(element, tailPoint + 1);
				tailPoint++;
			}
		}
		
		// (headPoint == 0 && !isEmpty()) || (headPoint < tailPoint && tailPoint <= queueArray.getSize())
		count++;
		System.out.println("\nAfter Enque:");
		System.out.println("Size of Array: " + queueArray.getSize());
		System.out.println("Size of Queue: " + count);
		System.out.println("Head Pointer: " + headPoint);
		System.out.println("Tail Pointer: " + tailPoint);
		System.out.println("Head: " + first());
		System.out.println("Tail: " + last());
		System.out.println("IsEmpty?: " + isEmpty());
		//System.out.println("Condition: " + ((headPoint == 0) && (!isEmpty())));
		
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

	// Testing purposes
	public T last() {
		if (isEmpty()) {
			return null;
		} else {
			return queueArray.access(tailPoint);
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
