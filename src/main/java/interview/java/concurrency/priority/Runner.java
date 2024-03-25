package interview.java.concurrency.priority;

import java.util.stream.IntStream;

public class Runner {
    private static final String MESSAGE_TEMPLATE_THREAD_NAME = "%s : %d\n";
    private static final String MAIN_FINISHED = "Main thread been finished.";
    public static void main(String[] args) {
        Thread thread0 = new Thread(new Task());
        thread0.setPriority(10);
        thread0.start();
        System.out.println(MAIN_FINISHED);
    }

    private static void printNameAndPrio(Thread thread) {
        System.out.printf(
                MESSAGE_TEMPLATE_THREAD_NAME, Thread.currentThread().getName(),
                Thread.currentThread().getPriority()
        );
    }

    private static class Task implements Runnable {
        @Override
        public void run() {
            IntStream.range(0, 5).forEach(
                    System.out::println
            );
        }
    }
}
