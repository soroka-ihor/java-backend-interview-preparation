package interview.java.concurrency.threadlocal;

import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args) {
        Thread thread0 = new Thread(new Task());
        Thread thread01 = new Thread(new Task());
        thread0.start();
        thread01.start();
    }

    private static class Task implements Runnable {
        private ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> new Integer(123));

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.printf("%s : %d\n", Thread.currentThread().getName(), this.threadLocal.get());
                    threadLocal.set(threadLocal.get() + 1);
                    TimeUnit.SECONDS.sleep(2);
                }
            } catch (InterruptedException e) {

            }
        }
    }
}
