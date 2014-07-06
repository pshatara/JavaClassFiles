public class CircleTester {
 
  public static void main(String[] args) {

    Circle circle = new Circle();
    Circle otherCircle = new Circle();
    Point point = new Point(10.0, 14.0);
    Point otherPoint = new Point(5.0, 8.0);

    double x, y, radius, area, i, j, r, a;
    boolean overlap, equals;


    circle.setOrigin(point);
    otherCircle.setOrigin(otherPoint);

    //circle.setX(2.0);
    x = circle.getX();

    otherCircle.setX(10.0);
    i = otherCircle.getX();

    //circle.setY(5.0);
    y = circle.getY();

    otherCircle.setY(14.0);
    j = otherCircle.getY();

    circle.setRadius(2.0);
    radius = circle.getRadius();

    otherCircle.setRadius(2.0);
    r = otherCircle.getRadius();

    area = circle.getArea();
    a = otherCircle.getArea();

    System.out.println(circle.toString());
    System.out.println(otherCircle.toString());
    System.out.println("x = " + x + ", " + i);
    System.out.println("y = " + y + ", " + j);
    System.out.println("radius = " + radius + ", " + r);
    System.out.println("area = " + area + ", " + a);

    overlap = circle.doesOverlap(otherCircle);

    if (overlap) System.out.println("true");
    else System.out.println("false");

    equals = circle.equals(otherCircle);

    if (equals) System.out.println("equal");
    else System.out.println("not equal");

  }
}