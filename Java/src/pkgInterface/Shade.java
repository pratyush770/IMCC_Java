package pkgInterface;

/**
 * If this was an abstract class, then we wouldn't have been able to extend it since Rectangle class already extends Shape class
 */
public interface Shade { 
	public abstract void draw();  // abstract class
	public abstract void solidFill();
	public abstract void edgeFill();
	public abstract void roundedCorners();
}
