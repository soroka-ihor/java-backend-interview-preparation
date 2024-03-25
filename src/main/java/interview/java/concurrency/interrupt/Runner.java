package interview.java.concurrency.interrupt;

import java.util.concurrent.TimeUnit;

public class Runner {
    private static final String MESSAGE_REQUEST_SENT = "Request was sent.";
    private static final int DURATION_DELIVERY_RESPONSE_SECONDS = 1;
    private static final String MESSAGE_RESPONSE_WAS_RECIEVED = "Response was received.";
    private static final String SERVER_BEEN_STOOPED = "Server has been stopped.";
    private static final String MESSAGE_INTERRUPTED = "Thread was interrupted.";
    public static void main(String[] args) throws InterruptedException {
        Thread commucationThread = new Thread(() -> {
          try {
              while (!Thread.currentThread().isInterrupted()) {
                  doRequest();
              }
          } catch (InterruptedException e) {
              System.out.println(MESSAGE_INTERRUPTED);
          }
        });
        commucationThread.start();
        System.out.println("Main finished");
    }

    private static boolean isServedShouldBeOff() {
        return true;
    }

    private static void stopServer() {
        System.out.println(SERVER_BEEN_STOOPED);
    }

    private static void doRequest() throws InterruptedException {
        System.out.println(MESSAGE_REQUEST_SENT);
        TimeUnit.SECONDS.sleep(DURATION_DELIVERY_RESPONSE_SECONDS);
        System.out.println(MESSAGE_RESPONSE_WAS_RECIEVED);
    }
}
