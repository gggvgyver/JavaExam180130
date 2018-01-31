package Algorithms.Arrays;

import java.util.Arrays;

public class MergingArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 95, 0, -41};
        int[] array2 = {72, 621, -7, 12};
        int[] array = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, array, 0, array1.length);
        System.arraycopy(array2, 0, array, array1.length, array2.length);
        System.out.println(Arrays.toString(array));
    }
}
