/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MyQueue;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heshan
 */
public class MyQueueTest {

    public MyQueueTest() {
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
     * Test of enqueue method, of class MyQueue.
     */
    @Test
    public void testEnqueue() {
        MyQueue<Integer> instance = new MyQueue<>();
        Integer toAdd = 5;
        instance.enqueue(toAdd);
    }

    /**
     * Test of dequeue method, of class MyQueue.
     */
    @Test
    public void testDequeue() {
        MyQueue<Integer> instance = new MyQueue<>();
        instance.enqueue(5);
        instance.enqueue(6);
        instance.enqueue(7);

        int expectedSize = 3;
        assertEquals(expectedSize, instance.size());

        int result = instance.dequeue();
        int expResult = 5;

        assertEquals(expResult, result);

        expectedSize = 2;
        assertEquals(expectedSize, instance.size());

    }

    /**
     * Test of peek method, of class MyQueue.
     */
    @Test
    public void testPeek() {
        MyQueue<Integer> instance = new MyQueue<>();

        instance.enqueue(5);
        instance.enqueue(6);
        instance.enqueue(7);

        int result = instance.peek();
        int expResult = 5;
        assertEquals(expResult, result);

        int expectedSize = 3;
        assertEquals(expectedSize, instance.size());

    }

    /**
     * Test of dequeueAll method, of class MyQueue.
     */
    @Test
    public void testDequeueAll() {
        MyQueue<Integer> instance = new MyQueue<>();

        instance.enqueue(5);
        instance.enqueue(6);
        instance.enqueue(7);
        int expectedSize = 3;
        assertEquals(expectedSize, instance.size());

        instance.dequeueAll();

        expectedSize = 0;
        assertEquals(expectedSize, instance.size());
    }

    /**
     * Test of isEmpty method, of class MyQueue.
     */
    @Test
    public void testIsEmpty() {
        MyQueue<Integer> instance = new MyQueue<>();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

        instance.enqueue(5);
        instance.enqueue(6);

        expResult = false;
        result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of iterator method, of class MyQueue.
     */
    @Test
    public void testIterator() {
        MyQueue<Integer> instance = new MyQueue<>();

        Iterator<Integer> result = instance.iterator();
        assertNotNull(result);
    }

    /**
     * Test of equals method, of class MyQueue.
     */
    @Test
    public void testEquals() {
        MyQueue<Integer> thisQueue = new MyQueue<>();
        thisQueue.enqueue(5);
        thisQueue.enqueue(6);

        MyQueue<Integer> thatQueue = new MyQueue<>();
        thatQueue.enqueue(5);
        thatQueue.enqueue(6);

        boolean expResult = true;
        boolean result = thisQueue.equals(thatQueue);
        assertEquals(expResult, result);

        MyQueue<Integer> specialQueue = new MyQueue<>();
        specialQueue.enqueue(5234);
        specialQueue.enqueue(632);

        expResult = false;
        result = thisQueue.equals(specialQueue);
        assertEquals(expResult, result);

    }

    /**
     * Test of toArray method, of class MyQueue.
     */
    @Test
    public void testToArray() {
        MyQueue<Integer> instance = new MyQueue<>();
        instance.enqueue(5);
        instance.enqueue(6);

        Integer[] holder = new Integer[2];
        Integer[] result = instance.toArray(holder);
        Integer[] expResult = { 5, 6 };
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of size method, of class MyQueue.
     */
    @Test
    public void testSize() {
        MyQueue<Integer> instance = new MyQueue<>();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

        instance.enqueue(5);
        instance.enqueue(6);
        
        expResult = 2;
        result = instance.size();
        assertEquals(expResult, result);
    }

}
