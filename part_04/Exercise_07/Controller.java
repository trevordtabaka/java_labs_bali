package part_04.Exercise_07;

public class Controller {

    public static void main(String[] args) {
        //implement Stack
        Stack myStack = new Stack(101);

        // Populate Stack
        for (int i = 0; i < 101; i++) {
            myStack.push(i);
            System.out.println(i);
        }
// Print stack
        for (int x = 100; x >= 0; x--) {
            int stackVal = myStack.pop();
            System.out.println(stackVal);

        }

    }
}
