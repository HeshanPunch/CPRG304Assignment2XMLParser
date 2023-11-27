/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MyStack;

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
public class MyStackTest {

    public MyStackTest() {
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
     * Test of push method, of class MyStack.
     */
    @Test
    public void testPush() {
        String toAdd = "Apple";
        MyStack<String> instance = new MyStack<String>();
        instance.push("Facebook");
        instance.push("Google");
        instance.push(toAdd);
        String actualItemOnTop = instance.peek();
        assertEquals(toAdd, actualItemOnTop);
        int expectedSize = 3;
        int actualSize = instance.size();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of pop method, of class MyStack.
     */
    @Test
    public void testPop() {
        MyStack<String> instance = new MyStack<String>();
        instance.push("Kobe");
        instance.push("Lebron");
        instance.push("Jordan");
        int originalSize = instance.size();
        String expResult = "Jordan";
        String result = instance.pop();
        assertEquals(expResult, result);
        assertEquals(originalSize - 1, instance.size());

    }

    /**
     * Test of peek method, of class MyStack.
     */
    @Test
    public void testPeek() {
        MyStack<String> instance = new MyStack<String>();
        instance.push("Kobe");
        instance.push("Lebron");
        instance.push("Jordan");
        int originalSize = instance.size();

        String expResult = "Jordan";
        String result = instance.peek();
        assertEquals(expResult, result);
        assertEquals(originalSize, instance.size());

    }

    /**
     * Test of clear method, of class MyStack.
     */
    @Test
    public void testClear() {
        MyStack<String> instance = new MyStack<String>();
        instance.push("Kobe");
        instance.push("Lebron");
        instance.push("Jordan");
        assertEquals(3, instance.size());
        instance.clear();
        assertEquals(0, instance.size());

    }

    /**
     * Test of isEmpty method, of class MyStack.
     */
    @Test
    public void testIsEmpty_False() {
        MyStack<String> instance = new MyStack<String>();
        instance.push("Kobe");
        instance.push("Lebron");
        instance.push("Jordan");
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of isEmpty method, of class MyStack.
     */
    @Test
    public void testIsEmpty_True() {
        MyStack<String> instance = new MyStack<String>();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of toArray method, of class MyStack.
     */
    @Test
    public void testToArray() {
        MyStack<String> instance = new MyStack<String>();
        instance.push("Kobe");
        instance.push("Lebron");
        instance.push("Jordan");
        String[] expResult = { "Kobe", "Lebron", "Jordan" };

        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of contains method, of class MyStack.
     */
    @Test
    public void testContains_true() {
        MyStack<Integer> instance = new MyStack<Integer>();
        instance.push(24);
        instance.push(23);
        instance.push(6);
        boolean expResult = true;
        boolean result = instance.contains(24);
        assertEquals(expResult, result);

    }

    /**
     * Test of contains method, of class MyStack.
     */
    @Test
    public void testContains_false() {
        MyStack<Integer> instance = new MyStack<Integer>();
        instance.push(24);
        instance.push(23);
        instance.push(6);
        boolean expResult = false;
        boolean result = instance.contains(12);
        assertEquals(expResult, result);
    }

    /**
     * Test of search method, of class MyStack.
     */
    @Test
    public void testSearch() {
        MyStack<String> instance = new MyStack<String>();
        instance.push("Kobe");
        instance.push("Lebron");
        instance.push("Jordan");
        int expResult = 3;
        String toFind = "Kobe";
        int result = instance.search(toFind);
        assertEquals(expResult, result);
    }

    /**
     * Test of iterator method, of class MyStack.
     */
    @Test
    public void testIterator() {
        MyStack<Object> instance = new MyStack<Object>();

        Iterator<Object> result = instance.iterator();
        assertNotNull(result);
    }

    /**
     * Test of equals method, of class MyStack.
     */
    @Test
    public void testEquals() {
        MyStack<String> instance1 = new MyStack<String>();
        instance1.push("Kobe");
        instance1.push("Lebron");
        instance1.push("Jordan");

        MyStack<String> instance2 = new MyStack<String>();
        instance2.push("Kobe");
        instance2.push("Lebron");
        instance2.push("Jordan");

        boolean expResult = true;

        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class MyStack.
     */
    @Test
    public void testEquals_wrong_order() {
        MyStack<String> instance1 = new MyStack<String>();
        instance1.push("Kobe");
        instance1.push("Lebron");
        instance1.push("Jordan");

        MyStack<String> instance2 = new MyStack<String>();
        instance2.push("Jordan");
        instance2.push("Kobe");
        instance2.push("Lebron");

        boolean expResult = false;

        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class MyStack.
     */
    @Test
    public void testSize() {
        MyStack<String> instance = new MyStack<String>();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

        instance.push("Kobe");
        instance.push("Lebron");
        instance.push("Jordan");
        expResult = 3;
        result = instance.size();
        assertEquals(expResult, result);

    }

}
