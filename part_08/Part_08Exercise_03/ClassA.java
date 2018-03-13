package part_08.Part_08Exercise_03;

public class ClassA {

    public static void main(String[] args) {
        int x;
        try{

            x = ClassB.divide(6,2);
            System.out.println(x);
            x = ClassB.divide(6,0);
        }catch (ArithmeticException e){

            System.out.println("divide by 0 caught");
        }

    }
}
