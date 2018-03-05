package dataStructureAndAlgorithms.dataStructures.listTest.list;

import dataStructureAndAlgorithms.dataStructures.list.ArrayUnorderedList;
import dataStructureAndAlgorithms.dataStructures.utilities.EmptyCollectionException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UnorderdListTest {

    @Test(expected = EmptyCollectionException.class)
    public void test() {
        ArrayUnorderedList<Integer> test = new ArrayUnorderedList<Integer>();

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

        test.removeLast();
        System.out.println(test.toString());

        test.removeLast();
        System.out.println(test.toString());
        test.removeLast();
        System.out.println(test.toString());
        test.removeLast();
        System.out.println(test.toString());
     /*   test.removeLast();
        System.out.println(test.toString());
        test.removeLast();
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
        test.addAfter(6, 16);
        System.out.println(test.toString());

        System.out.println("Add 67 after 3");
        test.addAfter(3, 67);
        System.out.println(test.toString());

        System.out.println("Add 43 after 70");
        test.addAfter(70, 43);
        System.out.println(test.toString());

        System.out.println("Add 88 after 105");
        test.addAfter(105, 88);
        System.out.println(test.toString());

    }


}
