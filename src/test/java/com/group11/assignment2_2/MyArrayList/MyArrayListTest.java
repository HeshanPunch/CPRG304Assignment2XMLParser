/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.group11.assignment2_2.MyArrayList;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hesha
 */
public class MyArrayListTest {
    private MyArrayList<Integer> instance;
    int instanceSize = 0;

    public MyArrayListTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new MyArrayList<>();
        instance.add(2);
        instance.add(18);
        instanceSize = 2;

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class MyArrayList.
     */
    @Test
    public void testSize() {
        int expResult = instanceSize;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of clear method, of class MyArrayList.
     */
    @Test
    public void testClear() {
        MyArrayList<Object> instance = new MyArrayList<>();
        instance.clear();
        int result = instance.size();
        int expSize = 0;
        assertEquals(expSize, result);
    }

    /**
     * Test of add method, of class MyArrayList.
     */
    @Test
    public void testAdd_int_Object() {
        int index = 0;
        int toAdd = 780403;
        MyArrayList<Integer> instance = new MyArrayList<>();
        instance.add(2);
        instance.add(18);
        instance.add(7);

        boolean expResult = true;
        boolean result = instance.add(index, toAdd);
        assertEquals(expResult, result);

        int value = instance.get(index);
        assertEquals(toAdd, value);
    }

    /**
     * Test of add method, of class MyArrayList.
     * NullPointerException
     */
    @Test
    public void testAdd_Null() {
        MyArrayList<Integer> instance = new MyArrayList<>();
        instance.add(2);
        instance.add(18);
        int index = 1;
        Integer toAdd = null;
        instance.add(index, toAdd);
        assertThrows(NullPointerException.class, () -> {
            instance.add(toAdd);
        });

    }

    /**
     * Test of add method, of class MyArrayList.
     * NullPointerException
     */
    @Test
    public void testAdd_Object() {
        int toAdd = 1;
        instance.add(toAdd);
        boolean expResult = true;
        boolean result = instance.add(toAdd);
        assertEquals(expResult, result);

    }

    /**
     * Test of addAll method, of class MyArrayList.
     */
    @Test
    public void testAddAll() {
        ListADT toAdd = null;
        boolean expResult = false;
        boolean result = instance.addAll(toAdd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class MyArrayList.
     */
    @Test
    public void testGet() {
        int index = 0;
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class MyArrayList.
     */
    @Test
    public void testRemove_int() {
        int index = 0;
        MyArrayList instance = new MyArrayList();
        Object expResult = null;
        Object result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class MyArrayList.
     */
    @Test
    public void testRemove_Object() {
        Object toRemove = null;
        MyArrayList instance = new MyArrayList();
        Object expResult = null;
        Object result = instance.remove(toRemove);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class MyArrayList.
     */
    @Test
    public void testSet() {
        int index = 0;
        Object toChange = null;
        MyArrayList instance = new MyArrayList();
        Object expResult = null;
        Object result = instance.set(index, toChange);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class MyArrayList.
     */
    @Test
    public void testIsEmpty() {
        MyArrayList instance = new MyArrayList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class MyArrayList.
     */
    @Test
    public void testContains() {
        Object toFind = null;
        MyArrayList instance = new MyArrayList();
        boolean expResult = false;
        boolean result = instance.contains(toFind);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class MyArrayList.
     */
    @Test
    public void testToArray_ObjectArr() {
        Object[] toHold = null;
        MyArrayList instance = new MyArrayList();
        Object[] expResult = null;
        Object[] result = instance.toArray(toHold);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class MyArrayList.
     */
    @Test
    public void testToArray_0args() {
        MyArrayList instance = new MyArrayList();
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class MyArrayList.
     */
    @Test
    public void testIterator() {
        MyArrayList instance = new MyArrayList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
