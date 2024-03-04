package interview.java.core;

public class InnerStatic {

    static int x = 10;

    int y = 20;

    // Static variable with private
    // access modifier in ClassA
    private static int z = 30;

    // Class 2 - Nested static class
    // Helper Class 2
    class ClassB {

        // Method of nested static class
        void get()
        {
            // Execution statements whenever
            // function is called

            // Print and display commands
            System.out.println("x: " + x);
            System.out.println("z: " + z);
        }
    }

}
