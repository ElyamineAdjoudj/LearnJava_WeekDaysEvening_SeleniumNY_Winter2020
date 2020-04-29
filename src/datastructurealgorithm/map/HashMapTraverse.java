package datastructurealgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTraverse {

//	Key Points
    //
    //	For operations like add, remove, containsKey, time complexity is O(log n where n is number of elements present in TreeMap.
    //	TreeMap always keeps the elements in a sorted(increasing) order, while the elements in a HashMap have no order.
    //	TreeMap also provides some cool methods for first, last, floor and ceiling of keys.
    //


    public static void main(String[] args) {
        int[] number = {34, 56, 77, 89, 23, 57, 56, 30, 21, 34, 89, 56};
        printFrequency(number);

    }

    static void printFrequency(int arr[]) {
        // Wrapper class: Holding all the primitive type of data

        // empty hashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            Integer c = hashMap.get(arr[i]);

            if (hashMap.get(arr[i]) == null) {
                hashMap.put(arr[i], 1);
            } else {
                hashMap.put(arr[i], ++c);
            }
        }

        for (Map.Entry mp : hashMap.entrySet()) {
            System.out.println("Frequency of " + mp.getKey() + " : " + mp.getValue());
        }


    }


}
