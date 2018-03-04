package dataStructureAndAlgorithms.dataStructures.nodes;

/**
 * @author codeWarrior
 * Double Linear Node Class for LinkedList
 * @param <T> generic type
 */

public class DoublyLinearNode<T> extends Node<T> {
	
	//Member variables
	private DoublyLinearNode<T> next;
	private DoublyLinearNode<T> previous;
	
	/**
	 * Constructor to create an empty node 
	 */
	public DoublyLinearNode() {
		this.previous = null;
		super.setElement(null);
		this.next = null;
	}
	
	/**
	 * Constructor to create node with given element
	 * @param element element to be stored
	 */
	public DoublyLinearNode(T element) {
		this.previous = null;
		super.setElement(element);
		this.next = null;
	}
	
	/**
	 * Returns the node that precedes this one
	 * @return reference to next node
	 */
	public DoublyLinearNode<T> getPrevious() {
		return this.previous;
	}
	
	/**
	 * Sets the node that follows this one
	 * @param node to set the previous
	 * @return reference to next node
	 */
	public void setPrevious(DoublyLinearNode<T> previousNode) {
		this.previous = previousNode;
	}
	
	/**
	 * Returns the node that follows this one
	 * @return reference to next node
	 */
	public DoublyLinearNode<T> getNext() {
		return this.next;
	}
	
	/**
	 * Sets the node that follows this one to provided element
	 * @param node to set the next
	 * @return reference to next node
	 */
	public void setNext(DoublyLinearNode<T> nextNode) {
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
