package interview.java.concurrency.baeldung;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {
    private Data load;

    public Receiver(Data data) {
        this.load = data;
    }

    public void run() {
        for (String receivedMessage = load.receive();
             !"End".equals(receivedMessage);
             receivedMessage = load.receive()
        ) {
            System.out.println(receivedMessage.concat(" received."));
        }

        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread interrupted!");
        }
    }
}
