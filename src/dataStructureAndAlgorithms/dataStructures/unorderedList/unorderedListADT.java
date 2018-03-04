package dataStructureAndAlgorithms.dataStructures.unorderedList;

import dataStructureAndAlgorithms.dataStructures.orderedList.listADT;

public interface unorderedListADT<T> extends listADT<T> {
	public void addToFront();
	
	public void addToRear();
	
	public void addAfter(T element, T object);
}
