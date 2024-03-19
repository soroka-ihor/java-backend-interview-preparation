package interview.java.concurrency;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Waiter implements Runnable {

    private Message message;

    @Override
    public void run() {
        job();
    }

    public void some() {
        Object o = new Object();
        synchronized(o) {

        }
    }

    synchronized private void job() {
        String name = Thread.currentThread().getName();
        synchronized (message) {
            try{
                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
                message.wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name + "  thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+ message.getMessage());
        }
    }

}
