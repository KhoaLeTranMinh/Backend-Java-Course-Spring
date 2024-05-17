package three;

class SchoolStudent {
  static final String SCHOOL = "EngineerProSchool";
  int id;
  String name;

  public SchoolStudent() {
  }

  public SchoolStudent(int id, String name) {
    // this refer to current object
    this.id = id;
    this.name = name;
  }
}

public class ObjectClassExample {
  public static void main(String[] args) {
    SchoolStudent firstStudent = new SchoolStudent();
    firstStudent.id = 1;
    firstStudent.name = "Alice";
    System.out.println("id=" + firstStudent.id + ",name=" + firstStudent.name);

    SchoolStudent secondStudent = new SchoolStudent(2, "Bob");
    System.out.println("id=" + secondStudent.id + ",name=" + secondStudent.name);
  }
}
