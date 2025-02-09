package pkgPolymorphism;
import java.util.*;  

// Overloading: same class, compile time and static
// Overriding: different class, run time and dynamic
public class PolymorphismDemo {
	public static void main(String [] args)
	{
		String chc;  // chc is of String type
		Printer prntObj = new Printer();  // create an object of Printer class
		System.out.print("Enter YES if you want a colour print else enter NO: ");  // asks for user input
		Scanner sc = new Scanner(System.in);  // scanner class is used for user input
		chc = sc.next();
		chc = chc.toLowerCase();  // converts the user input into lowercase
		if (chc.equalsIgnoreCase("yes")) {
			prntObj.printPaper(true);  // calls the function with boolean parameter
		}
		else if(chc.equalsIgnoreCase("no")) {
			prntObj.printPaper();  // calls the function without parameter
		}
		else {
			System.out.println("Your input does not match");  // if user enter input other than yes or no
		}
	}
}
