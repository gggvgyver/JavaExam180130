package Algorithms.Arrays;

import java.util.Arrays;

public class ArrayFlipping {
    public static void main(String[] args) {
        int[] array = {5, 4, 8, 0, -1, 6, 11, 18, 29, 31, 12, 88};
        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));

    }
}
