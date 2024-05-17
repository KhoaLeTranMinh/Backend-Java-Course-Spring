package three;

public class EncapsulationExample {

  public static void main(String[] args) {
    Worker worker = new Worker("Alice", "Nguyen");
    System.out.println(worker.generateGreetingStr());
  }
}
