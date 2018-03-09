package part_05.Exercise_03;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 *
 * Output
 *
 calling first setVars int returning 10
 10
 returning first setVars returning 10
 Calling String setVars
 setting String
 returning setVars string
 calling second setVars returning 20
 20 setting String again
 returning second setVars returning 20
 done
 *
 *
 *
 */
class  Class01{

    public static void main(String[] args) {

        Class02 class02 = new Class02();

        System.out.println("calling first setVars int returning 10");

        class02.setVars(10);

        System.out.println("Calling String setVars");

        class02.setVars("setting String");

        System.out.println("calling second setVars returning 20");

        class02.setVars(10, "setting String again");

        System.out.println("done");

    }



}