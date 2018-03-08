package part_04.Exercise_06;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */
class Queue{
        private int q[]; // this array holds the queue
        private int putloc;
        private int getloc; // the put and get indices


    Queue(int size) {
        q = new int[size]; // allocate memory for queue
        putloc = getloc = 0;
    }
    // put a int into the queue
    void put(int val) {
        if(putloc==q.length) {
            System.out.println(" – Queue is full.");
            return;
        }
        q[putloc++] = val;
    }
    // get a int from the queue
    int get() {
        if(getloc == putloc) {
            System.out.println(" – Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}