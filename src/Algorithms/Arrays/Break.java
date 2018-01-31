package Algorithms.Arrays;

public class Break {
    public static void main(String[] args) {
        int[] array = {127, 96, 51, 13, 34, 22, -4, 17, 5};

        for(int item : array) {
            if(item < 0) break;
            System.out.println(item);
        }
    }
}
