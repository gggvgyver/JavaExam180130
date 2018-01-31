package Algorithms.Exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int num = 5 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("0으로 나눌수 없음");
        }
    }
}
