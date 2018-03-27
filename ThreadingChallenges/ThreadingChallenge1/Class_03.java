package ThreadingChallenges.ThreadingChallenge1;

public class Class_03 implements Runnable {

    public Class_03(String name) {
        Thread thread = new Thread(this, name);

        thread.start();

    }

    public void run(){


    }
}
