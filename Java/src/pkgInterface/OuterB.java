package pkgInterface;

public class OuterB implements OuterClass.InnerInterface{
	/**
	 * Instance variables
	 */
	public int n, m;
	public OuterB(int n, int m) {  // initialize variables
		this.n = n;   
		this.m = m;
	}
	/**
	 * Method to print the values
	 */
	public void printValues() {
		System.out.println("The value of n is: " + n);
		System.out.println("The value of m is: " + m);
	}
	/**
	 * Override the abstract method innerM1()
	 */
	public void innerM1() {
		System.out.println("This message comes from the implemented innerM1 in OuterB class");
	}
}
