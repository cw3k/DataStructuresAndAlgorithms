package dataStructureAndAlgorithms.dataStructures.orderedList;

import java.util.Iterator;

public interface listADT<T> extends Iterable<T> {
	
	public void removeFirst();
	
	public void removeLast();
	
	public void remove(T object);
	
	public T first();
	
	public T last();
	
	public boolean isEmpty();
	
	public int size();
	
	public Iterator iterator();
	
	public String toString();

}
