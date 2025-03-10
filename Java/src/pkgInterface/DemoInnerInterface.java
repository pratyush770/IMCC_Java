package pkgInterface;

public class DemoInnerInterface {
	public static void main(String [] args) {
		OuterClass outClObj = new OuterClass(1, 2);  // OuterClass object creation
		outClObj.printValues();
		OuterB outBObj = new OuterB(10, 20);  // OuterB object creation
		outBObj.printValues();
		outBObj.innerM1();
//		OuterClass.InnerInterface innObj = new OuterClass(8, 16);  // OuterClass is not an implementing class so it won't work
		OuterClass.InnerInterface innObj1 = new OuterB(8, 16);  // OuterB is an implementing class so it will work
		innObj1.innerM1();
//		innObj1.printValues();  // printValues() is a reference of OuterB class so this line won't work
	}
}
