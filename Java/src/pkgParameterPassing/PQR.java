package pkgParameterPassing;

// if class in final but underlying methods are not final, is this allowed? If yes why? else no then why?
public class PQR extends ABC{
	public void m1() {
		System.out.println("Is this overriden?");
	}
	
	public void m2() {
		System.out.println("In m2");	
	}
	
	public void m3() {
		System.out.println("In m3");	
	}
}
