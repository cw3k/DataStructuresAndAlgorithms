package dataStructureAndAlgorithms.dataStructures.dynamicArray;

import java.util.Iterator;

/**Implementation of dynamic array
 * @author codeWarrior
 */

// To suppress excessive warnings about generics... Why does Java have these warnings? Should they be addressed? 
@ SuppressWarnings("unchecked")

public class DynamicArray<T> implements DynamicArrayADT<T> {
	private T[] array; 
	private int len; //length of the array to user 
	private static int DEFAULT_CAPACITY = 16;
	private int capacity; // actual capacity of the array
	
	public DynamicArray() { array = (T[]) new Object[DEFAULT_CAPACITY]; } // default constructor intializes array to size of DEFAULT_CAPACITY
	
	// Constructor that intializes array with provided capacity
	public DynamicArray(int capacity) {
		if(capacity < 0 ) throw new IllegalArgumentException("Illegal capacity " + capacity);
		this.capacity = capacity;
		array = (T[]) new Object[capacity];
	}
	
	@Override
	public boolean isEmpty() {
		return getSize() == 0;
	}
	
	@Override
	public int getSize() {
		return len;
	}

	@Override
	public void insert(T element, int index) {
		if(index >= len) {
			throw new IndexOutOfBoundsException();
		}
		
		checkCapacity(this.array);
		
		for(int i = this.len; i > index; i--) {
			this.array[i] = this.array[i -1]; 
		}
		
		this.array[index] = element;
		this.len++;
	}

	@Override
	public void append(T element) {
		checkCapacity(this.array);
		this.array[this.len] = element;
		this.len++;
	}

	@Override
	public void delete(int index) {
		if(this.len == 0) {
			throw new NullPointerException();
		} if (this.len < index || index < 0) {
			throw new IndexOutOfBoundsException();
		} else  {
			if(len == 1) {
				this.array[0] = null;
			} else {				
				for (int i = index; i < this.len; i++) {
					this.array[i] = this.array[i+1];
				}
			}
			this.len--;
		}
	} 
	
	@Override
	public T access(int index) {
		// TODO: throw appropriate exceptions
		if(index < len) { return array[index];} 
		else { return null;}	
	}
	
	@Override
	public void setValue(int index, T element) {
		// TODO: add appropriate exceptions and bounds checks
		this.array[index] = element;
	}
	
	@Override
	public void clear() {
		for(int i = 0; i < this.len; i ++) {
			this.array[i] = null;
		}
		this.len = 0;
	}

	@Override
	public int search(T element) {
		// TODO: throw appropriate exceptions
		for(int i = 0; i < len; i++) {
			if(array[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	private void checkCapacity(T[] inputArray) {
		if((this.len + 1) < this.capacity) {
			this.capacity = 2 * this.capacity;
			T[] arrayNew = (T[]) new Object[this.capacity];
			
			for (int i = 0; i < this.array.length; i++) {
				arrayNew[i] = this.array[i];
			}
			this.array = arrayNew;
		}
	}
	
	@Override
	public String toString() {
		Iterator<T> arrayIter = new ArrayIterator<>(array, len);
		StringBuilder arrayString = new StringBuilder();
		
		if(this.len == 0) {return("Empty");}
		else {
			while(arrayIter.hasNext()) arrayString.append(arrayIter.next() + ", ");
		}
		
		arrayString.setCharAt(arrayString.length() - 2, ' '); // remove the trailing comma
		return arrayString.toString();
	}
}
