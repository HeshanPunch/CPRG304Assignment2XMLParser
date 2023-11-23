package com.group11.assignment2_2.MyArrayList;

import java.util.Iterator;

/**
 *
 * @author hesha
 */
public class MyArrayList<E> implements ListADT<E> {
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
	 * 			Element to be appended to this list.
	 * @return true if element is appended successfully.
	 * @throws NullPointerException
	 * 			If the specified element is <code>null</code> and the list
	 * 			implementation does not support having <code>null</code>
	 * 			elements.
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

    @Override
    public boolean addAll(ListADT toAdd) throws NullPointerException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E remove(Object toRemove) throws NullPointerException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E set(int index, Object toChange) throws NullPointerException, IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean contains(Object toFind) throws NullPointerException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E[] toArray(Object[] toHold) throws NullPointerException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
