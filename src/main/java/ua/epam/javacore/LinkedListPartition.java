package ua.epam.javacore;

import java.util.LinkedList;

public class LinkedListPartition {


    public LinkedList partitionList(LinkedList<Integer> list, Integer num) {
        int indexOfLimitNumber = list.indexOf(num);
        int temp;
        for (int i = indexOfLimitNumber; i < list.size() - 1; i++) {
            if (list.get(i + 1) <= num) {
                temp = list.remove(i + 1);
                for (int j = 0; j < list.indexOf(num); j++) {
                    if (list.get(j) >= temp) {
                        list.add(j, temp);
                        break;
                    }
                }
            }
        }
        return list;
    }
}
