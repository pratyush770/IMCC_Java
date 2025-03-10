package pkgInheritance;
//This keyword is used to resolve naming conflicts
public class Dog {
	private int tailLength;  // private variable named litterSize
	private boolean isTrained;  // private variable named gestationPeriod
	
	public Dog(int tailLength, boolean isTrained) {  // parameterized constructor
//		tailLength = tailLength;  // flow stays only till local variable and does not reach instance variable without this keyword
		this.tailLength = tailLength;  // using this keyword for variable reference
		this.isTrained = isTrained;
		System.out.println("Printing tailLength from the constructor: " + this.tailLength);
		System.out.println("Printing isTrained from the constructor: " + this.isTrained);
	}
	
	public int getTailLength() {  // getter method
		return tailLength;
	}
	
	public void setTailLength(int tailLength) {  // setter method
		this.tailLength = tailLength;
	}
	
	public boolean isTrained() {  // getter method
		return isTrained;
	}
	
	public void setTrained(boolean isTrained) {  // setter method
		this.isTrained = isTrained;
	}
	
	public void getTrained() {  // getTrained method
		System.out.println("Inside getTrained method");
	}
	
	public void details() {
		System.out.println("Printing tailLength from the constructor: " + this.tailLength);
		System.out.println("Printing isTrained from the constructor: " + this.isTrained);
	}
}
