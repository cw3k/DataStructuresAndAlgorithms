package dataStructureAndAlgorithms.dataStructures.stackTest;

import static org.junit.Assert.assertEquals;
import java.util.EmptyStackException;
import org.junit.Test;
import dataStructureAndAlgorithms.dataStructures.stack.LinkedStack;

public class LinkedStackTest {
	
	@Test (expected = EmptyStackException.class)
	public void test() {
		LinkedStack<Integer> test = new LinkedStack<>();
	
		System.out.println(test.toString());
		assertEquals(true, test.isEmpty());
		
		test.push(6);
		test.push(15);
		test.push(80);
		test.push(70);
		test.push(10);
		System.out.println(test.toString());
		
		System.out.println(test.pop());
		System.out.println(test.toString());
		System.out.println(test.pop());
		System.out.println(test.toString());
		System.out.println(test.pop());
		System.out.println(test.toString());
		System.out.println(test.pop());
		System.out.println(test.toString());
		System.out.println(test.pop());
		System.out.println(test.toString());
		System.out.println(test.pop());
		System.out.println(test.toString());
	}
}
