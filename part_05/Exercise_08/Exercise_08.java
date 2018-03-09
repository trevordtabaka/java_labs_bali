package part_05.Exercise_08;

/**
 Write one class. This class must make use of an inner/nested class. Within the nested class, access the instance variables
 of the outer class. Also, within the inner class, call at least two methods that have a return type of int.
 */
class Exercise_08{

    private int a = 8;
    private String str = "winning";


    public static void main(String[] args) {
        Exercise_08 ex8 = new Exercise_08();
        ex8.callInnerClass();

    }
    public void callInnerClass(){

        InnerClass myInnerClass = new InnerClass();
        myInnerClass.callOuterMethods();
        myInnerClass.printOuterClassString();

    }

    int add(int a, int b){

        int c = a+b;
        System.out.println("c (add) " + c);

        return c;
    }
    int multiply(int a, int b){

        int c = a * b;
        System.out.println("c (multiply) " + c);
        return c;
    }
    public class InnerClass{

        int x = 7;


        String printOuterClassString(){

            String innerStr = str;
            System.out.println(innerStr);
            return innerStr;
        }

        void callOuterMethods(){

            int answer = multiply(add(a,x), a);
            System.out.println(answer);

        }

    }

}