package ThreadingChallenges.ThreadingChallenge_03;

import java.io.*;

public class CustomThread implements Runnable{


    private String path;

    public CustomThread(String name, String path) {
        Thread thread = new Thread(this,name);
        this.path = path;
        thread.start();

    }

    @Override
    public void run() {

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path));  ){

            while(bufferedReader.readLine() != null){



            }

        }catch(FileNotFoundException e){

        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
