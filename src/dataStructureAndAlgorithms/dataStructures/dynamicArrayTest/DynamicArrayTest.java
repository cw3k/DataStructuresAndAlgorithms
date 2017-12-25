package dataStructureAndAlgorithms.dataStructures.dynamicArrayTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dataStructureAndAlgorithms.dataStructures.dynamicArray.DynamicArray;


public class DynamicArrayTest {

	@Test //(expected = IndexOutOfBoundsException.class)
	public void test() {
		DynamicArray<Integer> test = new DynamicArray<>();
		
		Boolean isEmptyOutput = test.isEmpty();
		assertEquals(true, isEmptyOutput);
		
		int getSizeOutput = test.getSize();
		assertEquals(0, getSizeOutput);
		
		test.append(4);
		test.delete(0);
		isEmptyOutput = test.isEmpty();
		assertEquals(true, isEmptyOutput);
		
		test.append(4);
		isEmptyOutput = test.isEmpty();
		assertEquals(false, isEmptyOutput);
		getSizeOutput = test.getSize();
		assertEquals(1, getSizeOutput);
		
		
		test.append(7);
		test.append(11);
		test.append(18);
		test.append(25);
		test.append(0);
		test.append(-3);
		
		getSizeOutput = test.getSize();
		assertEquals(7, getSizeOutput);
		
		System.out.println(test.toString());
		test.insert(36, 5);
		System.out.println(test.toString());
		getSizeOutput = test.getSize();
		assertEquals(8, getSizeOutput);
		
		test.insert(42, 2);
		getSizeOutput = test.getSize();
		assertEquals(9, getSizeOutput);
		
		/*test.insert(55, 100);
		getSizeOutput = test.getSize();
		assertEquals(8, getSizeOutput);*/
		
		System.out.println(test.toString());
		test.delete(0);
		System.out.println(test.toString());
		test.delete(4);
		System.out.println(test.toString());
		
		/*int element = test.access(7);
		assertEquals(-3, element);*/
		
		int searchResults = test.search(42);
		assertEquals(1, searchResults);
		
		searchResults = test.search(55);
		assertEquals(-1, searchResults);
	}

}
