package part_04.Exercise_07;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */
class Stack{
    private int[] stack; // this array holds the queue
    private int pushloc;
    private int poploc; // the put and get indices


    Stack(int size) {
        stack = new int[size]; // allocate memory for queue
        pushloc = 0;
        poploc = 0;
    }
    // put a int into the queue
    void push(int c) {

        if(pushloc==stack.length -1) {
            System.out.println("stack is full");
            stack[pushloc] = c;
            return;
        }
        stack[pushloc++] = c;
        poploc++;
    }
    // get a int from the queue
    int pop() {

        if(poploc < 0) {
            System.out.println(" – Stack is empty.");
            return  0;
        }
        return stack[poploc--];
    }
}