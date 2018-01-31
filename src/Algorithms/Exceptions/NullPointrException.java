package Algorithms.Exceptions;

import java.util.HashMap;
import java.util.HashSet;

public class NullPointrException {
    public static void main(String[] args) {
        try {
            HashMap map = new HashMap(null);
        }
        catch (NullPointerException e) {
            System.out.println("널포인트 예외");
        }
    }
}
