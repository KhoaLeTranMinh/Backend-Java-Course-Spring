package one;

import java.util.ArrayList;
import java.util.List;

class Player {
  int id;
  String name;
}

public class DataTypeExample {
  public static void main(String[] args) {
    // primitive data types
    boolean isStudent = true;
    System.out.println(isStudent);

    char singleCharacter = 'a';
    System.out.println(singleCharacter);

    int studentId = 1000;
    System.out.println(studentId);

    long numberOfViews = (long) Math.pow(2.0d, 33.0d);
    int numberOfViewsFalse = (int) Math.pow(2.0d, 33.0d);
    System.out.println(numberOfViews);
    System.out.println(numberOfViewsFalse);
    System.out.println(Integer.MAX_VALUE);

    // 6 decimal digits
    float x = 1.1234f;
    System.out.println(x);

    // 15 decimal digits
    double y = 1.1234567891d;
    System.out.println(y);

    // non-primitive data types
    System.out.println(Byte.MIN_VALUE);

    Player player = new Player();
    List<Player> players = new ArrayList<>();
    // cannot declare like this
    // List<int> numbers = new ArrayList<>();
    // should be this
    List<Integer> numbers = new ArrayList<>();
  }
}
