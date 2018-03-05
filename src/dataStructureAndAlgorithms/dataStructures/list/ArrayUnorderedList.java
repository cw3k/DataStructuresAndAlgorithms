package dataStructureAndAlgorithms.dataStructures.list;

import dataStructureAndAlgorithms.dataStructures.dynamicArray.DynamicArray;
import dataStructureAndAlgorithms.dataStructures.dynamicArray.DynamicArrayIterator;
import dataStructureAndAlgorithms.dataStructures.utilities.ElementNotFoundException;
import dataStructureAndAlgorithms.dataStructures.utilities.EmptyCollectionException;

import java.util.Iterator;

/**
 * Created by codeWarrior928 on 3/5/2018.
 */
public class ArrayUnorderedList<T> implements UnorderedListADT<T>, Iterable<T> {
    protected DynamicArray<T> list;
    String listName = "Unordered List";
    private int NOT_FOUND = -1;

    public ArrayUnorderedList() {
        this.list = new DynamicArray<T>();
    }

    @Override
    public void addToFront(T element) {
        list.insert(element, 0);
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new EmptyCollectionException(listName);
        }
        T returnElement = list.access(0);
        list.delete(0);
        return returnElement;
    }

    @Override
    public void addToRear(T element) {
        list.append(element);
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new EmptyCollectionException(listName);
        }
        T returnElement = list.access(list.getSize());
        list.delete(list.getSize());
        return returnElement;
    }

    @Override
    public T remove(T element) {
        //Exception if the list is empty
        if (isEmpty()) {
            throw new EmptyCollectionException(listName);
        }
        //Throw exception if the list does not contain the element
        if (list.search(element) == NOT_FOUND) {
            throw new ElementNotFoundException(listName);
        }

        int elementIndex = list.search(element);
        T returnElement = list.access(elementIndex);
        list.delete(elementIndex);

        return returnElement;
    }

    @Override
    public void addAfter(T target, T elementToAdd) {
        //Exception if the list is empty
        if (isEmpty()) {
            throw new EmptyCollectionException(listName);
        }
        //Throw exception if the list does not contain the target
        if (list.search(target) == NOT_FOUND) {
            throw new ElementNotFoundException(listName);
        }

        int elementIndex = list.search(target);
        list.insert(elementToAdd, elementIndex + 1);
    }

    @Override
    public T first() {
        //Exception if the list is empty
        if (isEmpty()) {
            throw new EmptyCollectionException(listName);
        }

        return list.access(0);
    }

    @Override
    public T last() {
        //Exception if the list is empty
        if (isEmpty()) {
            throw new EmptyCollectionException(listName);
        }

        return list.access(list.getSize());
    }

    @Override
    public boolean contains(T target) {
        return list.search(target) != NOT_FOUND;
    }

    @Override
    public boolean isEmpty() {
        return list.getSize() == 0;
    }

    @Override
    public int size() {
        return list.getSize();
    }

    @Override
    public Iterator iterator() {
        return new DynamicArrayIterator<T>(list, list.getSize());
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
