package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class Exercise_09{

    public static void main(String[] args) {
        varArgsString("I", "think", "this", "works", ".");
        varArgsString("Wow", "it", "did",".");
        varArgsString("Pretty", "neat", ".");
    }


    static void varArgsString(String ... varargs){
        StringBuilder myStringBuilder = new StringBuilder();
        int count = 0;
        for(String v:varargs){
            count++;
            if(varargs.length-1 == count){
                myStringBuilder.append(v);

            }else{
                myStringBuilder.append(v + " ");

            }

        }
        System.out.println(myStringBuilder);
    }

}


