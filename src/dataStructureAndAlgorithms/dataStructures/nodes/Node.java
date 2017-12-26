package dataStructureAndAlgorithms.dataStructures.nodes;

/**
 * @author codeWarrior
 * Node Class for Linked Data Structures
 * @param <T> generic type
 */

public class Node<T> {
	
	//Member variables
	private T element;
	
	
	/**
	 * Constructor to create an empty node 
	 */
	public Node() {
		element = null;
	}
	
	/**
	 * Constructor to create node with given element
	 * @param element element to be stored
	 */
	public Node(T element) {
		this.element = element;
	}
	
	/**
	 * Returns the element stored in this node
	 * @return T element stored at this node
	 */
	public T getElement() {
		return element;
	}
	
	/**
	 * Sets element stored in this node
	 * @param element to be stored at this node
	 */
	public void setElement(T element) {
		this.element = element;
	}
}
