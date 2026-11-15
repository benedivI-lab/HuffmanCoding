import java.util.LinkedList;
import java.util.Iterator;

public class PriorityQueue <E extends Comparable<? super E>>extends LinkedList<E> {
    private LinkedList<E> myList;
    
    public PriorityQueue() {
        myList = new LinkedList<E>();
    }

    /**    
     * pre: item != null
     * post: item is added to the queue based of priority
     * @param item is the item to be added to the queue
     */
    public void enqueue(E item) {
        if (item == null) {
            throw new IllegalArgumentException("parameter cannot be a null item");
        }
        int index = 0;
        Iterator<E> it = myList.iterator();
        while (index < myList.size() && item.compareTo(it.next()) >= 0) {
            index++;
        }
        myList.add(index, item);
    }

    /**    
     * pre: size() > 0
     * @return removes and returns item at the front of the queue (the item with the highest priority)
     */
    public E dequeue() {
        return myList.removeFirst();
    }

    /**    
     * pre: none
     * @return size of the queue
     */
    public int size() {
        return myList.size();
    }

    /**    
     * pre: none
     * @return string representation of the queue
     */
    public String toString() {
        return myList.toString();
    }


}
