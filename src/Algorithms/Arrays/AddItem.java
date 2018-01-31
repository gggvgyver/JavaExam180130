package Algorithms.Arrays;

import java.util.Arrays;
import java.util.Random;

public class AddItem {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int length = array.length;
        int value = -777;

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("배열길이: " + length);

        array = addElement(array, value);
        length = array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("배열길이: " + length);
    }

    private static int[] addElement(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        for(int i = 0; i < newArray.length; i++) {
            if(i < array.length) newArray[i] = array[i];
            else newArray[i] = value;
        }
        return newArray;
    }
}
