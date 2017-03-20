package auctionSystem;

public class Seller extends User{
	
	public Seller(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	//Check if the user is blocked
	public boolean isBlocked() {
		
		return false; 
	}
	
	//If the user is blocked then they cannot log on
	public void setBlocked() { 
		
	}
}
