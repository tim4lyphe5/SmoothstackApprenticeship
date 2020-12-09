
public class Rectangle implements Shape {
	
	private double height;
	private double width;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Rectangle() {
		height = 1;
		width = 1;
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(Double h, Double w) {
		this.height = h;
		this.width = w;
	}

	@Override
	public double calculateArea(Double a, Double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The area of this rectangle is " + calculateArea(this.height,this.width));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5.0,10.0);
		r1.display();

	}

}
