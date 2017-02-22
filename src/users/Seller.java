package users;

public class Seller extends User{

	public Seller() {
		// TODO Auto-generated constructor stub
		Item item1 = new Item("Banana");
		Item item2 = new Item("A car wheel");
		
	}
	
	public boolean isBlocked() {
		
		return false; 
	}
	
	public void setBlocked() { 
		
	}
}
