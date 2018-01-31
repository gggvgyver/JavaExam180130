package Algorithms.DateAndTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;

public class NumberOfTheMonth {
    public static void main(String[] args) throws IOException{
        System.out.println("영어로 현재 몇월달인지 입력해주세요!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().toUpperCase();
        int i = 0;

        for(Month month : Month.values()) {
            i++;
            if(month.toString().equals(str)) {
                System.out.println(str + " is " + i + " month");
            }
        }
    }
}
