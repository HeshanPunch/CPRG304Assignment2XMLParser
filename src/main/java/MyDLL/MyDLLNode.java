package MyDLL;

/**
 * Node class for a Doubly Linked List.
 *
 * @param <E> the type of elements in the node.
 * 
 * Author Patryk
 */
public class MyDLLNode<E> {
    private E element;
    private MyDLLNode<E> previous;
    private MyDLLNode<E> next;

    public MyDLLNode(E element) {
        this.element = element;
        this.previous = null;
        this.next = null;
    }

    public E getElement() {
        return element;
    }

    public MyDLLNode<E> getPrevious() {
        return previous;
    }

    public void setPrevious(MyDLLNode<E> previous) {
        this.previous = previous;
    }

    public MyDLLNode<E> getNext() {
        return next;
    }

    public void setNext(MyDLLNode<E> next) {
        this.next = next;
    }
}
