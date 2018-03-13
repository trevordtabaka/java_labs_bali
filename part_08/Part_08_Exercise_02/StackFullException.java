package part_08.Part_08_Exercise_02;

public class StackFullException extends Exception{

    int size;
    StackFullException(int s){
        size = s;
    }

    public String toString(){
        return "\nQueue is full. Maximum size is " +
                size; }

}
