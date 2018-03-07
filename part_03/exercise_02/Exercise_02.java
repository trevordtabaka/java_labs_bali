package part_03.exercise_02;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */
class Exercise_02 {
    public static void main(String[] args) {

        int a = 12, b=7;

        Exercise_02 myClass = new Exercise_02();

        int z = myClass.add(a,myClass.multiply(a,b));

        System.out.println(z);




    }


    int add(int a, int b){

        return a + b;
    }

    int multiply(int x, int y){


        return x*y;
    }


}
/////Output////////
//   96          //
///////////////////