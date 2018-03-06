package dataStructureAndAlgorithms.dataStructures.listTest.list;

import dataStructureAndAlgorithms.dataStructures.list.LinkedList;
import dataStructureAndAlgorithms.dataStructures.utilities.ElementNotFoundException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LinkedListTest {

    //@Test(expected = EmptyCollectionException.class)
    @Test(expected = ElementNotFoundException.class)
    public void test() {
        LinkedList<Integer> test = new LinkedList<Integer>();

        System.out.println(test.toString());

        System.out.println(test.isEmpty());

        assertEquals(true, test.isEmpty());

        test.addToFront(new Integer(6));
        test.addToFront(new Integer(15));
        test.addToFront(new Integer(80));
        test.addToFront(new Integer(70));
        test.addToFront(new Integer(10));
        test.addToFront(new Integer(55));
        test.addToFront(new Integer(3));
        test.addToFront(new Integer(16));
        System.out.println(test.toString());

        test.removeFirst();
        System.out.println(test.toString());
        test.removeFirst();
        System.out.println(test.toString());
        test.removeFirst();
        System.out.println(test.toString());
        test.removeFirst();
        System.out.println(test.toString());
        test.removeFirst();
        System.out.println(test.toString());
        test.removeFirst();
        System.out.println(test.toString());
        test.removeFirst();
        System.out.println(test.toString());
        test.removeFirst();
        System.out.println(test.toString());

        test.addToFront(new Integer(67));
        test.addToFront(new Integer(91));
        test.addToFront(new Integer(43));
        test.addToFront(new Integer(88));
        test.addToFront(new Integer(98));
        System.out.println(test.toString());
        System.out.println(test.size());

        test.removeLast();
        System.out.println(test.toString());
        System.out.println(test.size());

        test.removeLast();
        System.out.println(test.toString());
        System.out.println(test.size());

        test.removeLast();
        System.out.println(test.toString());
        test.removeLast();
        System.out.println(test.toString());
        test.removeLast();
        System.out.println("Is the list empty?");
        System.out.println(test.toString());
        /*test.removeLast();
        System.out.println(test.toString());*/

        test.addToRear(new Integer(17));
        System.out.println(test.toString());
        test.addToFront(new Integer(6));
        System.out.println(test.toString());
        test.addToFront(new Integer(56));
        System.out.println(test.toString());
        test.addToRear(new Integer(15));
        System.out.println(test.toString());
        test.addToRear(new Integer(80));
        System.out.println(test.toString());
        test.addToRear(new Integer(70));
        System.out.println(test.toString());
        test.addToRear(new Integer(10));
        System.out.println(test.toString());
        test.addToRear(new Integer(55));
        System.out.println(test.toString());
        test.addToRear(new Integer(3));
        System.out.println(test.toString());

        System.out.println("Add 16 after 6");
        test.addAfter(16, 6);
        System.out.println(test.toString());

        System.out.println("Add 67 after 3");
        test.addAfter(67, 3);
        System.out.println(test.toString());

        System.out.println("Add 43 after 70");
        test.addAfter(43, 70);
        System.out.println(test.toString());

        System.out.println("Add 88 after 105");
        test.addAfter(88, 105);
        System.out.println(test.toString());

        System.out.println("Last Element");
        System.out.println(test.last());

    }


}
