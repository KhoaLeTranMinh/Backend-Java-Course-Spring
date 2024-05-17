package three;

public class Worker {
  private String firstName;
  private String lastName;

  public Worker(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  private String generateFullName() {
    return firstName + " " + lastName;
  }

  public String generateGreetingStr() {
    return "Hi " + generateFullName();
  }
}
