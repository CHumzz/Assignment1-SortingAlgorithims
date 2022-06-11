/**
 * 
 */
package shapes;

/**
 * @author Kingston
 *
 */
public class SquarePrism extends Prism {

	public SquarePrism() {
		
	}
	
	public SquarePrism(double height, double side) {
		setHeight(height);
		setSide(side);
		
	}
	
	
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.pow(getSide(), 2);
	}

	@Override
	public String toString() {
		return "SquarePrism [height = " + getHeight() + "side=" + getSide();
	}
	
	
	

}
