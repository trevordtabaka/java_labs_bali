package cGenQExampleq;



import codingnomads.cats.Cat;
import codingnomads.exceptions.QueueEmptyException;
import codingnomads.exceptions.QueueFullException;

/**
 * Created by ryandesmond on 3/21/18.
 */
public class QueueController {

    public static void main(String[] args) {
        GenericQueue<String> sQueue = new GenericQueue(5);
        System.out.println("Pushing...");
        try {
            sQueue.push("Trevor");
            sQueue.push("Ivan");
            sQueue.push("Matt");
            sQueue.push("Hannah");
            sQueue.push("Val");
            sQueue.push("Kezia");
        } catch (QueueFullException e) {
            e.printStackTrace();
        }

        System.out.println("Popping...");
        while(!sQueue.isEmpty()){
            try {
                System.out.println(sQueue.pop());
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }

        GenericQueue<Cat> catQ = new GenericQueue(3);
        Cat jade = new Cat("Jade", 1, 10);
        Cat maggie = new Cat("Maggie", 14, 15);
        Cat leander = new Cat("Leander", 16, 9);
        Cat pizza = new Cat("Pizza", 1, 10);

        try {
            catQ.push(jade);
            catQ.push(maggie);
            catQ.push(leander);
            //if (!catQ.isFull()) {
            catQ.push(pizza);
            //}
        } catch (QueueFullException e) {
            e.printStackTrace();
        }

        while(!catQ.isEmpty()){
            try {
                System.out.println(catQ.pop().toString());
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }
    }

}