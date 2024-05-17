import java.util.ArrayList;
import java.util.List;

public class RaceConditionExample {
    private static int TRANSACTIONS_PER_MACHINE = 10;
    private static int balance = 0;

    private static void deposit() {
        balance = balance + 1;
        System.out.println("+, balance=" + balance);
    }

    private static void withdraw() {
        balance = balance - 1;
        System.out.println("-, balance=" + balance);
    }

    public static void main(String[] args) throws Exception {
        List<Thread> allThreads = new ArrayList<>();
        for (int i = 1; i <= TRANSACTIONS_PER_MACHINE; i++) {
            Integer threadNumber = i;
            Thread t = new Thread(new Runnable() {
                public void run() {
                    deposit();
                    withdraw();
                    System.out.println("from Thread" + threadNumber);
                }
            });
            t.start();
            // Thread.sleep(1000);
            allThreads.add(t);
        }
        for (Thread t : allThreads) {
            t.join();
        }
        System.out.println("balance=" + balance);
    }
}
