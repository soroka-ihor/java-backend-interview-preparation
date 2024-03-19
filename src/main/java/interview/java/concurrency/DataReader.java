package interview.java.concurrency;

public class DataReader {
    private Data data;

    public DataReader(Data data) {
        this.data = data;
    }

    public void read() {
        if (data.isRead()) {
            data.read();
            data.setRead(false);
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
