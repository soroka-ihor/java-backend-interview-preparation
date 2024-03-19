package interview.java.concurrency;

public class DataWriter {

    private Data data;

    public DataWriter(Data data) {
        this.data = data;
    }

    public void write()  {
        if (!data.isRead()) {
            data.write();
            data.setRead(true);
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
