package dataStructureAndAlgorithms.dataStructures.listTest.list;

import dataStructureAndAlgorithms.dataStructures.list.ArrayOrderedList;
import dataStructureAndAlgorithms.dataStructures.utilities.EmptyCollectionException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class OrderdListTest {

    @Test(expected = EmptyCollectionException.class)
    public void test() {
        ArrayOrderedList<Integer> test = new ArrayOrderedList();

        System.out.println(test.toString());

        System.out.println(test.isEmpty());

        assertEquals(true, test.isEmpty());

        test.add(new Integer(6));
        test.add(new Integer(15));
        test.add(new Integer(80));
        test.add(new Integer(70));
        test.add(new Integer(10));
        test.add(new Integer(55));
        test.add(new Integer(3));
        test.add(new Integer(16));
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

        test.add(new Integer(67));
        test.add(new Integer(91));
        test.add(new Integer(43));
        test.add(new Integer(88));
        test.add(new Integer(98));
        System.out.println(test.toString());

        test.removeLast();
        System.out.println(test.toString());

        test.removeLast();
        System.out.println(test.toString());
        test.removeLast();
        System.out.println(test.toString());
        test.removeLast();
        System.out.println(test.toString());
        test.removeLast();
        System.out.println(test.toString());
        test.removeLast();
        System.out.println(test.toString());
    }


}
