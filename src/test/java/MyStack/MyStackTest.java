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
 * @author hesha
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
     * Test of toArray method, of class MyStack.
     */
    @Test
    public void testToArray_ObjectArr() {
        System.out.println("toArray");
        Object[] holder = null;
        MyStack instance = new MyStack();
        Object[] expResult = null;
        Object[] result = instance.toArray(holder);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class MyStack.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object toFind = null;
        MyStack instance = new MyStack();
        boolean expResult = false;
        boolean result = instance.contains(toFind);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class MyStack.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Object toFind = null;
        MyStack instance = new MyStack();
        int expResult = 0;
        int result = instance.search(toFind);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class MyStack.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        MyStack instance = new MyStack();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class MyStack.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        StackADT that = null;
        MyStack instance = new MyStack();
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class MyStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MyStack instance = new MyStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
