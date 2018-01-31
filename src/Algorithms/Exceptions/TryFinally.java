package Algorithms.Exceptions;

public class TryFinally {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    private static int method1() {
        try {
            return 1;
        }
        finally {
            System.out.println("파이널블록은 값을 리턴한후에도 실행됨");
        }
    }

}
