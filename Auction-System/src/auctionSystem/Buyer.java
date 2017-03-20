package auctionSystem;

public class Buyer extends User{

	public Buyer(String username, String password) {
		super(username, password);
	}

	public void victory(Item item) {
		System.out.println("You have won the action on item : " + item);
	}
}

