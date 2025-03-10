package pkgParameterPassing;
import java.util.*;

public class FinalVariableExample {
	public final int TOTAL_TICKETS;  // instance variable and value is initialized using constructor
//	public final int TOTAL_TICKETS = 200;  // we can do this too without using constructor to initialize value
	public int tktsAvailable = 0;
	
	public FinalVariableExample(int totTkc) {
		this.TOTAL_TICKETS = totTkc;  // initialize final variable
	}
	
	public void setAvailableTkts (String wkDy) {
		switch(wkDy) {
			// case list
			case "Mon", "Tue", "Wed", "Thur" -> {  // using multiple values in 1 case statement using -> (Applicable from java 21)
				tktsAvailable = 150;
			}
			case "Fri" -> {
				tktsAvailable = 200;
			}
			case "Sat", "Sun" -> {
				tktsAvailable = 175;
			}
			default -> 
				tktsAvailable = 0;
		}
	}
	
	public boolean bookTickets (final int noOfTkts) {  // the parameter becomes the final value
		final double TKTPRC = 150.50;  // final variable for setting permanent prize of ticket
		double tktAmount = 0.0;
		if (noOfTkts < tktsAvailable) {
			tktAmount = TKTPRC * noOfTkts;
			System.out.println("Please pay: " + tktAmount + " at the ticket counter.");
			tktsAvailable = tktsAvailable - noOfTkts;  // calculate the remaining tickets
		}
		else
			return false;  // if tickets not available
		return true;
	}
	
	public static void main (String [] args) {
		FinalVariableExample fv = new FinalVariableExample(120);  // object creation
		fv.setAvailableTkts("Mon");  // function call
		System.out.println("Available tickets are: " + fv.tktsAvailable);
		if (fv.bookTickets(100))  
			System.out.println("Tickets are booked!! Please pay the amount");
		else
			System.out.println("Tickets could not be booked. Better luck next time");
		System.out.println("Available tickets are: " + fv.tktsAvailable);
		
		if (fv.bookTickets(70))
			System.out.println("Tickets are booked!! Please pay the amount");
		else
			System.out.println("Tickets could not be booked. Better luck next time");
	}
}
