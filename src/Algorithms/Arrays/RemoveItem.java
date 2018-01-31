package Algorithms.Arrays;

import java.util.Arrays;
import java.util.Random;

public class RemoveItem {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int length = array.length;
        int value = 4;

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("배열의길이: " + length);
        System.out.println(Arrays.asList(array).contains("4"));

        array = removeByValue(array, value);
        length = array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("배열의길이: " + length);
    }

    private static int[] removeByValue(int[] array, int value) {
        int valueIndex = -1;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                valueIndex = i;
                break;
            }
        }
        if(valueIndex < 0) return array;
        else {
            int[] newArray = new int[array.length - 1];

            for(int i = 0; i < valueIndex; i++) {
                newArray[i] = array[i];
            }
            for(int i = valueIndex + 1; i < array.length; i++) {
                newArray[i - 1] = array[i];
            }
            array = newArray;
            return array;
        }

    }
}
