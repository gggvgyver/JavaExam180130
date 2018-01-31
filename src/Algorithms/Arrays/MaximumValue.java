package Algorithms.Arrays;

import java.util.Arrays;
import java.util.Random;

public class MaximumValue {
    public static void main(String[] args) {
        int[] array = new int[10];
        int max;
        Random random = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        max = array[0]; //임의의 수를 지정
        for(int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("최대값: " + max);
    }
}
