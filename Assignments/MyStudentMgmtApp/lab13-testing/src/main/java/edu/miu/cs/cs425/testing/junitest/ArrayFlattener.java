package edu.miu.cs.cs425.testing.junitest;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {

    public int[] flattenArray(int[][] toBeFlatten) {
        if (toBeFlatten == null) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        for (int[] array : toBeFlatten) {
            for (int element : array) {
                result.add(element);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
