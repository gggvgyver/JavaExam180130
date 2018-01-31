package Algorithms.Arrays;

import java.util.Random;

public class ArrayRandomFilling {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
    }
}
