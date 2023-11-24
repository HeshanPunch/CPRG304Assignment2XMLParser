package MyArrayList;

import java.util.Iterator;

/**
 *
 * @author hesha
 */
@SuppressWarnings("unchecked")
public class MyArrayList<E> implements ListADT<E>, Iterable<E> {
    private static final int DEFAULT_CAPACITY = 24;
    private E[] data;
    private int size;

    // constructor
    public MyArrayList() {
        this.data = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyArrayList(int capacity) {
        this.data = (E[]) new Object[capacity];
        this.size = 0;
    }

    /**
     * The size method will return the current element count contained
     * in the list.
     *
     * @return The current element count.
     * @throws java.lang.UnsupportedOperationException
     */

    @Override
    public int size() {
        return this.size;
    }

    /**
     * Removes all of the elements from this list. This list will be empty after
     * this call returns.
     */
    @Override
    public void clear() {
        this.data = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;

    }

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     * 
     * @param index
     *              The index at which the specified element is to be inserted.
     *              The element is inserted before the existing element at [index],
     *              or at the end if index is equal to the
     *              size (<code>size()</code>).
     * @param toAdd
     *              The element to be inserted.
     * @return <code>true</code> if the element is added successfully.
     * @throws NullPointerException
     *                                   If the specified element is
     *                                   <code>null</code> and the
     *                                   list implementation does not support having
     *                                   <code>null</code> elements.
     * @throws IndexOutOfBoundsException
     *                                   If the index is out of range:
     *                                   i.e.
     *                                   (<code>index < 0 || index > size()</code>).
     */
    @Override
    public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (toAdd == null) {
            throw new NullPointerException("Cannot add element of type null");
        }

        if (size() == this.data.length) {
            E[] temp = (E[]) new Object[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[i];
            }
            this.data = temp;
        }

        for (int i = size(); i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[index] = toAdd;
        size++;
        return true;

    }

    /**
     * Appends the specified element to the end of this list.
     * Implementations that support this operation may place limitations
     * on what elements may be added to this list. In particular, some
     * implementations will refuse to add <code>null</code> elements.
     * List classes should clearly specify in their
     * documentation any restrictions on what elements may be added.
     * 
     * @param toAdd
     *              Element to be appended to this list.
     * @return true if element is appended successfully.
     * @throws NullPointerException
     *                              If the specified element is <code>null</code>
     *                              and the list
     *                              implementation does not support having
     *                              <code>null</code>
     *                              elements.
     */
    @Override
    public boolean add(E toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException("Cannot add element of type null");
        }

        if (size() == this.data.length) {
            E[] temp = (E[]) new Object[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[i];
            }
            this.data = temp;
        }

        this.data[size()] = toAdd;
        size++;
        return true;
    }

    /**
     * Appends all of the elements in the specified
     * <code>java.utilCollection</code> to the end of
     * this list, in the order that they are returned by the specified
     * collection's <code>Iterator</code>. The behaviour of this operation
     * is unspecified if the specified collection is modified while the
     * operation is in progress. (Note that this will occur if the
     * specified collection is this list, and it's nonempty.)
     * 
     * @param toAdd
     *              The new sub list to be added.
     * @return true
     *         If the operation is successful.
     * @throws NullPointerException
     *                              If the specified element is <code>null</code>
     *                              and the
     *                              list implementation does not support having
     *                              <code>null</code> elements.
     */
    @Override
    public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException, IllegalArgumentException {

        if (toAdd == null) {
            throw new NullPointerException("Cannot add elements from a null list");
        }

        if (toAdd.size() == 0) {
            return false;
        }

        // check toAdd is instance of iterator
        if (toAdd instanceof Iterable) {
            for (E element : (Iterable<? extends E>) toAdd) {
                add(element);
            }
            return true;
        } else {
            throw new IllegalArgumentException("Cannot add elements from a non-iterator list");
        }

    }

    /**
     * Returns the element at the specified position in this list.
     * 
     * @param index
     *              Index of element to return.
     * @return The element at the specified position in this list.
     * @throws IndexOutOfBoundsException
     *                                   If the index is out of range:
     *                                   i.e.
     *                                   (<code>index < 0 || index >= size()</code>).
     */
    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounds. Argument: " + index);
        }

        return this.data[index];
    }

    /**
     * Removes the element at the specified position in this list. Shifts any
     * subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     * 
     * @param index
     *              The index of the element to remove.
     * @return The removed element.
     * @throws IndexOutOfBoundsException
     *                                   If the index is out of range:
     *                                   i.e.
     *                                   (<code>index < 0 || index >= size()</code>).
     */
    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounds. Argument: " + index);
        }

        E removed = this.data[index];
        for (int i = index; i < size() - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[size() - 1] = null;
        size--;
        return removed;
    }

    /**
     * Removes the first occurrence in this list of the specified element. If
     * this list does not contain the element, it is unchanged. More formally,
     * removes the element with the lowest index <code>i</code> such that
     * <code>o.equals(get(i))</code> (if such an element exists).
     * 
     * @param toRemove
     *                 The element to be removed from this list.
     * @return The element which is being removed, or null if the list does
     *         not contain the element.
     * @throws NullPointerException
     *                              If the specified element is <code>null</code>
     *                              and the
     *                              list implementation does not support having
     *                              <code>null</code> elements.
     */
    @Override
    public E remove(E toRemove) throws NullPointerException {
        if (toRemove == null) {
            throw new NullPointerException("Cannot remove element of type null, silly goose :)");
        }

        for (int i = 0; i < size(); i++) {
            if (this.data[i].equals(toRemove)) {
                return remove(i);
            }
        }

        return null;
    }

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     * 
     * @param index
     *                 The index of the element to replace.
     * @param toChange
     *                 Element to be stored at the specified position.
     * @return The element previously at the specified position.
     * @throws NullPointerException
     *                                   If the specified element is
     *                                   <code>null</code> and the
     *                                   list implementation does not support having
     *                                   <code>null</code> elements.
     * @throws IndexOutOfBoundsException
     *                                   If the index is out of range:
     *                                   i.e.
     *                                   (<code>index < 0 || index >= size()</code>).
     */
    @Override
    public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException {

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounds. Argument: " + index);
        }

        if (toChange == null) {
            throw new NullPointerException("Cannot add element of type null, silly goose :)");
        }

        E old = this.data[index];
        this.data[index] = (E) toChange;
        return old;
    }

    /**
     * Returns <code>true</code> if this list contains no elements.
     * 
     * @return <code>true</code> if this list contains no elements.
     */
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    /**
     * Returns true if this list contains the specified element. More formally,
     * returns true if and only if this list contains at least one
     * element <code>e</code> such that <code>toFind.equals(e)</code>.
     * 
     * @param toFind
     *               The element whose presence in this list is to be tested.
     * @return <code>true</code> if this list contains the specified element.
     * @throws NullPointerException
     *                              If the specified element is <code>null</code>
     *                              and the
     *                              list implementation does not support having
     *                              <code>null</code> elements.
     */
    @Override
    public boolean contains(E toFind) throws NullPointerException {
        if (toFind == null) {
            throw new NullPointerException("Cannot find element of type null, silly goose :)");
        }

        for (int i = 0; i < size(); i++) {
            if (this.data[i].equals(toFind)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence; the runtime type of the returned array is that of the specified
     * array. Obeys the general contract of the
     * <code>java.util.Collection.toArray(Object [])</code> method.
     * 
     * @param toHold
     *               The array into which the elements of this list are to be
     *               stored, if it is big enough; otherwise, a new array of the
     *               same runtime type is allocated for this purpose.
     * @return An array containing the elements of this list.
     * @throws NullPointerException
     *                              If the specified array is <code>null</code>.
     */
    @Override
    public E[] toArray(E[] toHold) throws NullPointerException {
        if (toHold == null) {
            throw new NullPointerException("Cannot add elements to a null array, silly goose :)");
        }

        if (toHold.length < this.size()) {
            toHold = (E[]) new Object[this.size()];
        } else {
            toHold = (E[]) new Object[toHold.length];
        }

        for (int i = 0; i < size(); i++) {
            toHold[i] = this.data[i];
        }

        return toHold;
    }

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence. Obeys the general contract of the
     * <code>java.util.Collection.toArray()</code> method.
     * 
     * @return An array containing all of the elements in this list in proper
     *         sequence.
     */
    @Override
    public E[] toArray() {
        E[] temp = (E[]) new Object[size()];
        for (int i = 0; i < size(); i++) {
            temp[i] = this.data[i];
        }
        return temp;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size();
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new UnsupportedOperationException("Element does not exist");
                }

                return data[currentIndex++];
            }
        };
    }

}
