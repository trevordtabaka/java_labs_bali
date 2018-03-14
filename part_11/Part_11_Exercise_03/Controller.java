package part_11.Part_11_Exercise_03;

public class Controller <T>{

    public static void main(String[] args) {
        //implement Queue

        String[] strArray = {"x","y","z"};
        Queue myQueue = new Queue(strArray);

        // Populate Queue
        for (int i = 0; i <= 2; i++) {
            myQueue.put(strArray[i]);
        }
// Print even queue
        for (int x = 0; x <= 2; x++){
            Object qVal = myQueue.get();

                System.out.println(qVal);

        }

    }
}