package pkgPolymorphism;

public class Printer {
	public void printPaper()  // method overloading
	{
		System.out.println("This will print black and white copies");
	}
	
	public void printPaper(boolean ch)
	{
		System.out.println("This will print colored copies");
	}
}
