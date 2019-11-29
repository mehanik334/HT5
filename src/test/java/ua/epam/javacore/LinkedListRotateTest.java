package ua.epam.javacore;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import static org.junit.Assert.*;

public class LinkedListRotateTest {

    private LinkedListRotate linkedListRotate = new LinkedListRotate();
    private LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
    private LinkedList<Integer> res = new LinkedList<Integer>(Arrays.asList(4,5,1,2,3));

    @Test
    public void rotateLinkedListTestTrue() {
        linkedListRotate.rotateLinkedList(list,2);
        assertEquals(list,res);
    }

    @Test
    public void rotateLinkedListTestFalse() {
        linkedListRotate.rotateLinkedList(list,3);
        assertEquals(list,res);
    }
}
