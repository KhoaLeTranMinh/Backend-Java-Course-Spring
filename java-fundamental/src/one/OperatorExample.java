package one;

public class OperatorExample {
  static int sum(int a, int b) {
    return a + b;
  }

  static int multiply(int a, int b) {
    return a * b;
  }

  static int divide(int a, int b) {
    return a / b;
  }

  static int modulo(int a, int b) {
    return a % b;
  }

  public static void main(String[] args) {
    // arithmetic
    System.out.println(sum(1, 2));
    System.out.println(multiply(1, 2));
    System.out.println(divide(6, 3));
    System.out.println(modulo(7, 5));

    // // comparison
    int x = 1;
    System.out.println(x < 2);
    System.out.println(2 < x);
    System.out.println(x == 2);
    System.out.println(x != 2);
    // logical
    System.out.println(1 < 2 && 2 < 3);
    System.out.println(3 < 2 && 1 < 2);
    System.out.println(3 < 2 || 1 < 2);
    // tenary
    boolean isTrue = 1 == 2;
    System.out.println(isTrue ? "isTrue" : "isFalse");
  }
}
