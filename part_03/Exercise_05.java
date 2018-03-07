package part_03;

import java.io.IOException;
import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        System.out.println("Enter an integer from the user >=1 and <= 999,999,999");
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();


        // use the && operator to see if the user's number is divisible by both 4 and 7
        if(val % 4 == 0 && val%7==0){

            System.out.println("Value is divisible by 4 and 7");
        }

        // use the || operator to see if the user's number is divisible by 4 or 7
        if(val % 4 == 0 || val%7==0){
            System.out.println("Value is divisible by 4 and/or 7");
        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively

        if(val % 4 == 0 ^ val%7==0){
            System.out.println("Value is divisible by 4 or 7");
        }
        // print out the results

    }
}


