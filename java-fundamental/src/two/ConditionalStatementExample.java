package two;

public class ConditionalStatementExample {
  public static void main(String[] args) {
    // If-else

    String name = "Andy";
    if (name == "Alice") {
      System.out.println("Hi there");
    } else if (name == "Bob") {
      System.out.println("Hello");
    } else {
      System.out.println("Hallo");
    }

    // Switch
    String goodbyeStr;
    switch (name) {
      case "Alice":
        goodbyeStr = "Bye Alice";
        break;
      case "Bob":
        goodbyeStr = "Bye Bob";
        break;
      default:
        goodbyeStr = "See you";
    }
    System.out.println("goodbyeStr=" + goodbyeStr);
  }
}
