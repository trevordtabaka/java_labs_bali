package part_01;

/**
 * Part 1 Exercise 7:
 *      Print pi to the console using the following formula: note that this is not the complete series to
 *      compute the true number pi.
 *
 *      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 *
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        double num=0;
        boolean plusFlag=true;


        for(double i=1; i<=1001; i+=2){

            if(plusFlag){
                num += (1.0/i);
            }else{
                num -= (1.0/i);
            }

            plusFlag = !plusFlag;
        }

        double pi = 4.0 * num;

        System.out.println(pi);

    }


}