package interview.java.concurrency;

import java.util.ArrayList;
import java.util.List;

public class WaitNotifyTest {
    public static void main(String[] args) throws Exception {
//        Message msg = new Message("process it");
//
//        Waiter waiter = new Waiter(msg);
//        new Thread(waiter,"waiter").start();
//
//        Waiter waiter1 = new Waiter(msg);
//        new Thread(waiter1, "waiter1").start();
//
//        Notifier notifier = new Notifier(msg);
//        new Thread(notifier, "notifier").start();
        Data data = new Data();
        DataWriter writer = new DataWriter(data);
        DataReader reader = new DataReader(data);
        Thread tWriter = new Thread(() -> writer.write());
        Thread tReader = new Thread(() -> reader.read());
        tWriter.start();
        tReader.start();
    }

    public static Runnable getTask() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Task started: " + this);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task finished: " + this);
            }
        };
    }

    static class BlockingQueue {
        List<Runnable> tasks = new ArrayList<>();

        public synchronized Runnable get() {
            while (tasks.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Runnable task = tasks.get(0);
            tasks.remove(task);
            return task;
        }

        public synchronized void put(Runnable task) {
            tasks.add(task);
            notify();
        }
    }

    static class Container {
        public final List<String> container = new ArrayList<>();

        synchronized public void add(String str) {
            container.add(str);
        }

        synchronized public int size() {
            return this.container.size();
        }
    }

    static class Counter {
        private int x = 0;
        synchronized public void increment() {
            this.x++;
        }
        public int getX() {
            return this.x;
        }
    }
}
