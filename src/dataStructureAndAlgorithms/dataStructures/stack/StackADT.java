package dataStructureAndAlgorithms.dataStructures.stack;

import java.util.EmptyStackException;

/**
 * @author codeWarrior
 * StackADT
 */
public interface StackADT<T> {

	/**
	 * Add one element on top of the stack
	 * @param element element to be pushed onto stack
	 */
	public void push(T element);
	
	/**
	 * Removes and returns the top element from the this stack
	 * @return T element removed from top of stack 
	 */
	public T pop() throws EmptyStackException;
	
	/**
	 * Returns without removing the top element of this stack
	 * @return T element on top of the stack
	 */
	public T peek();
	
	/**
	 * Returns true if the stack contains no elements
	 * @return boolean value of whether stack is empty
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the number of elements in stack
	 * @return int number of elements in stack
	 */
	public int size();
	
	/**
	 * Returns string representation of stack
	 * @return String representation of stack
	 */
	public String toString();
}
