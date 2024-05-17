package three;

abstract class Motorbike {
  abstract void run();

  void changeGear() {
    // non-abstract method
    System.out.println("change gears");
  }
}

class HondaMotorbike extends Motorbike {

  @Override
  void run() {
    System.out.println("run Honda");
  }

}

class VespaMotorbike extends Motorbike {

  @Override
  void run() {
    System.out.println("run Vespa");
  }

}

interface Drawable {
  void draw();
}

interface Printable {
  void print();
}

class Shape implements Drawable, Printable {
  // multiple inheritance
  @Override
  public void draw() {
    System.out.println("draw");
  }

  @Override
  public void print() {
    System.out.println("print");
  }

}

public class AbstractionExample {
  public static void main(String[] args) {
    Motorbike hondaMotorbike = new HondaMotorbike();
    hondaMotorbike.run();
    hondaMotorbike.changeGear();

    Motorbike vespaMotorbike = new VespaMotorbike();
    vespaMotorbike.run();
    vespaMotorbike.changeGear();

    Shape shape = new Shape();
    shape.draw();
    shape.print();
  }
}
