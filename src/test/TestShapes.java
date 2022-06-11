package test;

import shapes.BaseCompare;
import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.SquarePrism;
import shapes.TriangularPrism;
import shapes.VolumeCompare;

public class TestShapes {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(4.0, 5.0);
		Cylinder c2 = new Cylinder(2.0,4.0);
		Cylinder c3 = new Cylinder(5.0,4.0);
		Cylinder c4 = new Cylinder(4.0,4.0);
		
		System.out.println(c1.calcBaseArea());
		System.out.println(c1.calcVolume()); // should print 314.15
		
		// Expected 1
		System.out.println(c1.compareTo(c2));
		// Expected -1
		System.out.println(c1.compareTo(c3));
		// Expected 0
		System.out.println(c1.compareTo(c4));
		System.out.println("---");
		
		Cone cone1 = new Cone(3.0, 6.0);
		Cone cone2 = new Cone(2.0, 6.0);
		Cone cone3 = new Cone(5.0, 6.0);
		Cone cone4 = new Cone(3.0, 6.0);
		
		System.out.println(cone1.getHeight());
		System.out.println(cone1.getRadius());
		System.out.println(cone1.calcBaseArea());
		System.out.println(cone1.calcVolume()); //should print 113.09
		
		// Expected 1
		System.out.println(cone1.compareTo(cone2));
		// Expected -1
		System.out.println(cone1.compareTo(cone3));
		// Expected 0
		System.out.println(cone1.compareTo(cone4));
		System.out.println("---");
		
		Pyramid p1 = new Pyramid(2.0, 4.0);
		System.out.println(p1.calcBaseArea());
		System.out.println(p1.calcVolume()); //should print 10.67
		
		SquarePrism sq1 = new SquarePrism(4.0, 8.0);
		System.out.println(sq1.calcVolume());// should return 256
		System.out.println(sq1.calcBaseArea()); // should return 64
		
		
		TriangularPrism tp1 = new TriangularPrism(4.0, 8.0);
		System.out.println(tp1.calcBaseArea()); // should return 27.71
		System.out.println(tp1.calcVolume()); // should return 110.8
		
		PentagonalPrism pp = new PentagonalPrism(4.0, 8.0);
		System.out.println(pp.calcBaseArea());// 110
		System.out.println(pp.calcVolume()); // should print out 440.44
		
		OctagonalPrism op = new OctagonalPrism(4.0, 8.0);
		System.out.println(op.calcBaseArea()); // should return 309.01
		System.out.println(op.calcVolume()); // should return 1236.07
		
		
		
		VolumeCompare VC = new VolumeCompare();
		System.out.println(VC.compare(pp, op)); // -1
		System.out.println(VC.compare(op, pp)); // expected 1
		
		BaseCompare BC = new BaseCompare(); 
		System.out.println(BC.compare(pp, op));// -1
		System.out.println(BC.compare(op, pp)); // 1
		
		
		
		
		
		

	}

}
