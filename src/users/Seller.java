package users;

public class Seller extends User{
	
	public Seller(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	public boolean isBlocked() {
		
		return false; 
	}
	
	public void setBlocked() { 
		
	}
}
