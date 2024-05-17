package three;

class Person {
  int id;
  String name;

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }
}

class Student extends Person {
  String className;

  public Student(int id, String name) {
    super(id, name);
  }

  public Student(int id, String name, String className) {
    super(id, name);
    this.className = className;
  }

}

public class InheritanceExample {
  public static void main(String[] args) {
    Student student = new Student(1, "Alice", "CS101");
    System.out.println("id=" + student.id + ",name=" + student.name + ",class name=" + student.className);
  }
}
