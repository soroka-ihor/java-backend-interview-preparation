package interview.java.core;

public class InnerNonStatic {
    // Static member variable of ClassA
    static int x = 10;

    int y = 20;
    public int z = 30;

    // Class 2 - Helper Class 2
    // Non-static nested class
    class ClassB {

        // Method of Non-static nested class
        void get()
        {
            // Execution command of get() method

            // Print and display commands
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("z: " + z);
        }
    }
}
