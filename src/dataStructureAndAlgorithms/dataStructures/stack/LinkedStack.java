package dataStructureAndAlgorithms.dataStructures.stack;

import java.util.EmptyStackException;
import java.util.Iterator;

import dataStructureAndAlgorithms.dataStructures.nodes.SinglyLinearNode;
import dataStructureAndAlgorithms.dataStructures.nodes.LinkedIterator;

public class LinkedStack<T> implements StackADT<T> {
	
	private SinglyLinearNode<T> top;
	private int count;
	
	public LinkedStack() {
		top = null;
		count = 0;
	}
	
	public LinkedStack(SinglyLinearNode<T> newNode) {
		top = newNode;
		count++;
	}
	
	@Override
	public void push(T element) {
		SinglyLinearNode<T> nodeToAdd = new SinglyLinearNode<>(element);
		
		nodeToAdd.setNext(top);
		top = nodeToAdd;
		count++;
		
	}

	@Override
	public T pop() throws EmptyStackException {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		} else {
			SinglyLinearNode<T> returnNode = top;
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
