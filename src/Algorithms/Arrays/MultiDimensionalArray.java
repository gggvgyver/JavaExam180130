package Algorithms.Arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[] fruits = {"사과", "오렌지", "딸기", "바나나"};
        String[] trees = {"소나무", "대나무", "박달나무", "참나무"};
        String[] plants = {"버섯", "고추", "가지", "미나리", "콩나물"};
        String[][] array = {fruits, trees, plants};

        for(int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
