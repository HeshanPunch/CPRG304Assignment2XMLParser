package MyDLL;

/**
 * Node class for a Doubly Linked List.
 *
 * This class represents a node in a doubly linked list, containing an element
 * of type E. Each node maintains references to the previous and next nodes,
 * allowing traversal in both directions.
 *
 * @param <E> the type of elements in the node.
 * 
 * @author Patryk
 */
public class MyDLLNode<E> {
    private E element;
    private MyDLLNode<E> previous;
    private MyDLLNode<E> next;

    /**
     * Constructs a node with the specified element.
     *
     * @param element the element to be stored in the node.
     */
    public MyDLLNode(E element) {
        this.element = element;
        this.previous = null;
        this.next = null;
    }

    /**
     * Returns the element stored in the node.
     *
     * @return the element in the node.
     */
    public E getElement() {
        return element;
    }

    /**
     * Returns the previous node in the doubly linked list.
     *
     * @return the previous node, or null if no previous node exists.
     */
    public MyDLLNode<E> getPrevious() {
        return previous;
    }

    /**
     * Sets the previous node for this node.
     *
     * @param previous the node to be set as the previous node.
     */
    public void setPrevious(MyDLLNode<E> previous) {
        this.previous = previous;
    }

    /**
     * Returns the next node in the doubly linked list.
     *
     * @return the next node, or null if no next node exists.
     */
    public MyDLLNode<E> getNext() {
        return next;
    }

    /**
     * Sets the next node for this node.
     *
     * @param next the node to be set as the next node.
     */
    public void setNext(MyDLLNode<E> next) {
        this.next = next;
    }
}
