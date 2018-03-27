package part_11;

/**
 make a new generic method called sumArray that will return the
 sum of all numbers in the array (no matter data type of numbers
 the array has in it)
 */


public class Exercise_04 {

    public static void main(String[] args) {

        Integer[] intArr = {2,5,7,3,4};

        System.out.println(sumArray(intArr));

    }

    public static <T extends Number> double sumArray(T[] arr){
        double sum =0;
        for (T e: arr){
                sum +=(double) e;

        }
       return sum;
    }

}


