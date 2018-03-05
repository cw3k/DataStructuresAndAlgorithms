package dataStructureAndAlgorithms.dataStructures.list;

import dataStructureAndAlgorithms.dataStructures.dynamicArray.DynamicArray;
import dataStructureAndAlgorithms.dataStructures.dynamicArray.DynamicArrayIterator;
import dataStructureAndAlgorithms.dataStructures.utilities.ElementNotFoundException;
import dataStructureAndAlgorithms.dataStructures.utilities.EmptyCollectionException;

import java.util.Iterator;

/**
 * Created by codeWarrior928 on 3/4/2018.
 */
public class ArrayOrderedList<T> implements OrderedListADT<T>, Iterable<T> {

    protected DynamicArray<T> list;
    private int NOT_FOUND = -1;

    public ArrayOrderedList() {
        list = new DynamicArray<T>();
    }

    @Override
    public void add(T element) {
        Comparable<T> temp = (Comparable<T>) element;

        int i = 0;
        int len;
        while (i < list.getSize() && (temp.compareTo(list.access(i)) > 0)) {
            len = list.getSize();
            temp.compareTo(list.access(i));
            i++;
        }
        // set the value of each element after the insertion point to the value of the element at previous index
        for (int j = list.getSize(); j > i; j--) {
            list.setValue(j, list.access(j - 1));
        }

        list.setValue(i, element);

//        rear++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new EmptyCollectionException("Ordered List");
        }
        T element = list.access(0);
        list.delete(0);
        return element;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new EmptyCollectionException("Ordered List");
        }
        T returnValue = list.access(list.getSize());
        list.delete(list.getSize());
        return returnValue;
    }

    @Override
    public T remove(T element) {
        T result;
        int index = find(element);
        if (index == NOT_FOUND) {
            throw new ElementNotFoundException("Ordered List");
        }

        result = list.access(index);

        for (int i = index; i < list.getSize(); i++) {
            list.setValue(index, list.access(index + 1));
        }

        list.setValue(list.getSize(), null);

        return result;
    }

    private int find(T target) {
        int scan = 0, result = NOT_FOUND;
        boolean found = false;

        if (!isEmpty()) {
            while (!found && scan < list.getSize()) {
                if (target.equals(list.access(scan))) {
                    found = true;
                } else {
                    scan++;
                }
            }

            if (found) {
                result = scan;
            }
            return result;
        }

        return result;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            throw new ElementNotFoundException("Ordered List");
        }
        return list.access(0);
    }

    @Override
    public T last() {
        if (isEmpty()) {
            throw new ElementNotFoundException("Ordered List");
        }
        return list.access(list.getSize());
    }

    @Override
    public boolean contains(T target) {
        if (isEmpty()) {
            throw new ElementNotFoundException("Ordered List");
        }
        return (find(target) != NOT_FOUND);
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
