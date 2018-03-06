
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {
        System.out.println("Enter an investment amount");
        Scanner investScanner = new Scanner(System.in);
        double investment = investScanner.nextDouble();

        System.out.println("Enter an investment rate in decimal format (10% would be input as .1");
        Scanner rateScanner = new Scanner(System.in);
        double rate = rateScanner.nextDouble();

        System.out.println("Enter the number of years to invest (whole years)");
        Scanner yearsScanner = new Scanner(System.in);
        int years = yearsScanner.nextInt();

        for(int i = 0; i<=years;i++){

            investment = investment * (1 + rate);
            System.out.println(investment);
        }
    }

}


