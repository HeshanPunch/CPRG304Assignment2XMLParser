/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MyDLL;

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
public class MyDLLTest {

    public MyDLLTest() {
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
     * Test of isEmpty method, of class MyDLL.
     */
    @Test
    public void testIsEmpty() {
        MyDLL<Integer> instance = new MyDLL<>();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

        instance.addToFront(1);
        expResult = false;
        result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class MyDLL.
     */
    @Test
    public void testSize() {
        MyDLL<Integer> instance = new MyDLL<>();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

        instance.addToFront(1);
        expResult = 1;
        result = instance.size();
        assertEquals(expResult, result);

    }

    /**
     * Test of addToFront method, of class MyDLL.
     */
    @Test
    public void testAddToFront() {
        MyDLL<Integer> instance = new MyDLL<>();
        instance.addToFront(1);
        instance.addToFront(2);
        instance.addToFront(3);

        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);

        expResult = 3;
        result = instance.removeFromFront();
        assertEquals(expResult, result);

        expResult = 2;
        result = instance.removeFromFront();
        assertEquals(expResult, result);
    }

    /**
     * Test of addToEnd method, of class MyDLL.
     */
    @Test
    public void testAddToEnd() {
        MyDLL<Integer> instance = new MyDLL<>();
        instance.addToEnd(1);
        instance.addToEnd(2);
        instance.addToEnd(3);

        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);

        expResult = 3;
        result = instance.removeFromEnd();
        assertEquals(expResult, result);

        expResult = 2;
        result = instance.removeFromEnd();
        assertEquals(expResult, result);

    }

    /**
     * Test of removeFromFront method, of class MyDLL.
     */
    @Test
    public void testRemoveFromFront() {
        MyDLL<Integer> instance = new MyDLL<>();
        instance.addToFront(1);
        instance.addToFront(2);
        instance.addToFront(3);
        int result = instance.removeFromFront();
        int expResult = 3;
        assertEquals(expResult, result);

        result = instance.removeFromFront();
        expResult = 2;
        assertEquals(expResult, result);
    }

    /**
     * Test of removeFromEnd method, of class MyDLL.
     */
    @Test
    public void testRemoveFromEnd() {
        MyDLL<Integer> instance = new MyDLL<>();
        instance.addToEnd(1);
        instance.addToEnd(2);
        instance.addToEnd(3);

        int result = instance.removeFromEnd();
        int expResult = 3;
        assertEquals(expResult, result);

        result = instance.removeFromEnd();
        expResult = 2;
        assertEquals(expResult, result);
    }

}
