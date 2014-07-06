public class MyCircleTester {
 
  public static void main(String[] args) {

    MyCircle circle = new MyCircle();
    MyCircle otherCircle = new MyCircle();

    double x, y, radius, area, i, j, r, a;
    boolean boolValue;


    circle.setX(10.0);
    x = circle.getX();

    otherCircle.setX(14.0);
    i = otherCircle.getX();

    circle.setY(5.0);
    y = circle.getY();

    otherCircle.setY(8.0);
    j = otherCircle.getY();

    circle.setRadius(2.0);
    radius = circle.getRadius();

    otherCircle.setRadius(2.0);
    r = otherCircle.getRadius();


    area = circle.getArea();
    a = otherCircle.getArea();

    System.out.println("x = " + x + ", " + i);
    System.out.println("y = " + y + ", " + j);
    System.out.println("radius = " + radius + ", " + r);
    System.out.println("area = " + area + ", " + a);

    boolValue = circle.doesOverlap(otherCircle);

    if (boolValue) System.out.println("true");
    else System.out.println("false");

  }
}