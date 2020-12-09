
public class Circle implements Shape {
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {
		radius = 1;
	}
	
	public Circle(Double r) {
		radius = r;
	}

	@Override
	public double calculateArea(Double radius, Double pi) {
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The area of the circle is " + calculateArea(this.radius, null));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle(5.0);
		circle1.display();

	}

}
