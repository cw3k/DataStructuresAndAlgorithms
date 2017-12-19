package dataStructureAndAlgorithms.dataStructures.queue;

import java.util.EmptyStackException;
import java.util.Iterator;

//TODO fix empty stack collection or import from book
//import dataStructureAndAlgorithms.dataStructures.customs.EmptyCollectionException;
import dataStructureAndAlgorithms.dataStructures.linearNode.LinearNode;
import dataStructureAndAlgorithms.dataStructures.linearNode.LinkedIterator;

public class LinkedQueue<T> implements QueueADT<T> {

	private LinearNode<T> head, tail;
	private int count;
	
	public LinkedQueue() {
		head = null;
		tail = null;
		count = 0;
	}
	
	public LinkedQueue(LinearNode<T> startNode) {
		head = startNode;
		tail = null;
		count = 1;
	}
	
	@Override
	public void enqueue(T element) {
		LinearNode<T> node = new LinearNode<>(element);
		if(isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
		}
		tail = node;
		count++;
	}

	@Override
	public T dequeue() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		} else {
			T returnElement = head.getElement();
			if(count == 1) {
				head = null;
				tail = null;
			} else {
				head = head.getNext();
			}
			count--;
			return returnElement;
		}
	}

	@Override
	public T first(){
		if(isEmpty()) { return null; }
		else { return head.getElement();}
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
		if(isEmpty()) {
			return "Empty";
		} else {
			Iterator<T> linkedIter = new LinkedIterator<>(head, size());
			StringBuilder linkedString = new StringBuilder();
			
			while(linkedIter.hasNext()) linkedString.append(linkedIter.next() + ", ");
			
			linkedString.setCharAt(linkedString.length() - 2, ' '); // remove the trailing comma
			return linkedString.toString();
		}
	}

}