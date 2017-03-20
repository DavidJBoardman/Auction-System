package auctionSystem;

import java.util.ArrayList;
import java.util.Date;

public final class AuctionDatabase {
	
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<Item> items = new ArrayList<Item>();
    ArrayList<Auction> auctions = new ArrayList<Auction>();
    
    
    public AuctionDatabase() {
    	
        items.add(new Item ("Google Pixel","its a phone?",32,22));
        items.add(new Item ("Mattress","The bouncy type",32,22));
        items.add(new Item ("Samsung Galaxy Note 7","Now with exploding feautre, This feature will blow you away!",32,22));

        users.add(new Seller ("David", "123"));
        users.add(new Buyer ("Elliot", "321"));
        
       
      
        
    }
    
    public String printItems() {
    	return items.toString();
    }

	ArrayList<User> getUsers() {
		return users;
	}

	private void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	private ArrayList<Item> getItems() {
		return items;
	}

	private void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	private ArrayList<Auction> getAuctions() {
		return auctions;
	}

	private void setAuctions(ArrayList<Auction> auctions) {
		this.auctions = auctions;
	}
    
    

    
}
