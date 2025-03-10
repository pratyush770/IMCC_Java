package pkgInheritance;

public class Mammal extends Animal{  // inherits Animal class
	public Mammal() {  // non parameterized constructor
		super(20, 75, "Male");  // calls the parameterized constructor from Animal class
		System.out.println("Mammmal constructor");	
	}
	
	private int litterSize = 10;  // private variable named litterSize
	private String gestationPeriod = "40 days";  // private variable named gestationPeriod
	
	public int getLitterSize() {  // getter method
		return litterSize;
	}
	
	public void setLitterSize(int litterSize) {  // setter method
		this.litterSize = litterSize;
	}
	
	public String getGestationPeriod() {  // getter method
		return gestationPeriod;
	}
	
	public void setGestationPeriod(String gestationPeriod) {  // setter method
		this.gestationPeriod = gestationPeriod;
	}
	
	public void details() {  // details method (This is overridden method)
		super.details();  // calls the details method from Animal class
		System.out.println("Gestation period is: " + gestationPeriod);
		System.out.println("Litter Size is: " + litterSize);
	}
}
