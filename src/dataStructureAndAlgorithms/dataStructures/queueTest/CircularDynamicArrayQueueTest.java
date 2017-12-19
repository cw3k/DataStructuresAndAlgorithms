package dataStructureAndAlgorithms.dataStructures.queueTest;

import static org.junit.Assert.assertEquals;
import java.util.EmptyStackException;
import org.junit.Test;

import dataStructureAndAlgorithms.dataStructures.queue.CircularDynamicArrayQueue;

public class CircularDynamicArrayQueueTest {
	
	@Test (expected = EmptyStackException.class)
	public void test() {
		CircularDynamicArrayQueue<Integer> test = new CircularDynamicArrayQueue<>();
	
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
		
		test.enqueue(0);
		test.enqueue(11);
		test.enqueue(64);
		test.enqueue(98);
		test.enqueue(23);
		test.enqueue(8);
		test.enqueue(5);
		System.out.println(test.toString());
		
		System.out.println(test.dequeue());
		test.enqueue(75);
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		test.enqueue(90);
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		test.enqueue(45);
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		test.enqueue(16);
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		test.enqueue(18);
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		test.enqueue(63);
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		test.enqueue(85);
		System.out.println(test.toString());
	}
}
