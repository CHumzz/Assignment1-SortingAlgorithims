package shapes;

public abstract class Prism extends Shape  {
// Volume of all prisms is the base area multiplied by height
	
	private double side;

	public double calcVolume() {
		return calcBaseArea() * getHeight();
		
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	 
	


}
