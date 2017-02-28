package auctionSystem;

import java.util.Scanner;

public class System extends Auction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System system = new System();
		Auction auction = new Auction();
		
		printMenu();
	}
	
	public static void placeAuction() { 
		
	}
	
	public static void browseAuction() {
		
	}
	
	public static void setupAccount() {
		
	}

	public static void printMenu(){ 
		Scanner s = new Scanner(java.lang.System.in);
		int input = s.nextInt();
		java.lang.System.out.println("1. Create auction");
		java.lang.System.out.println("2. Browse auction");
		java.lang.System.out.println("3. Create account");
		
		switch(input) {
		case 1: 
			placeAuction();
			break;
		case 2: 
			browseAuction();
			break;
		case 3: 
			setupAccount();
			break;
		}
	}
}
