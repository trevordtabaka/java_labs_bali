package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        double distKm = 12;
        double timeMins = 30.5;

        double speedMPH;
        double distMiles = distKm *1.6;
        double timeHours = timeMins/60.0;

        speedMPH = distMiles / timeHours;

        System.out.println("The speed in MPH is: " + speedMPH);
    }




}