package part_10.part_10_Exercise_02;

public class Runnable implements Runnable {

    Thread threadName;

    public Runnable(Thread threadName) {
        this.threadName = threadName;

        start();
    }

    @Override
    public void run() {



    }
}
