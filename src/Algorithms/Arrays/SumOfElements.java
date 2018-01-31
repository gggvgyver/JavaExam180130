package Algorithms.Arrays;

import java.util.Random;

public class SumOfElements {
    public static void main(String[] args) {
        int[] array = new int[20];
        long sum = 0;
        Random random = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("합계: " + sum);
    }
}
