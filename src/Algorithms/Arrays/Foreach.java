package Algorithms.Arrays;

import java.util.Random;

public class Foreach {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for(int item : array) {
            item = random.nextInt(20);
            System.out.println(item);
        }
    }
}
