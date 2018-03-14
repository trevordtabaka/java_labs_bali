package part_09.Part09_Exercise01;

/*  SelfTest8_RandomText.txt OUTPUT

It-consists-of-a-variable-declaration-in-which-the-variable-is-initialized-with-a-reference-to-the-object-being-managed.-When-the-try-block-ends,-the-resource-is-automatically-released.-In-the-case-of-a-file,-this-means-that-the-file-is-automatically-closed.-(Thus,-there-is-no-need-to-call-close(-)-explicitly.)-A-try-with-resources-statement-can-also-include-catch-and-finally-clauses.
The-try-with-resources-statement-can-be-used-only-with-those-resources-that-implement-the-AutoCloseable-interface-defined-by-java.lang.-This-interface-defines-the-close(-)-method.-AutoCloseable-is-inherited-by-the-Closeable-interface-defined-in-java.io.-Both-interfaces-are-implemented-by-the-stream-classes,-including-FileInputStream-and-FileOutputStream.-Thus,-try-with-resources-can-be-used-when-working-with-streams,-including-file-streams.
As-a-first-example-of-automatically-closing-a-file,-here-is-a-reworked-version-of-the-ShowFile-program-that-uses-it:
/*-This-version-of-the-ShowFile-program-uses-a-try-with-resources-statement-to-automatically-close-a-file-when-it-is-no-longer-needed.

*/
import java.io.*;

public class SelfTest_8 {


    public static void main(String[] args) {

        try(BufferedReader input = new BufferedReader(new FileReader("randomText.txt"));
            BufferedWriter output = new BufferedWriter(new FileWriter("SelfTest8_RandomText.txt"))){

            int byteInt;

            while((byteInt = input.read()) != -1){
                if((char) byteInt != ' ') {
                    output.write(byteInt);
                }else{
                    output.write('-');
                }
            }

        }catch (IOException io){

            System.out.println("mayday");

        }
    }


}
