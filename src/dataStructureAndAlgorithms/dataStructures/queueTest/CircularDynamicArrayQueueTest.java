package dataStructureAndAlgorithms.dataStructures.queueTest;

import static org.junit.Assert.assertEquals;
import java.util.EmptyStackException;
import org.junit.Test;

import dataStructureAndAlgorithms.dataStructures.queue.CircularDynamicArrayQueue;

public class CircularDynamicArrayQueueTest {

	public void enqueTestString(CircularDynamicArrayQueue<Integer> test, int enqueueValue) {
		System.out.println("\nEnque: " + enqueueValue);
		System.out.println("----------------------------------------------------------------------------------------------------");
		test.enqueue(enqueueValue);
		System.out.println("Queue: " + test.toString());
	}
	
	public void dequeTestString(CircularDynamicArrayQueue<Integer> test) {
		System.out.println("\nDeque:\n----------------------------------------------------------------------------------------------------");
		System.out.println("Return: " + test.first());
		test.dequeue();
		System.out.println("Queue: " + test.toString());
	}
	
	@Test (expected = EmptyStackException.class)
	public void test() {
		CircularDynamicArrayQueue<Integer> test = new CircularDynamicArrayQueue<>();
	
		System.out.println(test.toString());
		assertEquals(true, test.isEmpty());
		
		
		enqueTestString(test, 6);
		enqueTestString(test, 15);
		enqueTestString(test, 80);
		enqueTestString(test, 71);
		enqueTestString(test, 10);
		enqueTestString(test, 70);
		enqueTestString(test, 17);
		
		dequeTestString(test);
		
		enqueTestString(test, 65);
		
		dequeTestString(test);
		
		enqueTestString(test, 156);

		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		
		
		enqueTestString(test, 182);
		enqueTestString(test, 11);
		enqueTestString(test, 64);
		enqueTestString(test, 98);
		enqueTestString(test, 23);
		enqueTestString(test, 8);
		enqueTestString(test, 5);
		
		dequeTestString(test);
		
		enqueTestString(test, 75);
		
		dequeTestString(test);
		
		enqueTestString(test, 90);
		
		dequeTestString(test);
		
		enqueTestString(test, 45);
		
		dequeTestString(test);

		enqueTestString(test, 16);
		
		dequeTestString(test);
		
		enqueTestString(test, 18);
		
		dequeTestString(test);
		
		enqueTestString(test, 63);
		
		dequeTestString(test);
		
		enqueTestString(test, 85);
		
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);

		enqueTestString(test, 182);
		enqueTestString(test, 11);
		enqueTestString(test, 64);
		enqueTestString(test, 98);
		enqueTestString(test, 23);
		enqueTestString(test, 8);
		enqueTestString(test, 5);

		enqueTestString(test, 6);
		enqueTestString(test, 15);
		enqueTestString(test, 80);
		enqueTestString(test, 71);
		enqueTestString(test, 10);
		enqueTestString(test, 70);
		enqueTestString(test, 17);
	
		dequeTestString(test);
		
		enqueTestString(test, 75);
		
		dequeTestString(test);
		
		enqueTestString(test, 90);
		
		dequeTestString(test);
		
		enqueTestString(test, 45);
		
		dequeTestString(test);

		enqueTestString(test, 16);
		
		dequeTestString(test);
		
		enqueTestString(test, 18);
		
		dequeTestString(test);
		
		enqueTestString(test, 63);
		
		dequeTestString(test);
		
		enqueTestString(test, 85);
		
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		dequeTestString(test);
		
		/*test.enqueue(6);
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
		System.out.println(test.toString());*/
		
		/*Empty
		6, 15, 80, 70, 10, 70, 10  
		6
		15, 80, 70, 10, 70, 10  
		15
		80, 70, 10, 70, 10  
		80
		70, 10, 70, 10  
		70
		10, 70, 10  
		10
		70, 10  
		70
		10  
		10
		Empty*/
	}
}
