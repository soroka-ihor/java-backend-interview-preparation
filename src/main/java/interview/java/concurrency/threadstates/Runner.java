package interview.java.concurrency.threadstates;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    private static final String TEMPLATE_THREAD_STATE = "%s : %s\n";

    public static void main(String[] args) throws InterruptedException {
        List<DataSource> dataSources = Stream.generate(() -> new DataSource()).limit(10).collect(Collectors.toList());
        for (int i = 0; i < dataSources.size() - 1; i++) {
            dataSources.get(i).setJoinTo(dataSources.get(i + 1));
        }
        startThreads(dataSources);
    }

    public static void startThreads(List<DataSource> dataSources) {
        dataSources.forEach(
                t -> t.start()
        );
    }

    private static class DataSource extends Thread {

        private String data;
        private Thread joinTo;

        @Override
        public void run() {
            if (joinTo != null) {
                try {
                    joinTo.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.data = gatherData(32);
            showData();
        }

        private String gatherData(int length) {
            return Stream.generate(() -> UUID.randomUUID().toString())
                    .limit(length)
                    .collect(Collectors.joining());
        }

        public void setJoinTo(Thread thread) {
            this.joinTo = thread;
        }

        public String getData() {
            return this.data;
        }

        public void showData() {
            System.out.printf("%s %s\n", Thread.currentThread().getName(), this.data);
        }
    }
}
