package Algorithms.Exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        int[] number = {4, 8,16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + "/" + denom[i] + "=" + number[i] / denom[i]);
            }
            catch (ArithmeticException e) {
                System.out.println("수식은 0으로 나눌수 없음");
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("배열범위초과");
            }
        }
    }
}
