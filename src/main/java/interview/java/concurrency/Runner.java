package interview.java.concurrency;

import java.util.stream.IntStream;

public class Runner {
    private static final int FROM_NUMBER_FIRST_THREAD = 1;
    private static final int TO_NUMBER_FIRST_THREAD = 500;
    private static final int FROM_NUMBER_SECOND_THREAD = 501;
    private static final int TO_NUMBER_SECOND_THREAD = 1000;

    public static void main(final String... args) {
        final TaskSummingNumbers firstTask = new TaskSummingNumbers(FROM_NUMBER_FIRST_THREAD, TO_NUMBER_FIRST_THREAD);
        final TaskSummingNumbers secondTask = new TaskSummingNumbers(FROM_NUMBER_SECOND_THREAD, TO_NUMBER_SECOND_THREAD);
        Thread firstThread = startThread(firstTask);
        Thread secondThread = startThread(secondTask);
        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {

        }
        final int resultNumber = firstTask.getResult() + secondTask.getResult();
        printThreadNameAndResult(resultNumber);
    }

    private static Thread startThread(final Runnable runnable) {
        final Thread thread = new Thread(runnable);
        thread.start();
        return thread;
    }

    private static void printThreadNameAndResult(int result) {
        System.out.printf(
                "Thread: %s, result: %d \n", Thread.currentThread().getName(), result
        );
    }

    private static final class TaskSummingNumbers implements Runnable {
        private static final int INIT_VALUE_RESULT_NUMBER = 0;
        private final int fromNumber;
        private final int toNumber;
        private int result;

        public TaskSummingNumbers(int fromNumber, int toNumber) {
            this.fromNumber = fromNumber;
            this.toNumber = toNumber;
            result = INIT_VALUE_RESULT_NUMBER;
        }

        @Override
        public void run() {
            IntStream.rangeClosed(fromNumber, toNumber)
                    .forEach(
                            n -> result += n
                    );
            printThreadNameAndResult(this.result);
        }

        public int getResult() {
            return result;
        }
    }
}
