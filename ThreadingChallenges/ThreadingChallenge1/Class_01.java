package ThreadingChallenges.ThreadingChallenge1;

public class Class_01 implements Runnable {


    public Class_01(String name) {
        Thread thread = new Thread(this, name);
        thread.start();

    }

    @Override
    public void run() {

    }
}
