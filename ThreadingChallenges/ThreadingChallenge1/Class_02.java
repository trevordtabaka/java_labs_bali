package ThreadingChallenges.ThreadingChallenge1;

public class Class_02 implements Runnable{

    public Class_02(String name) {
        Thread thread = new Thread(this, name) ;
        thread.start();

    }

    public void run(){



    }
}
