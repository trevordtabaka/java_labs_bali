package part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        // uncomment the lines below when your methods are ready


        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));



    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array


    static int getMaxVal(int[][] myArray) {
        int max = myArray[0][0];

        for (int row[] : myArray) {
            for (int val : row) {
                if (val > max) {
                    max = val;
                }

            }

        }
        return max;
    }

    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
    static int getMinVal(int[][] myArray) {
        int min = myArray[0][0];

        for (int row[] : myArray) {
            for (int val : row) {
                 if (val < min) {
                    min = val;
                }
            }

        }
        return min;
    }
}