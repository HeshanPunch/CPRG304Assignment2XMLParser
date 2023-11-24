package MyDLL;

/**
 * Doubly Linked List class.
 *
 * This class represents a doubly linked list data structure, where each node
 * contains an element of type E. The list maintains references to the head and
 * tail nodes, allowing efficient addition and removal of elements from both
 * ends. The size of the list is also tracked for convenience.
 *
 * @param <E> the type of elements in the list.
 * 
 * @author Patryk
 */
public class MyDLL<E> {
    private MyDLLNode<E> head;
    private MyDLLNode<E> tail;
    private int size;

    /**
     * Constructs an empty doubly linked list.
     */
    public MyDLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Checks if the doubly linked list is empty.
     *
     * @return true if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the current size of the doubly linked list.
     *
     * @return the size of the list.
     */
    public int size() {
        return size;
    }

    /**
     * Adds an element to the front of the doubly linked list.
     *
     * @param element the element to be added to the front.
     */
    public void addToFront(E element) {
        MyDLLNode<E> newNode = new MyDLLNode<>(element);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }

    /**
     * Adds an element to the end of the doubly linked list.
     *
     * @param element the element to be added to the end.
     */
    public void addToEnd(E element) {
        MyDLLNode<E> newNode = new MyDLLNode<>(element);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    /**
     * Removes and returns the element from the front of the doubly linked list.
     *
     * @return the element removed from the front, or null if the list is empty.
     */
    public E removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        E removedElement = head.getElement();
        head = head.getNext();

        if (head != null) {
            head.setPrevious(null);
        } else {
            tail = null; // The list is empty now
        }

        size--;
        return removedElement;
    }

    /**
     * Removes and returns the element from the end of the doubly linked list.
     *
     * @return the element removed from the end, or null if the list is empty.
     */
    public E removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        E removedElement = tail.getElement();
        tail = tail.getPrevious();

        if (tail != null) {
            tail.setNext(null);
        } else {
            head = null; // The list is empty now
        }

        size--;
        return removedElement;
    }
}
