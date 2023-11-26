package MyStack;

public class MyStackNode<E> {
    E data;
    MyStackNode<E> next;

    public MyStackNode(E data) {
        this.data = data;
        this.next = null;
    }

}
