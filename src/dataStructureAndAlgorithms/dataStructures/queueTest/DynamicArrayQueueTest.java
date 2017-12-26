package dataStructureAndAlgorithms.dataStructures.queueTest;

import static org.junit.Assert.assertEquals;
import java.util.EmptyStackException;
import org.junit.Test;

import dataStructureAndAlgorithms.dataStructures.queue.DynamicArrayQueue;

public class DynamicArrayQueueTest {
	
	@Test (expected = EmptyStackException.class)
	public void test() {
		DynamicArrayQueue<Integer> test = new DynamicArrayQueue<>();
	
		System.out.println(test.toString());
		assertEquals(true, test.isEmpty());
		
		test.enqueue(6);
		test.enqueue(15);
		test.enqueue(80);
		test.enqueue(70);
		test.enqueue(10);
		test.enqueue(70);
		test.enqueue(10);
		System.out.println(test.toString());
		
		System.out.println(test.dequeue());
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		System.out.println(test.toString());
	}
}
