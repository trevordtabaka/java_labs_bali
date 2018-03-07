package part_03;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.text.SimpleDateFormat;
import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = System.currentTimeMillis()/1000;
        // Get the current second within the minute within the hour
        long currentSecond = totalSeconds%60;
        System.out.println(currentSecond);
        // Get total minutes
        long totalMinutes = totalSeconds/60;
        // Get the current minute in the hour
        long currentMinute = totalMinutes%60;

        // Get the total hours
        long totalHours = totalMinutes/60;
        // Get the current hour
        long currentHour = totalHours%24;
        // Display results using a 12 hour clock, include AM or PM
        currentHour = currentHour + timeZoneChange;
        currentHour = (currentHour > 23) ? currentHour-24: currentHour;
        currentHour = (currentHour < 0) ? currentHour+24: currentHour;
        String ampm = (currentHour<12) ? "AM":"PM";
        currentHour = (currentHour > 12) ? currentHour-12: currentHour;

        String leadingZeroMin = (currentMinute < 10) ? "0" : "";
        String leadingZeroSec = (currentSecond < 10) ? "0" : "";
        System.out.println(currentHour + ":" + leadingZeroMin +currentMinute + ":" + leadingZeroSec + currentSecond + " " + ampm);

    }
}
