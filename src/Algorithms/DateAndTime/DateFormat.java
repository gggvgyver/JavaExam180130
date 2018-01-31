package Algorithms.DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.util.Locale.KOREA;

public class DateFormat {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat();
        System.out.println("1: " + dateFormat.format(currentDate));

        dateFormat = new SimpleDateFormat("dd MMMM");
        System.out.println("2: " + dateFormat.format(currentDate));

        dateFormat = new SimpleDateFormat("dd MMMM", KOREA);
        System.out.println("3: " + dateFormat.format(currentDate));

        dateFormat = new SimpleDateFormat("EEE, MMM d, ''yy");
        System.out.println("4: " + dateFormat.format(currentDate));

        dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println("5: " + dateFormat.format(currentDate));

        dateFormat = new SimpleDateFormat("hh 'o''clock' a, zzzz");
        System.out.println("6: " + dateFormat.format(currentDate));

        dateFormat = new SimpleDateFormat("YYYY MM DD", KOREA);
        System.out.println("7: " + dateFormat.format(currentDate));
    }
}
