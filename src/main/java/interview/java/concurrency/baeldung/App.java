package interview.java.concurrency.baeldung;

import interview.java.concurrency.Data;

public class App {
    public static void main(String[] args) {
        Data data = new ExData();

        data.data();
    }

    static class ExData extends interview.java.concurrency.Data {
        public void data() {
            System.out.println(this.getClass());
        }
    }
}
