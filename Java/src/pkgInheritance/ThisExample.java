package pkgInheritance;

public class ThisExample {
	private int i, j;  // instance variables
	
	public ThisExample() {  // constructor overloading
		this(0);  // calls the parameterized constructor with 1 parameter
	}
	
	public ThisExample(int val) {
		this(val, val);  // calls the parameterized constructor with 2 parameters
	}
	
	public ThisExample(int v1, int v2) {
		i = v1;
		j = v2;
	}
	
	public void showValues() {  // method overloading
		this.showValues("both");  // will call the showValues method with 1 parameter
	}
	
	public void showValues(String s) {
		System.out.println("The value of i is: " + i);
		System.out.println("The value of j is: " + j);
	}
	
	public static void main(String [] args) {
		ThisExample thsExObj = new ThisExample();  // goes to 1st constructor then goes to 2nd constructor with 1 argument because of this()
		ThisExample thsExObj1 = new ThisExample(10);  // goes to 2nd constructor then goes to 3rd constructor with 2 arguments because of this()  
		ThisExample thsExObj2 = new ThisExample(12, 13);  // directly goes to 3rd constructor
		thsExObj.showValues();  // goes to showValues with no parameter first and then goes to showValues with 1 parameter because of this
		thsExObj1.showValues();
		thsExObj2.showValues();
	}
}
