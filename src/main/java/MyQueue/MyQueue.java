package MyQueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * A simple implementation of a generic queue using an ArrayList.
 *
 * @author Patryk
 * @param <E> The type of elements in the queue.
 */
public class MyQueue<E> implements QueueADT<E> {
    private ArrayList<E> queue;

    /**
     * Constructs an empty queue.
     */
    public MyQueue() {
        this.queue = new ArrayList<>();
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param toAdd The element to be added.
     * @throws NullPointerException If the specified element is null.
     */
    @Override
    public void enqueue(E toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException("Cannot enqueue element of type null");
        }
        queue.add(toAdd);
    }

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return The element removed from the front of the queue.
     */
    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null; // Or throw an exception based on your requirements
        }
        return queue.remove(0);
    }

    /**
     * Returns the element at the front of the queue without removing it.
     *
     * @return The element at the front of the queue.
     */
    @Override
    public E peek() {
        if (isEmpty()) {
            return null; // Or throw an exception based on your requirements
        }
        return queue.get(0);
    }

    /**
     * Removes all elements from the queue.
     */
    @Override
    public void dequeueAll() {
        queue.clear();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Returns an iterator over the elements in the queue.
     *
     * @return An iterator over the elements in the queue.
     */
    @Override
    public Iterator<E> iterator() {
        return queue.iterator();
    }

    /**
     * Compares this queue with another queue for equality.
     * Two queues are considered equal if they have the same elements in the same
     * order.
     *
     * @param that The queue to compare with.
     * @return true if the queues are equal, false otherwise.
     */
    @Override
    public boolean equals(QueueADT<E> that) {
        if (that == null) {
            return false;
        }

        // Check if the sizes are the same
        if (this.size() != that.size()) {
            return false;
        }

        // Check each element one by one
        Iterator<E> thisIterator = this.iterator();
        Iterator<E> thatIterator = that.iterator();

        while (thisIterator.hasNext() && thatIterator.hasNext()) {
            E thisElement = thisIterator.next();
            E thatElement = thatIterator.next();

            // Compare the elements
            if (!Objects.equals(thisElement, thatElement)) {
                return false;
            }
        }

        // If all elements are equal, return true
        return true;
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return The number of elements in the queue.
     */
    @Override
    public int size() {
        return queue.size();
    }

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence. Obeys the general contract of the Collection.toArray method.
     * 
     * @return an array containing all of the elements in this list in proper
     *         sequence.
     */
    @Override
    public Object[] toArray() {
        return this.queue.toArray();
    }

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence; the runtime type of the returned array is that of the specified
     * array. Obeys the general contract of the Collection.toArray(Object[])
     * method.
     * 
     * @param holder
     * @return an array containing the elements of this queue.
     * @throws NullPointerException
     *                              if the specified array is null.
     */
    @Override
    public E[] toArray(E[] holder) throws NullPointerException {
        return this.queue.toArray(holder);
    }

    /**
     * (Optional Method) Returns true if the number of items in the queue
     * equals the length. This operation is only implement when a fixed length
     * queue is required.
     * 
     * @return <code>true</code> if queue is at capacity.
     */
    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }
}