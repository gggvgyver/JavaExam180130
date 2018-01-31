package Algorithms.Exceptions;

public class FinallyStatement {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            for(int i = 0; i < 6; i++) {
                array[i] = i;
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("배열범위초과");
        }
        finally {
            System.out.println("finally블록은 항상 try블록에 빠져날갈때 실행됨");
        }
    }
}
