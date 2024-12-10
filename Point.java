package classes;

public class Point {
	//תכונות
	private double x;
	private double y;

	//פעולה בונה
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}


	//geters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}

	//seters
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}

	//toString
	public String toString() {
		return "(" + x + "," + y + ")";
	}


	//part 2

	//1
	public double calculateDistance(Point other) {
		double dx = this.x - other.x;
		double dy = this.y - other.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	//2
	public static Point calculateMidpoint(Point p1, Point p2) {
		double midX = (p1.getX() + p2.getX()) / 2;
		double midY = (p1.getY() + p2.getY()) / 2;
		return new Point(midX, midY);
	}


	//arr rectangle
	public boolean areTheSame (Point p1, Point p2) {
		return (p1.getX() == p2.getX() && p1.getY() == p2.getY());
	}
	
	
}
