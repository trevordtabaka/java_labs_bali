package part_04.Exercise_06;

public class Controller {

    public static void main(String[] args) {
        //implement Queue
        Queue myQueue = new Queue(101);

        // Populate Queue
        for (int i = 0; i <= 101; i++) {
            myQueue.put(i);
        }
// Print even queue
        for (int x = 0; x <= 101; x++){
            int qVal = myQueue.get();
            if (x % 2 == 0) {
                System.out.println(qVal);
            }
        }

    }
}
