package two;

import java.util.ArrayList;
import java.util.List;

public class LoopStatementExample {
  public static void main(String[] args) {
    // for loop
    System.out.println("For loop example");
    for (int counterUp = 0; counterUp < 10; counterUp++) {
      System.out.println("counterUp=" + counterUp);
    }
    // while loop
    System.out.println("While loop example");
    int counterDown = 10;
    while (counterDown > 0) {
      System.out.println("counterDown=" + counterDown);
      counterDown -= 1;
    }
    // for each
    System.out.println("for each example");
    List<Integer> numberChoices = new ArrayList<>();
    numberChoices.add(2);
    numberChoices.add(3);
    numberChoices.add(5);
    for (Integer choice : numberChoices) {
      System.out.println("choice=" + choice);
    }
    // do-while break statement
    int evenNumberCounter = 0;
    do {
      if (evenNumberCounter == 0) {
        evenNumberCounter += 2;
        continue;
      }
      System.out.println("evenNumberCounter=" + evenNumberCounter);
      if (evenNumberCounter == 6) {
        break;
      }
      evenNumberCounter += 2;
    } while (evenNumberCounter < 10);
  }
}
