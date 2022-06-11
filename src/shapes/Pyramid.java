/**
 * 
 */
package shapes;

/**
 * @author Kingston
 *
 */
public class Pyramid extends Shape {
	
	private double side;
	
	public Pyramid() {
		
	}
	
	public Pyramid(double height, double side) {
		setHeight(height);
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return 1.0/3 * Math.pow(side, 2) * getHeight();
		
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.pow(side, 2);
	}

	@Override
	public String toString() {
		return "Pyramid height=" + getHeight() + "[side=" + side + "]";
	}
	
	
	
	

}
