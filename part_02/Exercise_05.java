package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {

        System.out.println("Enter an integer between 1-9");
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();

        if(integer == 1){

            System.out.println("ONE");
        }else if(integer ==2){
            System.out.println("TWO");
        }else if(integer ==3){
            System.out.println("THREE");
        }else if(integer ==4){
            System.out.println("FOUR");
        }else if(integer ==5){
            System.out.println("FIVE");
        }else if(integer ==6){
            System.out.println("SIX");
        }else if(integer ==7){
            System.out.println("SEVEN");
        }else if(integer ==8){
            System.out.println("EIGHT");
        }else if(integer ==9){
            System.out.println("NINE");
        }else{
            System.out.println("OTHER");
        }



    }

}

