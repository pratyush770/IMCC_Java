package pkgInterface;

public class OuterClass {
	/**
	 * Instance variables
	 */
	int x,y;
	public OuterClass(int x, int y) {  // initialize variables
		this.x = x;
		this.y = y;
	}
	/**
	 * Method to print the values
	 */
	public void printValues() {
		System.out.println("The value of x is: " + x);
		System.out.println("The value of y is: " + y);
	}
	/**
	 * Inner interface
	 */
	public interface InnerInterface {
		public abstract void innerM1 ();
	}
}
