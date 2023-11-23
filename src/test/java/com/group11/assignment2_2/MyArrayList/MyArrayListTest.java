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
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class MyArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MyArrayList<Object> instance = new MyArrayList<>();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of clear method, of class MyArrayList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
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
        System.out.println("add");
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
        System.out.println("add null");
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
        System.out.println("add");
        int toAdd = 1;
        MyArrayList<Integer> instance = new MyArrayList<>();

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
        System.out.println("addAll");
        ListADT toAdd = null;
        MyArrayList instance = new MyArrayList<>();
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
        System.out.println("get");
        int index = 0;
        MyArrayList instance = new MyArrayList();
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
        System.out.println("remove");
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
        System.out.println("remove");
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
        System.out.println("set");
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
        System.out.println("isEmpty");
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
        System.out.println("contains");
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
        System.out.println("toArray");
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
        System.out.println("toArray");
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
        System.out.println("iterator");
        MyArrayList instance = new MyArrayList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
