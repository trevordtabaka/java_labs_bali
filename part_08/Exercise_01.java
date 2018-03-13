package part_08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_01 {

    public static void main(String[] args) {
        getIntScanner();
    }
    public static void  getIntScanner() {

        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);

            try{
                int num = scanner.nextInt();
                System.out.println("you entered " + num);
            }catch (InputMismatchException ioEx){

                System.out.println("You did not enter an integer.");
            }

    }

}
