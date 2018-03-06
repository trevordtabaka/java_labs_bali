package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        System.out.println("Enter a number of minutes up to 1 billion");
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        if(minutes >1000000000){
            System.out.println("Too many minutes");
        }else{
            double years = Math.floor(minutes/60.0/24.0/365);
            double days = minutes/(60.0*24) - years*365;
            System.out.println(minutes + " minutes is equal to " + years + " year(s) and " + Math.round(days *100)/100.0 + " days");
        }


    }

}


