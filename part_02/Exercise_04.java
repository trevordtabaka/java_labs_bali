package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        System.out.println("Enter a number in pounds");
        Scanner scanner = new Scanner(System.in);
        double pounds = scanner.nextDouble();

        double kilos = Math.round(pounds * .454 *100)/ 100.0;

        System.out.println(pounds + " pounds is " + kilos + " kilos");
    }


}