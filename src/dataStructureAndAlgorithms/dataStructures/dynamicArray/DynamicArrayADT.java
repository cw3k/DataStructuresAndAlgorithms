package dataStructureAndAlgorithms.dataStructures.dynamicArray;

/**Defines the interface to a dynamic array data structure
 * @author codeWarrior
 * @param <T> Generic data type to array
 */
public interface DynamicArrayADT<T> {
	
	/**
	 * @return boolean if the array is empty
	 */
	public boolean isEmpty();
	
	/**Return the length of the array from user interface
	 * @return int length of array (not capacity)
	 */
	public int getSize();
	
	/**Inserts one element to specified position
	 * @param element
	 */
	public void insert (T element, int index) throws IndexOutOfBoundsException;
	
	/**Append element at last index
	 * @param element
	 */
	public void append (T element);
	
	/**Delete element at specified index
	 * @param index
	 */
	public void delete (int index) throws NullPointerException, IndexOutOfBoundsException;
	
	/**Access element at specified index
	 * @param index
	 * @return element
	 */
	public T access (int index);
	
	// TODO: add contains method that returns boolean of whether element is contained 
	
	/**Set the value of element at specified index
	 * @param index
	 * @return element
	 */
	public void setValue (int index, T element);
	
	/**Clear array
	 */
	public void clear();
	
	/**Searches dynamicArray for element
	 * @param element target
	 * @return int the index of element searched for or -1 if not found
	 */
	public int search (T element);
	
	/**Returns a string representation of the dynamicArray
	 * @return String representation of the dynamicArray
	 */
	public String toString();
	
}