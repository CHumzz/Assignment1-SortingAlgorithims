package shapes;

public class OctagonalPrism extends Prism {
	
	public OctagonalPrism() {
		
	}
	
	public OctagonalPrism(double height, double side) {
		setHeight(height);
		setSide(side);
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return 2 * (1 + Math.sqrt(2)) * Math.pow(getSide(), 2);
	}

	@Override
	public String toString() {
		return "OctagonalPrism [Height= " + getHeight() + "side=" + getSide();
	}

}


