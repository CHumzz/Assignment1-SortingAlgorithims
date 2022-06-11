package shapes;

public class PentagonalPrism extends Prism {
	
	public PentagonalPrism() {
		
	}
	
	public PentagonalPrism(double height, double side) {
		setHeight(height);
		setSide(side);
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return ((5 * Math.pow(getSide(), 2) * Math.tan(Math.toRadians(54))) / 4); 
	}

	@Override
	public String toString() {
		return "PentagonalPrism [height = " + getHeight() + "side=" + getSide();
	}
	

}


