package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {
    public static void main(String[] args) {

        System.out.println("Enter an integer between 1 and 1,000,000,000");
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();

        int guess = 500000000;
        int max = 1000000000;
        int min = 0;
        if(integer <= max){

            while(integer != guess){


                if(integer < guess){
                    max = guess;
                    guess = max/2;
                }else{
                    min = guess;
                    guess = (max - min)/2 +min;
                }

            }

        }else{
            System.out.println("follow directions");
        }


        System.out.println("your number is " + guess);
    }


}

