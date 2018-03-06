package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {

    public static void main(String[] args) {
        System.out.println("Enter the radius of the cylinder");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("Enter the length of the cylinder");
        Scanner scanner2 = new Scanner(System.in);
        double length = scanner2.nextDouble();

        double area = Math.round(Math.PI * radius*radius*100.0)/100.0;
        double volume = Math.round(area * length * 100.0)/ 100.0;

        System.out.println("The area of the cylinder is " + area + " and the volume is " + volume);

    }


}