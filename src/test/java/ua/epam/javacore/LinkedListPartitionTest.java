package ua.epam.javacore;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPartitionTest {

    private LinkedListPartition listPartition = new LinkedListPartition();
    private LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(3,2,7,4,1,3));
    private LinkedList<Integer> res = new LinkedList<Integer>(Arrays.asList(1,3,3,2,7,4));

    @Test
    public void partitionListTestTrue() {
        listPartition.partitionList(list,4);
        assertEquals(res,list);
    }

    @Test
    public void partitionListTestFalse() {
        listPartition.partitionList(list,3);
        assertEquals(res,list);
    }
}
