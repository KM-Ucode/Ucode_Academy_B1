package day_26_local_date_intro;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime.format(dtf));

    }
}
