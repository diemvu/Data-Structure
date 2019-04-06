/**
 * 
 */

package tests;

import static org.junit.Assert.*;

import exceptions.EmptyCollectionException;
import org.junit.Before;
import org.junit.Test;
import structures.LinkedOutputRestrictedDeque;

/**
 * @author Diem Vu
 * @version Winter 2019
 */
public class LinkedOutputRestrictedDequeTest {

    /**
     * 
     */
    private LinkedOutputRestrictedDeque<Integer> myQueue;

    /**
     * 
     */
    LinkedOutputRestrictedDequeTest() {

    }

    /**
     * @throws java.lang.Exception nothing.
     */
    @Before
    public void setUp() throws Exception {
        myQueue = new LinkedOutputRestrictedDeque<>();
    }

    /**
     * Test method for {@link structures.LinkedQueue#LinkedQueue()}.
     */
    @Test
    public void testLinkedQueue() {
        assertNotNull("Queue is not instantiated", myQueue);
        assertEquals("My Queue should be size 0", 0, myQueue.size());
        assertTrue("My Queue should be empty", myQueue.isEmpty());
        assertEquals("My Queue should be empty", "Empty Queue", myQueue.toString());
    }

    /**
     * Test method for
     * {@link structures.LinkedOutputRestrictedDeque#enqueAtFront(java.lang.Object)}.
     */
    @Test
    public void testEnqueAtFront() {
        myQueue.enqueAtFront(1);
        assertEquals("MyQueue should be size 1", 1, myQueue.size());
        assertFalse("My Queue should not be empty", myQueue.isEmpty());
        assertEquals("my Queue is not enqueue right", "front -> 1", myQueue.toString());
        myQueue.enqueAtFront(0);
        assertEquals("my Queue is not enque right", "front -> 0, 1", myQueue.toString());
    }

    /**
     * Test method for {@link structures.LinkedQueue#enqueue(java.lang.Object)}.
     */
    @Test
    public void testEnqueue() {

        myQueue.enqueue(0);
        assertEquals("MyQueue should be size 1", 1, myQueue.size());
        assertFalse("My Queue should not be empty", myQueue.isEmpty());
        assertEquals("my Queue is not enque right", "front -> 0", myQueue.toString());
        myQueue.enqueue(1);
        assertEquals("my Queue is not enque right", "front -> 0, 1", myQueue.toString());

    }

    /**
     * Test method for {@link structures.LinkedQueue#dequeue()}.
     */
    @Test
    public void testDequeue() {
        for (int i = 1; i < 3; i++) {
            myQueue.enqueue(i);
        }
        myQueue.dequeue();
        assertEquals("MyQueue should be size 1", 1, myQueue.size());
        assertEquals("my Queue is not deque right", "front -> 2", myQueue.toString());
        assertFalse("My Queue should not be empty", myQueue.isEmpty());
        myQueue.dequeue();
        assertEquals("MyQueue should be size 0", 0, myQueue.size());
        assertEquals("my Queue is not deque right", "Empty Queue", myQueue.toString());
        assertTrue("My Queue should be empty", myQueue.isEmpty());

    }

    /**
     * Test method for {@link structures.LinkedQueue#dequeue()} exception.
     */
    @Test(expected = EmptyCollectionException.class)
    public void testEmptyDequeue() {
        System.out.println(myQueue.toString());
        myQueue.dequeue();
    }

    /**
     * Test method for {@link structures.LinkedQueue#first()}.
     */
    @Test
    public void testFirst() {
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        assertEquals("return the wrong value at front of the queue", 1, (int) myQueue.first());
    }

    /**
     * Test method for {@link structures.LinkedQueue#size()}.
     */
    @Test
    public void testSize() {
        assertEquals("MyQueue should be size 0", 0, myQueue.size());
        myQueue.enqueue(0);
        myQueue.enqueue(1);
        assertEquals("MyQueue should be size 2", 2, myQueue.size());
    }

    /**
     * Test method for {@link structures.LinkedQueue#isEmpty()}.
     */
    @Test
    public void testIsEmpty() {
        assertTrue("The queue should be empty", myQueue.isEmpty());
        myQueue.enqueue(0);
        myQueue.enqueue(1);
        assertFalse("The queue should not be empty", myQueue.isEmpty());
    }

    /**
     * Test method for {@link structures.LinkedQueue#toString()}.
     */
    @Test
    public void testToString() {
        assertEquals("my Queue does not print out the queue right", "Empty Queue",
                     myQueue.toString());
        myQueue.enqueue(1);
        assertEquals("my Queue does not print out the queue right", "front -> 1",
                     myQueue.toString());
        myQueue.enqueue(2);
        assertEquals("my Queue does not print out the queue right", "front -> 1, 2",
                     myQueue.toString());
    }

}
