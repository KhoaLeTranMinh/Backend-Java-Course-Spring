package three;

import java.util.ArrayList;
import java.util.List;

class Point {
  int x;
  int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "{" +
        " x='" + x + "'" +
        ", y='" + y + "'" +
        "}";
  }

}

class Space {
  List<Point> allPoints;

  public Space() {
    allPoints = new ArrayList<>();
  }

  void draw() {
    System.out.println("Draw shape");
  }

  void addPoint(int x, int y) {
    // method overloading
    allPoints.add(new Point(x, y));
  }

  void addPoint(Point point) {
    // method overloading
    allPoints.add(point);
  }

  @Override
  public String toString() {
    return "{" +
        " allPoints='" + allPoints + "'" +
        "}";
  }

}

class ReverseSpace extends Space {
  @Override
  void addPoint(int x, int y) {
    // method overriding
    allPoints.add(new Point(y, x));
  }

  @Override
  void addPoint(Point point) {
    allPoints.add(new Point(point.y, point.x));
  }
}

public class PolymorphismExample {
  public static void main(String[] args) {
    Space normalSpace = new Space();
    normalSpace.addPoint(1, 2);
    normalSpace.addPoint(new Point(2, 4));
    System.out.println(normalSpace);

    Space reversedSpace = new ReverseSpace();
    reversedSpace.addPoint(1, 2);
    reversedSpace.addPoint(new Point(2, 4));
    System.out.println(reversedSpace);
  }
}
