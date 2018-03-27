package cGenQExampleq;

import codingnomads.exceptions.QueueEmptyException;
import codingnomads.exceptions.QueueFullException;

/**
 * Created by ryandesmond on 3/21/18.
 */
public class GenericQueue <T> {

    // underlying datastructure
    private T[] queue;
    // indexes to control access
    private int getLocation, putLocation;

    // constructor that defines and instantiates the underlying datastructure
    public GenericQueue(int length) {
        this.queue = (T[]) new Object[length];
        getLocation = putLocation = 0;
    }

    /**
     * Common push method. Adds a given String to the Queue if the queue is not full
     *
     * @param val - The String to add to the queue
     * @throws QueueFullException
     */
    public void push(T val) throws QueueFullException {

        // if putLocation equals the size of the underlying array the queue is
        // throw exception
        if (putLocation == queue.length){
            throw new QueueFullException("Unable to add "
                    + val + " to the queue. The queue is " +
                    "full");
        }

        // otherwise add the String to the queue and increment the putLocation
        queue[putLocation++] = val;
    }

    /**
     * Common pop method to retrieve a String from the queue so long as the queue
     * is not empty
     *
     * @return - String - the value popped from the queue
     * @throws QueueEmptyException
     */
    public T pop() throws QueueEmptyException {

        // if the getLocation is equal to the putLocation the queue is empty - or
        // all values have already been popped
        if (getLocation == putLocation){
            throw new QueueEmptyException("Unable to pop the Queue. The queue is empty");
        }

        // otherwise return the String at the index of getLocation and increment
        // getLocation
        return queue[getLocation++];
    }

    // utility method to check if queue is empty before pop
    public boolean isEmpty(){
        return (getLocation == putLocation);
    }

    // utility method to check if the queue is full before push
    public boolean isFull(){
        return (putLocation == queue.length);
    }

    // utility method to search the queue for a given value
    public boolean contains(T val){

        for (T s : queue){
            if (s.equals(val)) {
                return true;
            }
        }
        return false;
    }
}