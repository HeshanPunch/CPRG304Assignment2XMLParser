package MyStack;

import java.util.EmptyStackException;
import java.util.Iterator;

import MyArrayList.MyArrayList;

/**
 * MyStack Class
 * 
 * @author Heshan Punchihewa
 * @author Patry Rusak
 * 
 * @param <E>
 */
public class MyStack<E> implements StackADT<E> {

    // Assignment says:
    // Use your MyArrayList.java implementation as the underlying data structure
    private MyArrayList<E> list;

    public MyStack() {
        this.list = new MyArrayList<>();
    }

    /**
     * Pushes an item onto the top of this stack.
     * 
     * @param toAdd
     *              item to be pushed onto the top of the stack.
     * @throws NullPointerException when attempting to add a null element to
     *                              the stack.
     */
    @Override
    public void push(E toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException("ERROR: Cannot add null element to stack!!!");
        }

        this.list.add(toAdd);

    }

    /**
     * Removes the object at the top of this stack and returns that object as
     * the value of this function.
     * 
     * @return the item popped off the top of the stack.
     * @throws EmptyStackException
     *                             if there are not items in the stack.
     */
    @Override
    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return this.list.remove(list.size() - 1);

    }

    /**
     * Looks at the object at the top of this stack without removing it from the
     * stack.
     * 
     * @return the object at the top of this stack.
     * @throws EmptyStackException
     */
    @Override
    public E peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return this.list.get(list.size() - 1);
    }

    /**
     * Clears all the items from this Stack. This method returns, unless there
     * is an Exception (Runtime) thrown.
     */
    @Override
    public void clear() {
        this.list.clear();
    }

    /**
     * Returns <code>true</code> if this Stack contains no items.
     * 
     * @return <code>true</code> if this Stack contains no items.
     */
    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
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
        return this.list.toArray();

    }

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence; the runtime type of the returned array is that of the specified
     * array. Obeys the general contract of the Collection.toArray(Object[])
     * method.
     * 
     * @param toHold
     *               the array into which the elements of this stack are to be
     *               stored, if it is big enough; otherwise, a new array of the
     *               same runtime type is allocated for this purpose.
     * @return an array containing the elements of this stack.
     * @throws NullPointerException
     *                              if the specified array is null.
     */
    @Override
    public E[] toArray(E[] holder) throws NullPointerException {
        if (holder == null) {
            throw new NullPointerException("ERROR: Cannot add null element to stack!!!");
        }
        return this.list.toArray(holder);
    }

    /**
     * Returns true if this list contains the specified element. More formally,
     * returns true if and only if this list contains at least one element e
     * such that (o==null ? e==null : o.equals(e)).
     * 
     * @param toFind
     *               element whose presence in this list is to be tested.
     * @return true if this list contains the specified element.
     * @throws NullPointerException
     *                              if the specified element is null and this list
     *                              does not
     *                              support null elements.
     */
    @Override
    public boolean contains(E toFind) throws NullPointerException {
        if (toFind == null) {
            throw new NullPointerException("ERROR: Cannot find null element in stack!!!");
        }

        return this.list.contains(toFind);
    }

    /**
     * Returns the 1-based position where an object is on this stack. If the
     * object o occurs as an item in this stack, this method returns the
     * distance from the top of the stack of the occurrence nearest the top of
     * the stack; the topmost item on the stack is considered to be at distance
     * 1. The equals method is used to compare o to the items in this stack.
     * 
     * @param toFind
     *               the desired object.
     * @return the 1-based position from the top of the stack where the object
     *         is located; the return value -1 indicates that the object is not
     *         on the stack.
     */
    @Override
    public int search(E toFind) {
        if (toFind == null) {
            throw new NullPointerException("ERROR: Cannot find null element in stack!!!");
        }

        for (int i = this.size() - 1; i >= 0; i--) {
            if (toFind.equals(list.get(i))) {
                return i + 1;
            }
        }

        return -1;

    }

    /**
     * Returns an iterator over the elements in this stack in proper sequence.
     * 
     * @return an iterator over the elements in this stack in proper sequence.
     */
    @Override
    public Iterator<E> iterator() {
        return this.list.iterator();
    }

    /**
     * Used to compare two Stack ADT's. To be equal two stacks must contain
     * equal items appearing in the same order.
     * 
     * @param that the Stack ADT to be compared to this stack.
     * @return <code>true</code> if the stacks are equal.
     */
    @Override
    public boolean equals(StackADT<E> that) {
        if (that == null) {
            return false;
        }

        if (this.size() != that.size()) {
            return false;
        }

        Iterator<E> thisIterator = this.iterator();
        Iterator<E> thatIterator = that.iterator();

        while (thisIterator.hasNext()) {
            if (!thisIterator.next().equals(thatIterator.next())) {
                return false;
            }
        }

        return true;
    }

    /**
     * Returns the depth of the current stack as an integer value.
     * 
     * @return the current size to the stack as an integer.
     */
    @Override
    public int size() {
        return this.list.size();
    }

}
