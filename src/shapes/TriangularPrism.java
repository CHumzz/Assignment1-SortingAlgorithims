package shapes;

public class TriangularPrism extends Prism {

	public TriangularPrism() {
		
	}
	
	public TriangularPrism(double height, double side) {
		setHeight(height);
		setSide(side);
	}
	
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.pow(getSide(), 2) * Math.sqrt(3) / 4;
	}

	@Override
	public String toString() {
		return "TriangularPrism [height=" + getHeight() + "] [side = " + getSide();
	}

}


