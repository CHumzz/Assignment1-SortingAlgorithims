package shapes;

public class Cone extends Shape {

	private double radius;
	
	public Cone() {
		
	}
	
	public Cone(double height, double radius) {
		setHeight(height);
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return this.radius;
	}


	@Override
	public double calcVolume() {

		return 1.0/3 * (Math.PI * Math.pow(radius, 2) * getHeight());
	}

	@Override
	public double calcBaseArea() {

		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Cone [height =" + getHeight() + "[radius=" + radius + "]";
	}

}
