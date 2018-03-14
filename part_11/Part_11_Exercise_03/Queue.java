package part_11.Part_11_Exercise_03;

/**
 * Modify your Queue Class so that it is completely generic
 */
class Queue <T>{
    private T[] q; // this array holds the queue
    private int putloc;
    private int getloc; // the put and get indices


    Queue(T[] q) {
        putloc = getloc = 0;
        this.q = q;
    }
    // put a int into the queue
    void put(T val) {
        if(putloc==q.length) {
            System.out.println(" – Queue is full.");
            return;
        }
        q[putloc++] = val;
    }
    // get a int from the queue
    T get() {

        if(getloc == putloc) {
            System.out.println(" – Queue is empty.");
            return null;
        }
        return q[getloc++];
    }
}