package MyDLL;

/**
 * This class contains test cases for the MyDLL class.
 * 
 * @author Patryk
 */
public class MyDLLTests {
    
    /**
     * Main method to execute the test cases.
     * 
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        testAddToFront();
        testAddToBack();
        testRemoveFirst();
        testRemoveLast();
        testSize();
    }
    
    /**
     * Test case for adding an element to the front of the list.
     */
    private static void testAddToFront() {
        MyDLL<Integer> list = new MyDLL<>();
        list.addToFront(1);
        list.addToFront(2);

        // Verify the list contains [2, 1]
        System.out.println("Add to Front Test: " + (list.toString().equals("[2, 1]") ? "Passed" : "Failed"));
    }
    
    /**
     * Test case for adding an element to the back of the list.
     */
    private static void testAddToBack() {
        MyDLL<Integer> list = new MyDLL<>();
        list.addToEnd(1);
        list.addToEnd(2);

        // Verify the list contains [1, 2]
        System.out.println("Add to Back Test: " + (list.toString().equals("[1, 2]") ? "Passed" : "Failed"));
    }
    
    /**
     * Test case for removing the first element from the list.
     */
    private static void testRemoveFirst() {
        MyDLL<Integer> list = new MyDLL<>();
        list.addToEnd(1);
        list.addToEnd(2);
        list.removeFromFront();

        // Verify the list contains [2]
        System.out.println("Remove First Test: " + (list.toString().equals("[2]") ? "Passed" : "Failed"));
    }
    
    /**
     * Test case for removing the last element from the list.
     */
    private static void testRemoveLast() {
        MyDLL<Integer> list = new MyDLL<>();
        list.addToEnd(1);
        list.addToEnd(2);
        list.removeFromEnd();

        // Verify the list contains [1]
        System.out.println("Remove Last Test: " + (list.toString().equals("[1]") ? "Passed" : "Failed"));
    }
    
    /**
     * Test case for getting the size of the list.
     */
    private static void testSize() {
        MyDLL<Integer> list = new MyDLL<>();
        list.addToEnd(1);
        list.addToEnd(2);

        // Verify the size is 2
        System.out.println("Size Test: " + (list.size() == 2 ? "Passed" : "Failed"));
    }
}
