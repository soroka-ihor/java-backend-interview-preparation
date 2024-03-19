package interview.java.concurrency.baeldung;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
    private Data data;

    public Sender(Data data) {
        this.data = data;
    }

    public void run() {
        String packets[] = {
                "Fist packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"
        };
        for (String packet : packets) {
            data.send(packet);
            System.out.println(packet.concat(" been sent."));
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread interrupted!");
            }
        }
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


}
