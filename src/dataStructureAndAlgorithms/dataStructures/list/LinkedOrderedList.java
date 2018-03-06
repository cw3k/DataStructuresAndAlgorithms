package dataStructureAndAlgorithms.dataStructures.list;

import dataStructureAndAlgorithms.dataStructures.nodes.LinearNode;

import java.util.Iterator;

/**
 * Created by codeWarrior928 on 3/5/2018.
 */
public class LinkedOrderedList<T> implements OrderedListADT<T>, Iterable<T> {

    //Member variables
    private LinearNode<T> front;

    @Override
    public void add(T element) {

    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T remove(T element) {
        return null;
    }

    @Override
    public T first() {
        return null;
    }

    @Override
    public T last() {
        return null;
    }

    @Override
    public boolean contains(T target) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
