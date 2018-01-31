package Algorithms.DateAndTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleTimer {
    public static void main(String[] args) throws InterruptedException, NumberFormatException, IOException {
        System.out.println("초단위로 시간을 입력해주세요 ex) 5");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(reader.readLine());
        int i = 0;

        while (i < time) {
            Thread.sleep(330);
            System.out.println("플레이어");
            Thread.sleep(640);
            System.out.println("뱅커");
            i++;
        }

        System.out.println("도박좀 하지 마라!");
    }
}
