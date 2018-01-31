package Algorithms.Arrays;

import java.util.Arrays;
import java.util.Random;

public class TheNumberOfRepetitions {
    public static void main(String[] args) {
        int[] array = new int[20];
        int element =5;
        int count = 0;
        Random random = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if(array[i] == element) count++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("원소: " + element + " " + count + "번 발생");
    }
}
