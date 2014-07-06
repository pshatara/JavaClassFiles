public class MyCircle {

	private double x;
	private double y;
	private double radius;

	public void setX(double xCoordinate) {
		x = xCoordinate;
	}

	public double getX() {
		return x;
	}

	public void setY(double yCoordinate) {
		y = yCoordinate;
	}

	public double getY() {
		return y;
	}

	public void setRadius(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));
	}

	public boolean doesOverlap(MyCircle otherCircle) {
		double sum, distance;

		sum = radius + otherCircle.getRadius();
		distance = Math.sqrt((x - otherCircle.getX()) * (x - otherCircle.getX()) + (y - otherCircle.getY()) * (y - otherCircle.getY()));

		if (sum > distance) return true;
		else return false;
	}
}