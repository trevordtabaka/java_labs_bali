package part_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//be sure to close all connections

public class Exercise_03 {

    public static void main(String[] args) {

        BufferedReader bufferedReader = null;

        try{
            bufferedReader = new BufferedReader(new FileReader("randomText.txt"));
            String str;
            int c;

            while((c=bufferedReader.read()) != -1){
                System.out.print("My read in (c) followed by the rest of the line: (" + (char) c +")");

                str = bufferedReader.readLine();
                System.out.println(str);
            }



        }catch (IOException e){

            System.out.println("Mayday, no worky");

        }finally {

            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
