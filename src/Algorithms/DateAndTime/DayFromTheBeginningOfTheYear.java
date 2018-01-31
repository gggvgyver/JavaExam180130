package Algorithms.DateAndTime;

import java.util.Date;

public class DayFromTheBeginningOfTheYear {
    public static void main(String[] args) {
        Date today = new Date();
        int today_num = today.getDate();
        System.out.println("오늘은 새해시작부터 몇일 흘렀는가? " + today_num);
    }
}
