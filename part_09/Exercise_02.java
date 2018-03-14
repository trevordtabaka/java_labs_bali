package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Exercise_02 {
    public static void main(String[] args) {
        BufferedInputStream inputStream = null;

        try{

            inputStream = new BufferedInputStream(new FileInputStream("randomText.txt"));
            int b;

            while((b=inputStream.read()) != -1){

                System.out.println(b + " " + (char) b);

            }

        }catch(IOException e){
            System.out.println("something didnt work");
            return;

        }finally{
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}

