package part_10.part_10_Exercise_02;

public class ThreadClass extends Thread {

    public ThreadClass(String name) {
        super(name);
    }

    public void run(){

        System.out.println("Starting Thread class: " + this.getName());

    }
}
