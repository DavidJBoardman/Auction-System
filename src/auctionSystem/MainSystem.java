package auctionSystem;
import java.util.*;

import users.Buyer;

public class MainSystem {

	public static void main(String[] args) {
		
		//Starts thye system via the menu
		printMenu();
	}
	
	public static void placeAuction() { 
		Scanner s = new Scanner(System.in);
		Date date = new Date();
		
		String TDate = String.format("Current Date/Time : %tc", date );
		String SDate = String.format("Date when auction ends/Time : %tc", date);
		
		
		System.out.println("Please insert the start price \n" 
				+ "£");
		int input1 = s.nextInt();
		
		System.out.println("Please insert the reserve price \n"
				+ "£");
		int input2 = s.nextInt();
		
		System.out.println("The close date will be seven days from today\n ");
				System.out.println("\nStart Date:" + TDate);
				System.out.println("\nClose date:" + SDate);
	}
	
	
	//Looks up the current autions and displays them to the user
	public static void browseAuction() {
		//Scanner to take in the 
		Scanner sc = new Scanner(System.in);
		
		//needs to retrieve the database
		AuctionDatabase auctionDB = new AuctionDatabase();
		auctionDB.printItems();
		
		System.out.println(auctionDB.items);
		
		System.out.println("Would you like to go back to the main menu? Y");
		char input1 = sc.next().charAt(0);
		if(input1 == 'Y'){
			printMenu();
		}
	}
	
	public static void setupAccount() {
		AuctionDatabase auctionDB = new AuctionDatabase();
		Scanner s = new Scanner(System.in);
		System.out.println("Set up account: \n"
				+ "Please enter your Username: \n");
		String uname = s.nextLine();
		//new global array for the new user

		System.out.println("Please enter your Password: \n");
		String pword = s.nextLine();
		//new global array for the new user
		auctionDB.users.add(new Buyer (uname, pword));
		
	}

	public static void printMenu(){ 
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to the Auction System! Please choose one of the options below\n");
		System.out.println("1. Login into an account");
		System.out.println("2. Browse auction");
		System.out.println("3. Create account");
		System.out.println("4. Exit");
		System.out.println("0. printUsers");
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
			System.exit(0);
		}
	}
}
