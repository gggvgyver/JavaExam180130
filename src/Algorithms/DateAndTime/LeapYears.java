package Algorithms.DateAndTime;

import java.util.GregorianCalendar;

public class LeapYears {
    public static void main(String[] args) {
        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
        int year = 2014;

        for(int i = year; i < 2030; i++) {
            boolean isLeapYear = cal.isLeapYear(year);
            if (isLeapYear) {
                System.out.println(year + "년은 윤년");
            }
            else System.out.println("평년");
            year++;
        }
    }
}
