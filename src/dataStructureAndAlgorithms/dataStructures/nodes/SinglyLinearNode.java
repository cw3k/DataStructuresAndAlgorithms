package dataStructureAndAlgorithms.dataStructures.nodes;

/**
 * @author codeWarrior
 * Linear Node Class for LinkedList
 * @param <T> generic type
 */

public class SinglyLinearNode<T> extends Node<T> {
	
	//Member variables
	private SinglyLinearNode<T> next;
	
	
	/**
	 * Constructor to create an empty node 
	 */
	public SinglyLinearNode() {
		next = null;
		super.setElement(null);
	}
	
	/**
	 * Constructor to create node with given element
	 * @param element element to be stored
	 */
	public SinglyLinearNode(T element) {
		next = null;
		super.setElement(element);
	}
	
	/**
	 * Returns the node that follows this one
	 * @return reference to next node
	 */
	public SinglyLinearNode<T> getNext() {
		return next;
	}
	
	/**
	 * Returns the node that follows this one
	 * @return reference to next node
	 */
	public void setNext(SinglyLinearNode<T> nextNode) {
		next = nextNode;
	}
	
	/**
	 * Returns the element stored in this node
	 * @return T element stored at this node
	 */
	public T getElement() {
		return super.getElement();
	}
	
	/**
	 * Sets element stored in this node
	 * @param element to be stored at this node
	 */
	public void setElement(T element) {
		super.setElement(element);
	}
}
