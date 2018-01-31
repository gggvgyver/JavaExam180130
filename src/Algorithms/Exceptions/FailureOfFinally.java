package Algorithms.Exceptions;

public class FailureOfFinally {
    public static void main(String[] args) {
        try {
            System.exit(1);
        }
        finally {
            System.err.println("finally");
        }
    }
}
