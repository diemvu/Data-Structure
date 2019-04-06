/**
 * 
 */

package structures;

/**
 * @author Diem Vu
 * @version Winter 2019
 * @param <E>
 */
public interface OutputRestrictedDequeADT<E> extends QueueADT<E> {
    /**
     * @param theElement the element to add to the Queue.
     */
    void enqueAtFront(E theElement);
}
