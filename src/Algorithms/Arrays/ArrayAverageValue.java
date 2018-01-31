package Algorithms.Arrays;

import java.util.Random;

public class ArrayAverageValue {
    public static void main(String[] args) {
        /*
        01. 변수설정 및 초기화
        02. 랜덤숫자(10000) 배열에 저장
        03. 합계
        04. 평균
         */
        int[] array = new int[20];
        double average;
        long sum = 0;
        Random random = new Random();

        /*
        for(Integer array02 : array) array02 = random.nextInt(10000);
        for(long sum02 : array) sum = sum02;
        */

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        average = (double)sum / array.length;
        System.out.println("평균: " + average);

    }
}
