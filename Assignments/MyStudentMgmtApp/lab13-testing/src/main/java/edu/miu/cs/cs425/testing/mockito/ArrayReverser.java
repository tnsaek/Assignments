package edu.miu.cs.cs425.testing.mockito;

import edu.miu.cs.cs425.testing.junitest.ArrayFlattenerService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayReverser {

    public int[] reversedArray(int[][] toBeReversed) {
        if (toBeReversed == null) {
            return null;
        }

        int[] flattenedArray = new ArrayFlattenerService().flattenArray(toBeReversed);
        List<Integer> list = new ArrayList<>();
        for (int i : flattenedArray) {
            list.add(i);
        }
        Collections.reverse(list);
        int[] reversedArray = list.stream().mapToInt(i -> i).toArray();
        return reversedArray;
    }

    public static class ArrayFlattenerService {

        public int[] flattenArray(int[][] tobeFlattened) {
            List<Integer> list = new ArrayList<>();
            for (int[] innerArray : tobeFlattened) {
                for (int i : innerArray) {
                    list.add(i);
                }
            }
            int[] flattenedArray = list.stream().mapToInt(i -> i).toArray();
            return flattenedArray;
        }
    }
}
