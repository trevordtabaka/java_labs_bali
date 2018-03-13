package part_08.Part_08_Exercise_02;

class Stack{
    private int[] stack; // this array holds the queue
    private int pushloc;


    Stack(int size) {
        stack = new int[size]; // allocate memory for queue
        pushloc = 0;
    }
    // put a int into the queue
    void push(int c) throws StackFullException {

        if(pushloc==stack.length) {
            throw new StackFullException(stack.length);

        }
//        stack[pushloc] = c;
//            return;
//        }
        stack[pushloc++] = c;
    }
    // get a int from the queue
    int pop() throws StackEmptyException{
        if(pushloc == 0) {
            throw new StackEmptyException();
        }
        return stack[--pushloc];
    }


}
