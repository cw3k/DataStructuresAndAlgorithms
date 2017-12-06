package dataStructureAndAlgorithms.dataStructures.linearNodeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import dataStructureAndAlgorithms.dataStructures.linearNode.LinearNode;


public class LinearNodeTest {
	@Test //(expected = IndexOutOfBoundsException.class)
	public void test() {
		LinearNode<Integer> test = new LinearNode<>();
		test.setElement(5);
		int testElement = test.getElement();
		assertEquals(5, testElement);
		System.out.println(test.getElement());
		
		test.setNext(new LinearNode<>(6));
		int nextElement = test.getNext().getElement();
		assertEquals(6, nextElement);
		System.out.println(test.getNext().getElement());
		
		LinearNode<Integer> nextNextElement = test.getNext().getNext();
		assertEquals(null, nextNextElement);
		System.out.println(test.getNext().getNext());
		
		
		test.getNext().setNext(test);
		int nextNextElementInt = test.getNext().getNext().getElement();
		assertEquals(5, nextNextElementInt);
		System.out.println(test.getNext().getNext().getElement());
	}
}
