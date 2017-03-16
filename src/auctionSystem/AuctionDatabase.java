package auctionSystem;

import java.util.ArrayList;
import java.util.Date;

import users.Buyer;
import users.Item;
import users.Seller;
import users.User;

public final class AuctionDatabase {
	
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<Item> items = new ArrayList<Item>();
    ArrayList<Item> auctions = new ArrayList<Item>();
    
    
    public AuctionDatabase() {
    	
        items.add(new Item ("Google Pixel","its a phone?"));
        items.add(new Item ("Mattress","The bouncy type"));
        items.add(new Item ("Samsung Galaxy Note 7","Now with exploding feautre, This feature will blow you away!"));

        users.add(new Seller ("David", "123"));
        users.add(new Buyer ("Elliot", "321"));
        
      
        
    }
    
    public String printItems() {
    	return items.toString();
    }

    
}
