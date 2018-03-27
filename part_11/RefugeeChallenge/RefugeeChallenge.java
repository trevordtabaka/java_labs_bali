package part_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RefugeeChallenge {

    public static void main(String[] args) {

        String path = "/Users/trevortabaka/Downloads/refugees_per_capita.csv";

        try(FileReader fr = new FileReader(path); BufferedReader bufferedReader = new BufferedReader(fr)){

            String currentLine;

            while((currentLine = bufferedReader.readLine()) != null ){

                String[] data = currentLine.split(",");
                

            }

        }catch (IOException e){



        }


    }

}
