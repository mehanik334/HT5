package ua.epam.javacore;


public class RemoveDublicates {

    public int removeDublicatesFromAr(int[] arr) {
        int newLen = 0;
        if (arr != null || arr.length > 1) {
            int numDub = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    numDub++;
                    int temp = arr[i + 1];
                    for (int j = i + 1; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = temp;
                }
            }
            newLen = arr.length - numDub;
        }
        return newLen;
    }
}
