
public class Triangle implements Shape {
	
	private double base;
	private double height;
	
	public Triangle() {
		height = 1;
		base = 2;
	}
	
	public Triangle(Double h, Double b) {
		this.height = h;
		this.base = b;
	}

	@Override
	public double calculateArea(Double a, Double b) {
		// TODO Auto-generated method stub
		return a*b/2;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The area of this Triangle is " + calculateArea(this.height, this.base));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t1 = new Triangle(3.0,7.0);
		t1.display();

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
