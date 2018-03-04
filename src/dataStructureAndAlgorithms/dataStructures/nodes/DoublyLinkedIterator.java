package dataStructureAndAlgorithms.dataStructures.nodes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedIterator<T> implements Iterator<T> {
	private int count; // the number of elements in the collection
	private DoublyLinearNode<T> current; // the current position

	/**
	 * Sets up this iterator using the specified items.
	 *
	 * @param collection the collection the iterator will move over
	 * @param size the integer size of the collection
	 */
	public DoublyLinkedIterator(DoublyLinearNode<T> collection, int size) {
		current = collection;
		count = size;
	}

	/**
	 * Returns true if this iterator has at least one more element to deliver in
	 * the iteration.
	 *
	 * @return true if this iterator has a least one more element to deliver in
	 *         the iteration
	 */
	public boolean hasNext() {
		return (current != null);
	}
	
	/**
	 * Returns true if this iterator has at least one more element preceding current node to deliver in
	 * the iteration.
	 *
	 * @return true if this iterator has a least one more element to deliver in
	 *         the iteration
	 */
	public boolean hasPrevious() {
		return (current.getPrevious() != null);
	}

	/**
	 * Returns the next element in the iteration. If there are no more elements
	 * in this iteration, a NoSuchElementException is thrown.
	 *
	 * @return the next element in the iteration
	 * @throws NoSuchElementException if a no such element exception occurs
	 */
	public T next() {
		if (!hasNext()) throw new NoSuchElementException();
		T result = current.getElement();
		current = current.getNext();
		return result;
	}
	
	/**
	 * Returns the next element in the iteration. If there are no more elements
	 * in this iteration, a NoSuchElementException is thrown.
	 *
	 * @return the next element in the iteration
	 * @throws NoSuchElementException if a no such element exception occurs
	 */
	public T previous() {
		if (!hasPrevious()) throw new NoSuchElementException();
		T result = current.getElement();
		current = current.getPrevious();
		return result;
	}

	/**
	 * The remove operation is not supported.
	 *
	 * @throws UnsupportedOperationException if an unsupported operation exception occurs
	 */
	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
}
