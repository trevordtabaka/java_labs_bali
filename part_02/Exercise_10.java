package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {

    public static void main(String[] args) {

        for(int i = 3; i<=100;i++){

            int divCount = 0;

            for(int j = 2; j <= i-1; j++ ) {
                if (i % j == 0) {
                    divCount++;
                    break;
                }
            }
            if(divCount == 0){

                System.out.println(i);

            }



        }

    }

}


