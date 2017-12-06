package dataStructureAndAlgorithms.dataStructures.stack;

import java.util.EmptyStackException;
import java.util.Iterator;

import dataStructureAndAlgorithms.dataStructures.linearNode.LinearNode;
import dataStructureAndAlgorithms.dataStructures.linearNode.LinkedIterator;

public class LinkedStack<T> implements StackADT<T> {
	
	private LinearNode<T> top;
	private int count;
	
	public LinkedStack() {
		top = null;
		count = 0;
	}
	
	public LinkedStack(LinearNode<T> newNode) {
		top = newNode;
		count++;
	}
	
	@Override
	public void push(T element) {
		LinearNode<T> nodeToAdd = new LinearNode<>(element);
		
		nodeToAdd.setNext(top);
		top = nodeToAdd;
		count++;
		
	}

	@Override
	public T pop() throws EmptyStackException {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		} else {
			LinearNode<T> returnNode = top;
			top = top.getNext();
			count--;
			return returnNode.getElement();
		}
	}

	@Override
	public T peek() {
		return top.getElement();
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int size() {
		return count;
	}
	
/*	public java.util.Iterator<T> iterator () {
		// TODO: build linked iterator and array iterator classes
		return new java.util.Iterator<T> () {
			int index = 0;
			public boolean hasNext() { return count > 0; }
			@ Override
			public T next() {return array[index++];}
		};
	}*/
	
	@Override
	public String toString() {
		if(isEmpty()) {
			return "Empty";
		} else {
			
			Iterator<T> linkedIter = new LinkedIterator<>(top, count);
			StringBuilder linkedString = new StringBuilder();
			
			if(this.count == 0) {return("Empty");}
			else {
				while(linkedIter.hasNext()) linkedString.append(linkedIter.next() + ", ");
			}
			
			linkedString.setCharAt(linkedString.length() - 2, ' '); // remove the trailing comma
			return linkedString.toString();
		}
	}
}
