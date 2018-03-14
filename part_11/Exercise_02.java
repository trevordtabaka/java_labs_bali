package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2,3,4,5};
        Exercise_01.printArray(intArray);
        exchangeElement(intArray);

    }


    public static <E> void exchangeElement(E[] arr){

        for (int i = 0; i < arr.length/2 ; i++) {

            E temp = arr[arr.length-1-i];

            arr[arr.length-1-i] = arr[i];

            arr[i] = temp;

        }
        Exercise_01.printArray(arr);

    }
    
}

