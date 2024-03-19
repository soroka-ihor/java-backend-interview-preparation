package interview.java.concurrency;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notifier implements Runnable {
    private Message msg;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(100L);
            synchronized (msg) {
                msg.setMessage(name+" Notifier work done");
                msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
}

