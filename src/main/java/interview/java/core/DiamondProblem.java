package interview.java.core;

public class DiamondProblem {

    interface Parent1 {
        void fun();
    }

    // Parent Class2
    interface Parent2 {
        void fun();
    }

    // Inherting the Properties from
    // Both the classes
    class test implements Parent1, Parent2 {

        @Override
        public void fun() {

        }
    }

}
