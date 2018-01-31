package Algorithms.Arrays;

import java.util.Arrays;
import java.util.Random;

public class AddIndex {
    public static void main(String[] args) {
        int[] array = new int[10];
        int length = array.length;
        Random random = new Random();
        int value = -5;
        int index = 4;

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("배열의길이: " + length);

        array = addElementByIndex(array, value, index);
        length = array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("배열의길이: " + length);
    }

    private static int[] addElementByIndex(int[] array, int value, int index) {
        if(index < 0 || index > array.length) {
            System.out.println("유효하지 않은 인덱스");
            return array;
        }
        int[] newArray = new int[array.length + 1];
        for(int i = 0; i < newArray.length; i++) {
            if(i < index) newArray[i] = array[i];
            else if(i == index) newArray[i] = value;
            else newArray[i] = array[i - 1];
        }
        return newArray;
    }
}
