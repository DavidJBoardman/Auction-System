package auctionSystem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class MainSystem {
	public static void main(String[] args) {
		MainSystem app = new MainSystem();
		Boolean running = true;
		while(running) {
			app.printMenu();	
		}
	}
	AuctionDatabase auctionDB = new AuctionDatabase();
	Scanner sc = new Scanner(System.in);
	
	
	private boolean found;
	User user;
		public void placeAuction() { 
		Date date = new Date();
		
		String TDate = String.format("Current Date/Time : %tc", date );
		String SDate = String.format("Date when auction ends/Time : %tc", date);
		
		
		System.out.println("Please insert the start price \n" 
				+ "£");
		int input1 = sc.nextInt();
		
		System.out.println("Please insert the reserve price \n"
				+ "£");
		int input2 = sc.nextInt();
		
		System.out.println("The close date will be seven days from today\n ");
				System.out.println("\nStart Date:" + TDate);
				System.out.println("\nClose date:" + SDate);
	}
	
	
	//Looks up the current autions and displays them to the user
	public void browseAuction() {
		//Scanner to take in the 
		
		//needs to retrieve the database
		auctionDB.printItems();
		
		System.out.println(auctionDB.items);
		
		System.out.println("Would you like to go back to the main menu? Y");
		char input1 = sc.next().charAt(0);
		if(input1 == 'Y'){
			printMenu();
		}
	}
	
	public void setupAccount() {
		user = new User();

			
		System.out.println("Set up account: \n"
				+ "Please enter your Username: \n");
		String newUsername = sc.next().toUpperCase();
		//TODO: ADD validation so that duplicates of the username cannot be entered
		System.out.println("Please enter a password: ");
		String newPassword = sc.next();
		auctionDB.users.add(new User(newUsername, newPassword));

		
	}

	public void printMenu(){

		System.out.println("Welcome to the Auction System! Please choose one of the options below\n");
		System.out.println("1. Login into an account");
		System.out.println("2. Browse auction");
		System.out.println("3. Create account");
		System.out.println("4. Exit");
		System.out.println("0. printUsers");
		int input = sc.nextInt();
		
		switch(input) {
		case 0:
			System.out.println(auctionDB.users);
			break;
		case 1: 
			//user accounts will be printed off here. 
			login();
			break;
		case 2: 
			browseAuction();
			break;
		case 3: 
			setupAccount();
			break;
		case 4:
			sc.close();
            System.exit(0);
		}

			
	}
	
	public void login(){
		
		user = new User();
		
		System.out.println("Enter your username: ");
		String username = sc.next().toUpperCase();
		this.found = false;
		while(found == false){
			for(User u :  auctionDB.getUsers() ){
				if(u.checkUsername(username)){
					System.out.println("Enter your password: ");
					String pass = sc.next();
					if(u.checkPassword(pass)){
                        JOptionPane.showMessageDialog(null,"You are now Logged In");
                        //TODO: Present Options (placeBid

						found = true;
					}
					
				}
				
			}
			
		}
		
	}


	private boolean isFound() {
		return found;
	}


	private void setFound(boolean found) {
		this.found = found;
	}
	
}
