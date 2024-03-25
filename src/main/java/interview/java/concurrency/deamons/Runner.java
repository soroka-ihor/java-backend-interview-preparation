package interview.java.concurrency.deamons;

import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("asd");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static class Task implements Runnable {

        @Override
        public void run() {
            while (true) {
                System.out.println("I'm working.");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
