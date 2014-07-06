public class Circle {

	private Point origin;
	private double radius;
 
 	public Circle(Point o, double r) {
 		this.origin = o;
 		this.radius = r;
 	}

 	public Circle(double x, double y, double r) {
      origin = new Point(x, y);
      this.radius = r;
   }

   public Circle() {
      origin = new Point();
      radius = 1.0;
   }

   public Circle(Circle c) {
   	  origin = c.getOrigin();
   	  radius = c.getRadius();
   }

	public Point getOrigin() {
		return origin;
	}
	
	public void setOrigin(Point p) {
		origin = p;
	}

	public void setX(double xCoordinate) {
		origin.setX(xCoordinate);
	}

	public double getX() {
		return origin.getX();
	}

	public void setY(double yCoordinate) {
		origin.setY(yCoordinate);
	}

	public double getY() {
		return origin.getY();
	}

	public void setRadius(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));
	}

	public String toString() {
	   return "origin: " + origin + ", radius: " + radius;
	}

	public boolean equals(Circle c) {
		if (origin.getX() == c.getX() && origin.getY() == c.getY() && radius == c.getRadius()) return true;
		else return false;
	}

	public boolean doesOverlap(Circle otherCircle) {
		double sum, distance;

		sum = radius + otherCircle.getRadius();
		distance = Math.sqrt((origin.getX() - otherCircle.getX()) * (origin.getX() - otherCircle.getX()) + (origin.getY() - otherCircle.getY()) * (origin.getY() - otherCircle.getY()));

		if (sum > distance) return true;
		else return false;
	}
}