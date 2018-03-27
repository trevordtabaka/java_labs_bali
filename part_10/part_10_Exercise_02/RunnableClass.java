package part_10.part_10_Exercise_02;

public class RunnableClass implements Runnable {

    Thread thread;
    int startIndex;
    int stopIndex;



    public RunnableClass(String threadName, int startIndex, int stopIndex) {
        thread = new Thread(this,threadName);
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;

        thread.start();
    }

    @Override
    public void run() {

        System.out.println("Started Runnable thread: " + thread.getName());
        for (int i =startIndex ; i <= stopIndex; i++) {

            System.out.println(i);
        }

    }
}
