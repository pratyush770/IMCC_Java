package pkgParameterPassing;
import java.util.*;

/**
 * This class is used to understand the working of static keyword with a variable using multiple ticket 
 * booking windows scenario
 */
public class StaticExample {
	public final int TOTAL_TICKETS = 200; 
	public static int tktsAvailable=0;  // does not create mutliple copies 
	
	/**
	 * This method takes the day of the week from the user and sets the no of available tickets for sale on 
	 * that day. 
	 * Monday,Tuesday,Wednesday,Thursday - 150
	 * Friday - ALL TICKETS
	 * Saturday, Sunday - 175
	 */
	public void setAvailableTkts(String wkDy)
	{
		//Depending on the day of the week, we set the available tickets count. For this we are
		//using switch case implementation of case list and arrow case as per JDK21 version
		switch(wkDy) {
			case "Mon","Tue","Wed","Thur"->
			{
				StaticExample.tktsAvailable = 150;
			}
			case "Fri"->
			{
				StaticExample.tktsAvailable = 200;
			}
			case "Sat","Sun"->
			{
				StaticExample.tktsAvailable = 175;
			}
			default->
				StaticExample.tktsAvailable = 0;
		}
	}
	public boolean bookTickets(final int noOfTkts)
	{
		final double TKTPRC =150.50; //assign some ticket price to the local variable. 
		double tktAmount=0.0;
		//check if the noOfTkts are less than the total tickets. proceed with the booking then. else return false
		if(noOfTkts < StaticExample.tktsAvailable) {
			tktAmount = TKTPRC*noOfTkts;
			System.out.println("Please pay: "+tktAmount+" at the ticket counter.");
			//updating available tickets count.
			StaticExample.tktsAvailable = StaticExample.tktsAvailable - noOfTkts;
		}
		else
			return false;
		return true;
	}
	
	public static void main(String ar[])
	{
		StaticExample stExObj1 = new StaticExample();
		StaticExample stExObj2 = new StaticExample();
		StaticExample stExObj3 = new StaticExample();
		
		stExObj1.setAvailableTkts("Mon");
		stExObj2.setAvailableTkts("Mon");
		stExObj3.setAvailableTkts("Mon");
		
		//invoke booking method on all the three objects. print the total tickets
		System.out.println("Available tickets are:"+ StaticExample.tktsAvailable);
		if(stExObj1.bookTickets(100))
			System.out.println("Tickets are booked!! Please pay the amount");
		else
			System.out.println("Tickets could not be booked. Better luck next time");
		System.out.println("Available tickets are:"+ StaticExample.tktsAvailable + "\n");
		
		System.out.println("Available tickets are:"+ StaticExample.tktsAvailable);
		if(stExObj2.bookTickets(100))
			System.out.println("Tickets are booked!! Please pay the amount");
		else
			System.out.println("Tickets could not be booked. Better luck next time");
		System.out.println("Available tickets are:"+ StaticExample.tktsAvailable + "\n");
		
		System.out.println("Available tickets are:"+ StaticExample.tktsAvailable);
		if(stExObj3.bookTickets(100))
			System.out.println("Tickets are booked!! Please pay the amount");
		else
			System.out.println("Tickets could not be booked. Better luck next time");
		System.out.println("Available tickets are:"+ StaticExample.tktsAvailable + "\n");
	}

}
