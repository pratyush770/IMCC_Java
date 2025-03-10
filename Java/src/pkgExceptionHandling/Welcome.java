package pkgExceptionHandling;
import java.util.Scanner;

public class Welcome {
	/**
	 * throws and throw keyword demonstration
	 */
	public void greeting(String msg) throws NullPointerException {  // throws is used to alert the programmer that this exception may occur
		if (msg == null)  // for null values
		{			
			throw new NullPointerException();
		}
		else 
		{
			System.out.println("The message is: " + msg);
		}
	}
	public static void main(String [] args) {
		Welcome obj = new Welcome();  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the message: ");
		String msg = sc.nextLine();
        if (msg.equalsIgnoreCase("null")) {  // if user enters null
            msg = null;
        }
		try {
			obj.greeting(msg);
		}
		catch(NullPointerException npe) {
			System.out.println("Exception: " + npe);
		}
	}
}
