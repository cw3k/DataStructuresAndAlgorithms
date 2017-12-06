/**
* ArrayIterator represents an iterator over the elements of an array.
* @author Winsotn Bowen
*/

package dataStructureAndAlgorithms.dataStructures.dynamicArray;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {

	private int count; // number of elements in the collection
	private int current; // the current position in the iterator
	private T[] items;

	/**
	 * Sets up this iterator using the specified items.
	 * 
	 * @param collection
	 *            the collection to create the iterator for
	 * @param size
	 *            the size of the collection
	 */
	public ArrayIterator(T[] collection, int size) {
		items = collection;
		count = size;
		current = 0;
	}

	/**
	 * Returns true if this iterator has at least one more element to deliver in
	 * the iteration.
	 *
	 * @return true if this iterator has at least one more element to deliver in
	 *         the iteration
	 */
	@Override
	public boolean hasNext() {
		return (current < count);
	}

	/**
	 * Returns the next element in the iteration. If there are no more elements
	 * in this iteration, a NoSuchElementException is thrown.
	 *
	 * @return the next element in the iteration
	 * @throws NoSuchElementException
	 *             if an element not found exception occurs
	 */
	@Override
	public T next() {
		if (!hasNext())
			throw new NoSuchElementException();
		current++;
		return items[current - 1];
	}

	/**
	 * The remove operation is not supported in this collection.
	 *
	 * @throws UnsupportedOperationException
	 *             if an unsupported operation exception occurs
	 */
	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
}
