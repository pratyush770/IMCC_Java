package pkgInterface;

/**
 * This is an example of an interface demonstration in java 
 */
public interface Shape {
	/**
	 * Abstract method (must be implemented in the class which is using it)
	 */
	public abstract void drawShape(int no_of_sides);  
	/**
	 * Default method (can be overriden)
	 */
	public default void printShapeDetails() {  
		System.out.println("This is a shape");
	} 
	/**
	 * Static method (cannot be overriden)
	 */
	public static void aboutShape() { 
		System.out.println("This feature comes from Shape interface");
	}
}
