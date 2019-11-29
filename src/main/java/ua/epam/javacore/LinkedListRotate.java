package ua.epam.javacore;

import java.util.LinkedList;

public class LinkedListRotate {

    public  LinkedList<Integer> rotateLinkedList(LinkedList<Integer> linkedList, int shift) {
        if (linkedList == null) {
            return new LinkedList<Integer>();
        }
        for (int i = 0; i < shift; i++) {
            linkedList.addFirst(linkedList.get(linkedList.size() - 1));
            linkedList.removeLast();
        }
        return linkedList;
    }
}
