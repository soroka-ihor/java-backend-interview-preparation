package interview.java.concurrency;

import java.util.Scanner;

public class Data {

    private String data;
    private boolean read = false;

    public void write() {
        System.out.println("Monitor is owned by: " + Thread.currentThread().getName());
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine();
        System.out.println("Data written: " + str);
        this.data.concat(str);
    }

    synchronized public void read() {
        System.out.println("Monitor is owned by: " + Thread.currentThread().getName());
        System.out.println("Current data: " + data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public void data() {
        System.out.println(this.getClass());
    }
}
