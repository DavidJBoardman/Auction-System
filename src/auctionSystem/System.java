package auctionSystem;

import java.util.*;
import java.text.*;

public class System extends Auction{

	public static void main(String[] args) {
		
		//these are the new auction and system objects we can use in this method.
		System system = new System();
		Auction auction = new Auction();
		
		//prints of the menu for the user
		printMenu();	
	}
	
	public static void placeAuction() { 
		Scanner s = new Scanner(java.lang.System.in);
		Date date = new Date();
		
		String TDate = String.format("Current Date/Time : %tc", date );
		String SDate = String.format("Date when auction ends/Time : %tc", date);
		
		
		java.lang.System.out.println("Please insert the start price \n" 
				+ "£");
		int input1 = s.nextInt();
		
		java.lang.System.out.println("Please insert the reserve price \n"
				+ "£");
		int input2 = s.nextInt();
		
		java.lang.System.out.println("The close date will be seven days from today\n ");
				java.lang.System.out.println("\nStart Date:" + TDate);
				java.lang.System.out.println("\nClose date:" + SDate);
	}
	
	public static void browseAuction() {
		Scanner s = new Scanner(java.lang.System.in);
		
		//needs to retrieve the database
		AuctionDatabase a = new AuctionDatabase();
		a.getArrayItems();
		
		java.lang.System.out.println("Would you like to go back to the main menu? Y");
		char input1 = s.next().charAt(0);
		if(input1 == 'Y'){
			printMenu();
		}
	}
	
	public static void setupAccount() {
		Scanner s = new Scanner(java.lang.System.in);
		java.lang.System.out.println("Set up account: \n"
				+ "Please enter your Username: \n");
		String input = s.nextLine();
		//new global array for the new user
		
		java.lang.System.out.println("Please enter your Password: \n");
		String input1 = s.nextLine();
		//new global array for the new user
	}

	public static void printMenu(){ 
		Scanner s = new Scanner(java.lang.System.in);
		
		java.lang.System.out.println("Welcome to the Auction System! Please choose one of the options below\n");
		java.lang.System.out.println("1. Login into an account");
		java.lang.System.out.println("2. Browse auction");
		java.lang.System.out.println("3. Create account");
		java.lang.System.out.println("4. Exit");
		int input = s.nextInt();
		
		switch(input) {
		case 1: 
			//user accounts will be printed off here. 
			
			break;
		case 2: 
			browseAuction();
			break;
		case 3: 
			setupAccount();
			break;
		case 4:
			s.close();
			java.lang.System.exit(0);
		}
	}
}
