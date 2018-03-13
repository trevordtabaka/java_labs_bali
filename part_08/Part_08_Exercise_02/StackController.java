package part_08.Part_08_Exercise_02;


public class StackController {


    public static void main(String[] args) {
        //implement Stack
        Stack myStack = new Stack(2);

        // Populate Stack and overrun
        try {
            for (int i = 0; i < 5; i++) {
                myStack.push(i);
            }
        } catch (StackFullException fullStackE) {
            System.out.println(fullStackE.toString());
        }
// Print stack
        try{
            //over empty stack
            for(int x = 100; x >= -5; x--) {
                int stackVal = myStack.pop();
                System.out.println(stackVal);
            }
        }catch (StackEmptyException emptyStackE){
            System.out.println(emptyStackE.toString());
        }

    }

}
