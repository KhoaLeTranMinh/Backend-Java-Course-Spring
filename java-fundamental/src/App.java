import three.Worker;
import one.DataTypeExample;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Worker worker = new Worker("Bob", "Nguyen");
        System.out.println(worker.generateGreetingStr());
    }
}
