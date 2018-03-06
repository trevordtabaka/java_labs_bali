package part_02;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Part 2 Exercise 1:
 *      Celsius to Fahrenheit
 *
 *      Write the necessary code to read a degree in Celsius (as a double) from the console
 *      then convert it to fahrenheit and print it to the console.
 *
 *          F = 9 * (C / 5) + 32;
 *
 *      Output should read like - "27.4 degrees celsius = 81.32 degrees fahrenheit"
 */

public class Exercise_01 {
    public static void main(String[] args) {

        System.out.println("Enter a temperature in Celsius");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();

        double fahrenheitTimes100 = (1.8 * celsius +32)*100;
        double fahrenheit = Math.round(fahrenheitTimes100)/100.0;

        System.out.println(celsius + " degrees celsius = " + fahrenheit + " degrees fahrenheit");


    }





}