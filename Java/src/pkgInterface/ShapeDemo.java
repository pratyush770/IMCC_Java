package pkgInterface;

public class ShapeDemo {
	public static void main(String [] args) {
		Rectangle recObj = new Rectangle();
		recObj.drawShape(4);  // invoked from Rectangle class
		recObj.printShapeDetails();  // invoked from Rectangle interface since it got overriden
		Shape.aboutShape();  // invoked from Shape interface
		System.out.println();
		Shape shObj = new Rectangle(); 
		shObj.drawShape(4);
		shObj.printShapeDetails();
//		Rectangle rcObj = new Shape();  // won't work
	}
}
