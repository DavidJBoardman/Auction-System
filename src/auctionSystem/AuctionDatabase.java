package auctionSystem;

import java.util.ArrayList;

import users.Buyer;
import users.Item;
import users.Seller;
import users.User;

public final class AuctionDatabase {
	
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<Item> items = new ArrayList<Item>();
    
    
    public AuctionDatabase() {
    	
        items.add(new Item ("Google Pixel"));
        items.add(new Item ("Mattress"));
        items.add(new Item ("Samsung Galaxy S7"));

        users.add(new Seller ("David", "123"));
        users.add(new Buyer ("Elliot", "321"));
        
    }
    
    public String printItems() {
    	return items.toString();
    }

    
}
