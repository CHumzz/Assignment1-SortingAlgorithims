package shapes;

public class Cylinder extends Shape {

	private double radius;
	

	public Cylinder() {

	}

	public Cylinder(double height, double radius) {
		setHeight(height);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double calcBaseArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double calcVolume() {
		return Math.PI * Math.pow(radius, 2) * getHeight();
	}

	@Override
	public String toString() {
		return "Cylinder height= " + getHeight() + "[radius=" + radius;
	}
	
	


}
