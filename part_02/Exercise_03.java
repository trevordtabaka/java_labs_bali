package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) {
        System.out.println("Enter a number in feet");
        Scanner scanner = new Scanner(System.in);
        double feet = scanner.nextDouble();

        double meters = Math.round(feet * .305 *100)/ 100.0;

        System.out.println(feet + " feet is " + meters + " meters");
    }

}