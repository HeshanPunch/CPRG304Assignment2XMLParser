package MyDLL;

/**
 * Doubly Linked List class.
 *
 * @param <E> the type of elements in the list.
 * 
 * Author Patryk
 */
public class MyDLL<E> {
    private MyDLLNode<E> head;
    private MyDLLNode<E> tail;
    private int size;

    public MyDLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

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
