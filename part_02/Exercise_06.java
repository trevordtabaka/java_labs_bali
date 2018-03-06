package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 6:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "switch-case" statement.
 *
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        System.out.println("Enter an integer between 1-9");
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();

        switch (integer){

            case 1:
                System.out.println("ONE");
                return;
            case 2:
                System.out.println("TWO");
                return;
            case 3:
                System.out.println("THREE");
                return;
            case 4:
                System.out.println("FOUR");
                return;
            case 5:
                System.out.println("FIVE");
                return;
            case 6:
                System.out.println("SIX");
                return;
            case 7:
                System.out.println("SEVEN");
                return;
            case 8:
                System.out.println("EIGHT");
                return;
            case 9:
                System.out.println("NINE");
                return;
            default:
                System.out.println("OTHER");


        }
    }


}