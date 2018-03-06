package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {

    public static void main(String[] args) {
        System.out.println("Enter the number of miles to drive.");
        Scanner milesScanner = new Scanner(System.in);
        double miles = milesScanner.nextDouble();

        System.out.println("Enter your cars MPG");
        Scanner mpgScanner = new Scanner(System.in);
        double mpg = mpgScanner.nextDouble();

        System.out.println("Enter the price per gallon of fuel (USD)");
        Scanner ppGScanner = new Scanner(System.in);
        double ppGal = ppGScanner.nextDouble();


        double gals = miles/mpg;
        double cost = Math.round(gals * ppGal*100)/100.0;

        System.out.println("The trip will cost " + cost + " USD in fuel");

    }

}