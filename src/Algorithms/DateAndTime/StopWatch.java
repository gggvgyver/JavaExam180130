package Algorithms.DateAndTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class StopWatch {
    public static void main(String[] args) throws IOException{
        System.out.println("시작하시려면 엔터를 누르세요!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Date old = new Date();

        System.out.println("그만하실려면 엔터를 누르세요!");
        str = reader.readLine();
        Date current = new Date();

        long distance = current.getSeconds() - old.getSeconds();

        System.out.println("시작과 종료에 걸린시간은 " + distance + "초 입니다.");
    }
}
