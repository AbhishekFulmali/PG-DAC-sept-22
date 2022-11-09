import java.util.*;

interface Shape {

	void calArea();

	void displayArea();
}

class Rectangle implements Shape {

	double area;
	double length;
	double breadth;

	Rectangle(double l, double b) {
		this.length = l;
		this.breadth = b;
	}

	public void calArea() {

		area = length * breadth;

	}

	public void displayArea() {
		System.out.println("Area  of Reactangle : " + area);
	}

}

class Circle implements Shape {

	double area;
	double radius;

	Circle(double r) {
		this.radius = r;
	}

	public void calArea() {

		area = 3.14 * radius * radius;

	}

	public void displayArea() {
		System.out.println("Area  of Circle : " + area);
	}

}

public class Q_7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth to Calculate the area of rectangle :");
		double l = sc.nextDouble();
		double b = sc.nextDouble();

		System.out.println("Enter the Radius to Calculate the area of Circle :");
		double r = sc.nextDouble();

		Shape rec = new Rectangle(l, b);

		rec.calArea();
		rec.displayArea();

		Shape C = new Circle(r);

		C.calArea();
		C.displayArea();
	}

}