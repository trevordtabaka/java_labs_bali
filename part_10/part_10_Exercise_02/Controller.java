package part_10.part_10_Exercise_02;

public class Controller {
    public static void main(String[] args) {
        RunnableClass thread1 = new RunnableClass("Thread uno", 0, 100);
        try {
            thread1.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RunnableClass thread2 = new RunnableClass("Thread dos", 101,200);
        try {
            thread2.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RunnableClass thread3 = new RunnableClass("Thread tres", 201,300);

        ThreadClass thread4 = new ThreadClass("Thread quatro");
        ThreadClass thread5 = new ThreadClass("Thread cinco");
        ThreadClass thread6 = new ThreadClass("Thread seis");

        thread4.run();
        thread5.run();
        thread6.run();



    }




}
