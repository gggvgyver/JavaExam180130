package Algorithms.DateAndTime;

import java.util.Date;

public class Clock {
    public static void main(String[] args) {
        Date currentTime = new Date();

        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("현재시간 " + hours + ":" + mins + ":" + secs);
    }
}
