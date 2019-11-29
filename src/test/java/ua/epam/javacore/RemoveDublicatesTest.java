package ua.epam.javacore;

import org.junit.Test;

import static org.junit.Assert.*;



public class RemoveDublicatesTest {

    private RemoveDublicates removeDublicates = new RemoveDublicates();
    private int[] arr = {1,1,2,3,4,4};

    @Test
    public void removeDublicatesFromArTestTrue() {
        int resLen = removeDublicates.removeDublicatesFromAr(arr);
        assertEquals(resLen,4);
    }

    @Test
    public void removeDublicatesFromArTestFalse() {
        int resLen = removeDublicates.removeDublicatesFromAr(arr);
        assertEquals(resLen,5);
    }
}
