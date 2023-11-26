/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MyArrayList;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

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
        Integer toAdd = null;
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
        Object toAdd = 1;
        MyArrayList<Object> objInstance = new MyArrayList<>();
        objInstance.add(toAdd);
        boolean expResult = true;
        boolean result = objInstance.add(toAdd);
        assertEquals(expResult, result);

    }

    /**
     * Test of addAll method, of class MyArrayList.
     */
    @Test
    public void testAddAll() {
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(2);
        list1.add(18);
        list1.add(7);

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(22);
        list2.add(118);

        int expecteTotalSize = 5;
        int size = list1.size() + list2.size();
        boolean expResult = true;
        boolean result = list1.addAll(list2);
        assertEquals(expResult, result);
        assertEquals(expecteTotalSize, size);
    }

    /**
     * Test of get method, of class MyArrayList.
     */
    @Test
    public void testGet() {
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(2);
        list1.add(18);
        list1.add(7);
        int index = 1;
        Object expResult = 18;
        Object result = list1.get(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class MyArrayList.
     */
    @Test
    public void testRemove_int() {
        int index = 1;
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(2);
        list1.add(18);
        list1.add(7);
        Object expResult = 18;
        Object result = instance.remove(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of set method, of class MyArrayList.
     */
    @Test
    public void testSet() {
        int index = 1;
        int toChange = 780403;
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(2);
        list1.add(18);
        list1.add(7);

        Object expResult = 18;
        Object result = instance.set(index, toChange);
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class MyArrayList.
     */
    @Test
    public void testIsEmpty() {
        MyArrayList<Integer> nonEmptyList = new MyArrayList<>();
        nonEmptyList.add(2);
        nonEmptyList.add(18);
        nonEmptyList.add(7);

        MyArrayList<Integer> emptyList = new MyArrayList<>();

        boolean nonEmptyListExpResult = false;
        boolean emptyListExpResult = true;

        boolean nonEmptyListResult = nonEmptyList.isEmpty();
        boolean emptyListResult = emptyList.isEmpty();

        assertEquals(nonEmptyListExpResult, nonEmptyListResult);
        assertEquals(emptyListExpResult, emptyListResult);
    }

    /**
     * Test of contains method, of class MyArrayList.
     */
    @Test
    public void testContains() {
        int toFindNone = 780403;
        int toFind = 18;
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(2);
        list1.add(18);
        list1.add(7);

        boolean expResult = true;
        boolean result = instance.contains(toFind);
        assertEquals(expResult, result);

        expResult = false;
        boolean result2 = instance.contains(toFindNone);
        assertEquals(expResult, result2);

    }

    /**
     * Test of toArray method, of class MyArrayList.
     */
    @Test
    public void testToArray() {
        Object[] toHold = new Object[3];
        MyArrayList<Object> list1 = new MyArrayList<>();
        list1.add(2);
        list1.add(18);
        list1.add(7);
        Object[] expResult = { 2, 18, 7 };
        Object[] result = list1.toArray(toHold);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of iterator method, of class MyArrayList.
     */
    @Test
    public void testIterator() {
        MyArrayList<Object> instance = new MyArrayList<>();
        Iterator result = instance.iterator();
        assertNotNull(result);
    }

}
