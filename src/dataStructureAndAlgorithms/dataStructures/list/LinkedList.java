package dataStructureAndAlgorithms.dataStructures.list;

import dataStructureAndAlgorithms.dataStructures.nodes.LinearLinkedIterator;
import dataStructureAndAlgorithms.dataStructures.nodes.LinearNode;
import dataStructureAndAlgorithms.dataStructures.utilities.ElementNotFoundException;
import dataStructureAndAlgorithms.dataStructures.utilities.EmptyCollectionException;

import java.util.Iterator;

/**
 * Created by codeWarrior928 on 3/5/2018.
 */
public class LinkedList<T> implements UnorderedListADT<T>, Iterable<T> {

    //Member variables
    private String listName = "Linked List";
    private LinearNode<T> front;
    private int count;
    private int NOT_FOUND = -1;

    public LinkedList(LinearNode<T> front) {
        this.front = front;
        this.count = 1;
    }

    public LinkedList() {
        this.front = null;
        this.count = 0;
    }

    @Override
    public void addToFront(T element) {
        if (isEmpty()) {
            this.front = new LinearNode<T>(element);
        } else {
            LinearNode<T> newFront = new LinearNode<T>(element);
            newFront.setNext(this.front);
            this.front = newFront;
        }
        this.count++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) throw new EmptyCollectionException(listName);
        LinearNode<T> oldFront = this.front;
        this.front = this.front.getNext();
        this.count--;
        return oldFront.getElement();
    }

    @Override
    public void addToRear(T element) {
        if (isEmpty()) {
            this.front = new LinearNode<T>(element);
        } else {
            LinearNode currentNode = this.front;
            int i = 0;
            while (i < count - 1) {
                currentNode = currentNode.getNext();
                i++;
            }
            currentNode.setNext(new LinearNode(element));
        }

        this.count++;
    }

    @Override
    public T removeLast() {
        LinearNode<T> currentNode = this.front;
        if (isEmpty()) throw new EmptyCollectionException(listName);
        if (this.count == 1) {
//            this.front = new LinearNode<T>(null);
            this.front = null;
            count--;
            return currentNode.getElement();
        }

        int i = 0;
        //Go to the penultimate node
        while (i < count - 2) {
            currentNode = currentNode.getNext();
            i++;
        }

        LinearNode<T> lastNode = currentNode;
        currentNode.setNext(null);
        //currentNode = null;
        this.count--;

        return lastNode.getElement();
    }

    @Override
    public T remove(T targetElement) {
        LinearNode<T> targetNode = new LinearNode<T>(targetElement);
        LinearNode<T> currentNode = front;
        LinearNode<T> previousNode = null;
        int i = 0;

        while (i < count) {
            previousNode = currentNode;
            if (currentNode.getElement().equals(targetNode.getElement())) {
                //# TODO: finish...
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    @Override
    public void addAfter(T elementToAdd, T target) {
        //Exception if the list is empty
        if (isEmpty()) {
            throw new EmptyCollectionException(listName);
        }
        //Throw exception if the list does not contain the target
        if (!contains(target)) {
            throw new ElementNotFoundException(listName);
        }

        LinearNode<T> nodeToInsert = new LinearNode(elementToAdd);
        LinearNode<T> currentNode = this.front;

        for (int i = 0; i < count; i++) {
            if (currentNode.getElement().equals(target)) {
                LinearNode<T> followingNode = currentNode.getNext();
                nodeToInsert.setNext(followingNode);
                currentNode.setNext(nodeToInsert);
                count++;
                return;
            } else {
                currentNode = currentNode.getNext();
            }
        }
    }

    @Override
    public T first() {
        return this.front.getElement();
    }

    @Override
    public T last() {
        LinearNode<T> currentNode = this.front;
        int i = 0;
        while (i < count - 1) {
            currentNode = currentNode.getNext();
            i++;
        }
        return currentNode.getElement();
    }

    @Override
    public boolean contains(T target) {
        LinearNode<T> currentNode = this.front;

        for (int i = 0; i < count; i++) {
            if (currentNode.getElement().equals(target)) {
                return true;
            } else {
                currentNode = currentNode.getNext();
            }
        }

        return false;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinearLinkedIterator<>(this.front, this.count);
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Empty";
        } else {

            Iterator<T> linkedIter = new LinearLinkedIterator<>(this.front, this.count);
            StringBuilder linkedString = new StringBuilder();

            if (isEmpty()) {
                return ("Empty");
            } else {
                while (linkedIter.hasNext()) linkedString.append(linkedIter.next() + ", ");
            }

            linkedString.setCharAt(linkedString.length() - 2, ' '); // remove the trailing comma
            return linkedString.toString() /*+ "Front: " + this.front.getElement()*/;
        }
    }
}
